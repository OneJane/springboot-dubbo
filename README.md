# zookeeper
docker-compose.yml

```
version: '2'
services:
  zookeeper:
    image: wurstmeister/zookeeper
    ports:
      - "2181:2181"
  kafka:
    image: wurstmeister/kafka
    ports:
      - "9092:9092"
    environment:
      KAFKA_ADVERTISED_HOST_NAME: 10.33.72.81 # 此ip是我自己的内网ip
      KAFKA_ZOOKEEPER_CONNECT: zookeeper:2181
    volumes:
      - /var/run/docker.sock:/var/run/docker.sock
```
# dubbo
https://github.com/apache/dubbo-admin.git
dubbo-admin-server/src/main/resources/application.properties

``` stylus
admin.registry.address=zookeeper://10.33.72.81:2181
admin.config-center=zookeeper://10.33.72.81:2181
admin.metadata-report.address=zookeeper://10.33.72.81:2181
```
cd dubbo-admin-develop && mvn clean package
cd dubbo-admin-distribution/target
java -jar dubbo-admin-0.1.jar
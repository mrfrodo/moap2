Very simple spring booot application demonstrating a rest endpoint.


mvn clean install

mvn spring-boot:run

test it:
curl http://localhost:8080/moap/greeting/

curl http://localhost:8080/moap/actuator/health

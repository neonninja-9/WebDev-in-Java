# Practical 8 — REST microservices
Run in two terminals: `cd product-service && mvn spring-boot:run`, then `cd order-service && mvn spring-boot:run`. Test `http://localhost:8082/orders/101`. Product service runs on 8081; order service calls it over HTTP.

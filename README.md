# eureka-registry
Example Eureka Service Registry implementation.

## Run

The following command will run the registry on the port specified in `application.yml` (8099):

```
mvn spring-boot:run
```

Alternative `application.yml` files can be used with spring profiles, and options can be overridden with command line arguments or an additional properties/yaml file.

The Service Registry can be run on cloud foundry with:

```
mvn clean install
cf push registry -p target/eureka-registry-<version>.jar
```
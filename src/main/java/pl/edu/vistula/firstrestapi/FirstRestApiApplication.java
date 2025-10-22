package pl.edu.vistula.firstrestapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@OpenAPIDefinition(info= @Info(title = "Products api for vistula", version = "1.0",description = "products information"))
@SpringBootApplication
public class FirstRestApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(FirstRestApiApplication.class, args);
    }

}

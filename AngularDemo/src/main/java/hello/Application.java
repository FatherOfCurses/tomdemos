package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// this annotation brings in Spring functionality
@SpringBootApplication
public class Application {
    public static void main(String [] args) {
        SpringApplication.run(Application.class, args);
    }
}

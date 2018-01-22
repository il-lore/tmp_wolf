package it.aegidea.wolf.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = { "it.aegidea.wolf" })
@EntityScan("it.aegidea.wolf.model")
public class Application {
   public static void main(String[] args) {
      SpringApplication.run(Application.class, args);
   }
}

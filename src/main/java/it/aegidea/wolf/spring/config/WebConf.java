package it.aegidea.wolf.spring.config;

import nz.net.ultraq.thymeleaf.LayoutDialect;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Properties;

public class WebConf {

   /**
    * Configures the /webjars path to pick files from the right place
    * @return
    */
   @Bean
   WebMvcConfigurer configurer() {
      return new WebMvcConfigurer() {
         @Override
         public void addResourceHandlers(ResourceHandlerRegistry registry) {
            registry
                    .addResourceHandler("/webjars/**")
                    .addResourceLocations("/webjars/")
                     .resourceChain(false);
         }
      };
   }

   @Bean
   LayoutDialect layoutDialect() {
      return new LayoutDialect();
   }
}

package it.aegidea.wolf.spring.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableJpaRepositories(basePackages = { "it.aegidea.wolf.model.repos" })
@EnableTransactionManagement
public class DbConf {

}

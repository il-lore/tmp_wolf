package it.aegidea.wolf.spring.config;

import it.aegidea.wolf.services.UserDetailsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.annotation.Resource;

@Configuration
@EnableWebSecurity
public class WebSecurityConf extends WebSecurityConfigurerAdapter {

   @Override
   protected void configure(HttpSecurity http) throws Exception {
      http
            .authorizeRequests()
               .antMatchers("/", "/webjars/**").permitAll()
               .antMatchers("/admin").hasRole("ADMIN")
               .anyRequest().authenticated()
               .and()
            .formLogin()
               .loginPage("/login")
               .permitAll()
               .and()
            .logout()
               .permitAll();
   }


   @Bean
   BCryptPasswordEncoder encoder() {
      return new BCryptPasswordEncoder();
   }

   @Autowired
   public void configureGlobal(AuthenticationManagerBuilder auth, UserDetailsService userDetailsService, BCryptPasswordEncoder encoder) throws Exception {
      //auth.userDetailsService(userDetailsService).passwordEncoder(encoder);
      auth.inMemoryAuthentication().withUser("user").password("pass").roles("USER");
   }
}

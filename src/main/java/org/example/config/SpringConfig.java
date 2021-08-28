package org.example.config;

import org.example.AsusRog;
import org.example.IMac;
import org.example.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.example")
public class SpringConfig {
    //@Bean
    //public AsusRog asusRog() {
        //return new AsusRog();
           // }
           @Bean
          public IMac iMac() {
        return new IMac();
            }
    //@Bean
         //   public Person person() {
      // return new Person(asusRog());


  //  }
}

package org.greeting;

import java.util.UUID;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.config.GreetingConfig;


@ApplicationScoped
public class GreetingService {
    
    //A package-private constructor injection. @Inject is optional in this particular case.
    @Inject
    private GreetingConfig greetingConfig;
  

    public String greeting (String name){
        return String.format("Hello %s, your id is %s",
        name, 
        UUID.randomUUID().toString()
        );
    }

    public String greeting() {
        return greetingConfig.getName() 
        + greetingConfig.getSuffix() 
        + " your country is " 
        + greetingConfig.getCountryConfig().getName();
    }

}
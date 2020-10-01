package org.greeting;

import java.util.UUID;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.config.GreetingConfig;
import org.jboss.logging.Logger;


@ApplicationScoped
public class GreetingService {
    
    private static Logger LOGGER = Logger.getLogger(GreetingService.class.getName());

    //A package-private constructor injection. @Inject is optional in this particular case.
    @Inject
    private GreetingConfig greetingConfig;
  

    public String greeting (String name){
        LOGGER.debug("Saying hello to random user");
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
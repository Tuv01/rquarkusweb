package org.greeting;

import java.util.UUID;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GreetingService {
    
    public String greeting (String name){
        return String.format("Hello %s, your id is %s",
        name, 
        UUID.randomUUID().toString()
        );
    }

}
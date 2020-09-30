package org.greeting;

import java.util.UUID;

import javax.enterprise.context.ApplicationScoped;

import org.eclipse.microprofile.config.ConfigProvider;
import org.eclipse.microprofile.config.inject.ConfigProperty;

@ApplicationScoped
public class GreetingService {
    
    //@ConfigProperty(name = "greeting.name")
    //String name;

    @ConfigProperty(name = "greeting.suffix", defaultValue = "!")
    String suffix;

  

    public String greeting (String name){
        return String.format("Hello %s, your id is %s",
        name, 
        UUID.randomUUID().toString()
        );
    }

    public String greeting() {
        final String name = ConfigProvider.getConfig().getValue("greeting.name",String.class);
        return name + suffix;
    }

}
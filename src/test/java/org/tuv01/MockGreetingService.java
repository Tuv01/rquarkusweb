package org.tuv01;


import javax.enterprise.context.ApplicationScoped;

import org.greeting.GreetingService;

import io.quarkus.test.Mock;

@Mock
@ApplicationScoped
public class MockGreetingService extends GreetingService {
    
    public String greeting (String name){
        return String.format("Hello %s, your id is %s",
        name, 
        "1234"
        );
    }

    public String greeting() {
        return "Hello";
    }
}
package org.tuv01;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GreetingService {
    
    public String greeting (String name){
        return "hello" + name;
    }
}
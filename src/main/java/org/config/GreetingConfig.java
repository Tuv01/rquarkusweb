package org.config;

import io.quarkus.arc.config.ConfigProperties;

@ConfigProperties( prefix = "greeting")
public class GreetingConfig {
    
    String name; // greeting.name
    private String suffix = "!"; //greeting.suffix
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }
    
}
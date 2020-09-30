package org.config;

import io.quarkus.arc.config.ConfigProperties;

@ConfigProperties(prefix = "greeting")
public class GreetingConfig {

    private String name; // greeting.name
    private String suffix = "!"; // greeting.suffix
    private CountryConfig countryConfig;

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

    public CountryConfig getCountryConfig() {
        return countryConfig;
    }

    public void setCountryConfig(CountryConfig countryConfig) {
        this.countryConfig = countryConfig;
    }

    public static class CountryConfig {
        String name;
        Integer id;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    }

}
package org.fruits;

public class Fruit {

    public String name;
    public String description;

    public Fruit() {
    }
    public Fruit (String name) {
        this.name = name;
    }
    
    public Fruit(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Fruit [name=" + name + "]";
    }

   
    
}
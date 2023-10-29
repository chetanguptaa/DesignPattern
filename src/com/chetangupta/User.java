package com.chetangupta;

public class User {
    // Field (Attributes)
    public String name; // --> Bad Practice to declare it as public
    public User(String name) {
        this.name = name;
    }

    // Methods
    public void sayHello() {
        System.out.println("Hi, my name is " + this.name);
    }
}

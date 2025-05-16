package com.example;

public class App {
    public static void main(String[] args) {
        // Simple Hello World
        System.out.println("Hello, Maven World!");
        
        // Call greet() with a name parameter
        String message = greet("Alice");
        System.out.println(message);
    }

    public static String greet(String name) {
        return "Hello, " + name + "!";
    }
}
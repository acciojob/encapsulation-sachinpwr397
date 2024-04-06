package com.driver;

public class Main {
    RWOnly obj = new RWOnly();
        // Task 4: Error - The member 'name' is private and cannot be accessed directly
        // System.out.println(obj.name); 
        // Task 6: Error - The member 'name' is private and cannot be accessed directly
        // obj.name = "John"; 
        // System.out.println(obj.name); 
        // These lines would generate errors because 'name' is a private member.
        
        // Task 6: Using setter and getter
        obj.setName("John");
        System.out.println(obj.getName());
}

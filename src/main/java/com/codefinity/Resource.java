package com.codefinity;

public class Resource {
    public void use() {
       //TODO
         System.out.println("Resource is being used by " + Thread.currentThread().getName());
            try {
                Thread.sleep(1000); // Simulate resource usage
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            System.out.println("Resource is released by " + Thread.currentThread().getName());
    }
}

package com.xworkz.Incomplete;

public abstract class Customer {
    String name;
    String email;
    String contact;

    public Customer(String name, String email, String contact) {
        this.name = name;
        this.email = email;
        this.contact = contact;
    }

    public void displayCustomer() {
        System.out.println("Customer: " + name + ", Email: " + email + ", Contact: " + contact);
    }

}

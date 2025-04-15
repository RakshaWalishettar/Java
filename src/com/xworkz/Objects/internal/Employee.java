package com.xworkz.Objects.internal;

public class Employee {
    private String name;
    private char gender;
    private int id;

    public Employee(String name, char gender, int id) {
        this.name = name;
        this.gender = gender;
        this.id = id;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null)
        {
            System.out.println("ref is not null");
            if(obj instanceof Employee)
            {
                System.out.println("ref is beer, will compare...");
                Employee employee1=this;
                Employee employee2=(Employee) obj;//why should i do casting ??
                if(employee1.name.equals(employee2.name) && employee1.gender==employee2.gender )
                {
                    System.out.println("both employee are same");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", gender=" + gender + ", id=" + id + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("Default hash code: " +super.hashCode());
        return 35;
    }
}

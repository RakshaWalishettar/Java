package com.xworkz.Implement.external;

import com.xworkz.Implement.internal.Laptop;
import com.xworkz.Implement.runner.OperatingRunner;

public class OperatingSystem {
private Laptop laptop;

public OperatingSystem(Laptop laptop){
    this.laptop=laptop;
    System.out.println("the Operating system is in laptop");
}
public void machine(){
    System.out.println("the machine is laptop");
    if(this.laptop!=null){
        this.laptop.process();
    }
}
}

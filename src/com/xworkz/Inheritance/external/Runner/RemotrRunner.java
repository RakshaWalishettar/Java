package com.xworkz.Inheritance.external.Runner;

import com.xworks.Inheritance.external.Controller;
import com.xworks.Inheritance.external.RemoteCar;

public class RemotrRunner {
public static void main(String[] args){
    Controller controller=new Controller();
    controller.turnRight();
    controller.turnLeft();
    controller.accelerate();
    controller.stop();
    controller.brake();

    System.out.println("======================================");
    RemoteCar remoteCar=new RemoteCar();
    remoteCar.turnRight();
    remoteCar.turnLeft();
    remoteCar.accelerate();
    remoteCar.brake();
    remoteCar.stop();
}
}

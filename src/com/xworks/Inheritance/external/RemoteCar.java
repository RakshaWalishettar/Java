package com.xworks.Inheritance.external;

public class RemoteCar extends Controller{
    public void remoteCar() {
        System.out.println("RemoteCar is ready to be controlled.");
    }

    {
        super.accelerate();
        System.out.println("RemoteCar is accelerating.");
    }
    {
        super.brake();
        System.out.println("RemoteCar is braking.");
    }
    {
        super.turnLeft();
        System.out.println("RemoteCar is turning left.");
    }
    {
        super.turnRight();
        System.out.println("RemoteCar is turning right.");
    }

    {
        super.stop();
        System.out.println("RemoteCar has stopped.");
    }


}

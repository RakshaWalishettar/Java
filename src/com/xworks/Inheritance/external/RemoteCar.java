package com.xworks.Inheritance.external;

public class RemoteCar extends Controller{
    public RemoteCar() {
        System.out.println("RemoteCar is ready to be controlled.");
    }
    @Override
    public void accelerate(){
        System.out.println("RemoteCar is accelerating.");
    }@Override
    public void brake(){
        System.out.println("RemoteCar is braking.");
    }@Override
    public void turnLeft(){
        System.out.println("RemoteCar is turning left.");
    }@Override
    public void turnRight(){
        System.out.println("RemoteCar is turning right.");
    }
    @Override
    public void stop(){
        System.out.println("RemoteCar has stopped.");
    }


}

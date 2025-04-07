package com.xworks.Inheritance.external;

public class CleaningRobo extends Robot{
    public void washing() {
        System.out.println("the robot will clean");
    }

        public void moves(Robot robot){
        robot.walk();
        robot.recognizeVoice();
        robot.talk();
        robot.performTask();
        robot.recharge();


        if(robot instanceof CleaningRobo){
            CleaningRobo robot1=(CleaningRobo) robot;
            System.out.println("the instance robo which cleans");
            robot1.washing();
        }
    }
}

package com.xworkz.Inheritance.external.Runner;

import com.xworks.Inheritance.external.Reptile;
import com.xworks.Inheritance.external.Snake;

public class SnakeRunner {
    public static void main(String[] args){
        Snake snake=new Snake();
        snake.sleep();
        snake.regulate_temperature();
        snake.move();
        snake.shed_skin();
        snake.eat();

        System.out.println("=========================================");
        Reptile reptile=new Reptile();
        reptile.eat();
        reptile.shed_skin();
        reptile.eat();
        reptile.sleep();
        reptile.regulate_temperature();
    }
}

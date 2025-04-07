package com.xworks.Inheritance.external;

public class Nail extends Tool{
    public void size(){
        System.out.println("the nail has differnt size");
    }
    public void beat(Tool tool){
        tool.use();
        tool.carry();
        tool.maintain();
        tool.repair();
        tool.store();

        if(tool instanceof Nail){
            Nail nail=(Nail) tool;
            System.out.println("thr instance of the nail is tool");
        }

    }
}

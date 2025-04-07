package com.xworks.Inheritance.external;

public class Stadium extends Player{
    public void field(){
        System.out.println("the stadium has the field");
    }
    public void hit(Player player){
        player.rest();
        player.followRules();
        player.rest();
        player.compete();
        player.train();

        if(player instanceof Stadium){
            Stadium stadium=new Stadium();
            System.out.println("Stadium instance of the player");
            stadium.field();
        }
    }
}

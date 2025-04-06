package com.xworks.Inheritance.external;

public class TeddyBear extends Toy{
    public TeddyBear() {
        System.out.println("TeddyBear is created.");
    }
    @Override
    public void hug(){
        System.out.println("TeddyBear gives a warm hug!");
    }
    @Override
    public void squeeze(){
        System.out.println("TeddyBear is being gently squeezed.");
    }
    @Override
    public void wash(){
        System.out.println("TeddyBear is being washed with care.");
    }
    @Override
    public void sitUpright(){
        System.out.println("TeddyBear is sitting upright on the shelf.");
    }
    @Override
    public void decorateRoom(){
        System.out.println("TeddyBear is decorating the room beautifully.");
    }

}

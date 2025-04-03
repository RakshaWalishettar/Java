package com.xworks.Inheritance.external;

public class TeddyBear extends Toy{
    public void teddyBear() {
        System.out.println("TeddyBear is created.");
    }
    {
        super.hug();
        System.out.println("TeddyBear gives a warm hug!");
    }
    {
        super.squeeze();
        System.out.println("TeddyBear is being gently squeezed.");
    }
    {
        super.wash();
        System.out.println("TeddyBear is being washed with care.");
    }
    {
        super.sitUpright();
        System.out.println("TeddyBear is sitting upright on the shelf.");
    }
    {
        super.decorateRoom();
        System.out.println("TeddyBear is decorating the room beautifully.");
    }

}

package com.xworks.Inheritance.external;

public class Ak47 extends Weapon{
    public void heavy(){
        System.out.println("the weapon id heavy");
    }
    public void bullet(Weapon weapon){
        weapon.load();
        weapon.aim();
        weapon.shoot();
        weapon.reload();
        weapon.safetyLock();

        if(weapon instanceof Ak47){
            Ak47 ak47=(Ak47) weapon;
            System.out.println("the instance of weapon is Ak47");
            ak47.heavy();
        }
    }
}

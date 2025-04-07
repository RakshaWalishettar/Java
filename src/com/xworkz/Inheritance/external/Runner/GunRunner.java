package com.xworkz.Inheritance.external.Runner;

import com.xworks.Inheritance.external.Ak47;
import com.xworks.Inheritance.external.Gun;
import com.xworks.Inheritance.external.Weapon;

public class GunRunner {
    public static void main(String[] args) {
        Gun gun = new Gun();
        gun.safetyLock();
        gun.reload();
        gun.shoot();
        gun.load();
        gun.aim();

        System.out.println("===================================");
        Weapon weapon  = new Weapon();
        weapon.safetyLock();
        weapon.shoot();
        weapon.reload();
        weapon.aim();
        weapon.load();

        System.out.println("==========================================");
        Ak47 ak47=new Ak47();
        ak47.bullet(weapon);
        ak47.bullet(ak47);
    }
}

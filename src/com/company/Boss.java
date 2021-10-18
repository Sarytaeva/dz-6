package com.company;

public class Boss extends GameEntity {
    public  String printInfo(){
        String a = "a";
        System.out.println("weapon:"+weapon.getGun() + ", damage:" + getDamage()+", age:" + getAge()+", health:" + getHealth());
    return a;
    }

    Weapon weapon= new Weapon();

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;

    }
}

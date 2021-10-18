package com.company;

public class Main {


    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setDamage(50);
        boss.setAge(40);
        boss.setHealth(100);
        boss.weapon.setGun("magnum");
        boss.printInfo();
        Skeleton skeleton= new Skeleton();
        skeleton.setDamage(30);
        skeleton.setAge(27);
        skeleton.setHealth(90);
        skeleton.weapon.setGun("bow");
        skeleton.setNumberOfArrow(70);

        Skeleton skeleton2= new Skeleton();
        skeleton2.setDamage(35);
        skeleton2.setAge(28);
        skeleton2.setHealth(99);
        skeleton2.weapon.setGun("огненый лук");
        skeleton2.setNumberOfArrow(70);

        skeleton.printInfo();
        skeleton2.printInfo();




        // write your code here
    }
}

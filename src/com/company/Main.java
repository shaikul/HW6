package com.company;

public class Main {

    public static void main(String[] args) {
        Boss Tanos = new Boss();
        Tanos.setHelth(600);
        Tanos.setDamage(70);
        Tanos.kalash.setWeaponName("Калашников");
        Tanos.kalash.setWeaponType("Автомат");



        System.out.println("Здровье" + Tanos.getHelth()+" "+"Урон" + Tanos.getDamage()+ " "+ Tanos.kalash.getWeaponName()+
                " "+ Tanos.kalash.getWeaponType());



    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_4;

/**
 *
 * @author LENOVO
 */
public class MainEnemy {
    public static void main(String[] args) {
        Enemy monster = new Enemy();
        System.out.println("Monster akan menyerang saat melihat pemain" );  
        monster.attack();
        
        Zombie zumbi = new Zombie();
        zumbi.name = "Zoro";
        System.out.println("\nNama Zombie : " + zumbi.name);
        zumbi.hp = 2000;
        System.out.println("Health Poin Zombie : " + zumbi.hp);
        zumbi.attackPoin = 70;
        System.out.println("Attack Poin Zombie : " + zumbi.attackPoin);
        zumbi.attack();
        zumbi.walk();
        
        Pocong hantuPocong = new Pocong();
        hantuPocong.name = "Poci";
        System.out.println("\nNama Pocong : " + hantuPocong.name);
        hantuPocong.hp = 1500;
        System.out.println("Health Poin Pocong : " + hantuPocong.hp);
        hantuPocong.attackPoin = 55;
        System.out.println("Attack Poin Pocong : " + hantuPocong.attackPoin);
        hantuPocong.attack();
        hantuPocong.jump();
        
        Burung garuda = new Burung ();
        garuda.name = "Winnie";
        System.out.println("\nNama Burung : " + garuda.name);
        garuda.hp = 2500;
        System.out.println("Health Poin Burung : " + garuda.hp);
        garuda.attackPoin = 40;
        System.out.println("Attack Poin Burung : " + garuda.attackPoin);
        garuda.attack();
        garuda.walk();
        garuda.jump();
        garuda.fly();
    }
}

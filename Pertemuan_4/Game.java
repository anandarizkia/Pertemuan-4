/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_4;

/**
 *
 * @author LENOVO
 */
public class Game {
        public static void main(String[] args) {
        Enemy monster = new Enemy();
        Zombie zumbi = new Zombie();
        Pocong hantuPocong = new Pocong();
        Burung garuda = new Burung();

        monster.attack();
        zumbi.walk();
        hantuPocong.jump();
        garuda.walk();
        garuda.jump();
        garuda.fly();
    }
}
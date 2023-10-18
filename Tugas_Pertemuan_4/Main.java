/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_Pertemuan_4;

/**
 *
 * @author LENOVO
 */
public class Main {
    public static void main(String[] args) {
        Burung burung = new Burung();
        
        burung.bersuara("Elang");
        Elang elang = new Elang();
        elang.Suara();
        
        burung.bersuara("Merpati");
        Merpati merpati = new Merpati();
        merpati.Suara();
        
        burung.bersuara("Murai");
        Murai murai = new Murai();
        murai.Suara();
    }
}

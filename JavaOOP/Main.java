/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaOOP;

/**
 *
 * @author LENOVO
 */
public class Main {
    public static void main(String[] args) {
        
        // membuat objek bangun datar
        BangunDatar bangunDatar = new BangunDatar();
        
        // Persegi 
        Persegi persegi = new Persegi();
        persegi.sisi = 5;
        
        // Lingkaran 
        Lingkaran lingkaran = new Lingkaran();
        lingkaran.r = 22;
        
        // Persegi Panjang 
        PersegiPanjang persegiPanjang = new PersegiPanjang();
        persegiPanjang.panjang = 8;
        persegiPanjang.lebar = 4;
        
        // Segitiga 
        Segitiga segitiga = new Segitiga();
        segitiga.alas = 12;
        segitiga.tinggi = 8;
        
        
        // memanggil method luas dan keliling
        bangunDatar.luas();
        bangunDatar.keliling();
        
        persegi.luas();
        persegi.keliling();
        
        persegiPanjang.luas();
        persegiPanjang.keliling();
        
        segitiga.luas();
        segitiga.keliling();
        
        lingkaran.luas();
        lingkaran.keliling();
    }
}
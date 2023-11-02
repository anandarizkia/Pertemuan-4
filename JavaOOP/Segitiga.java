/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaOOP;

/**
 *
 * @author LENOVO
 */
public class Segitiga extends BangunDatar {
    float alas; //sisi C
    float tinggi;
    float sisiA;
    float sisiB;
    
    @Override
    float luas() {
        float luas = (float) (0.5 * (alas * tinggi));
        System.out.println("Luas Segitiga: " + luas);
        return luas;
    } 
    
       @Override
    float keliling(){
        float keliling = alas + sisiA + sisiB; //atau sisi A + sisi B + sisi C
        System.out.println("Keliling Segitiga: " + keliling);
        return keliling;
    }
}

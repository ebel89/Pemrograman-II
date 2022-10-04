/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hello.world.Praktikum1;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class PRAK105_2110817310008_MuhammadKhaliqTeukuAnsari {
    public static void main(String[]args){
        float r2, t, v;
        final float phi=3.14f;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jari-jari: ");
        r2 = input.nextFloat();
        
        System.out.print("Masukkan tinggi: ");
        t = input.nextFloat();
        
        v = phi * r2 * r2 * t;
        
        System.out.printf("Volume tabung dengan jari-jari %.1f cm dan tinggi %.1f cm adalah %.3f m3\n", r2, t, v);
        
    }
}

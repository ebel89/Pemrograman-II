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
public class PRAK104_2110817310008_MuhammadKhaliqTeukuAnsari {
    public static void main(String[]args){
        int kartuAndi1,kartuAndi2,kartuAndi3, kartuBudi1, kartuBudi2, kartuBudi3, poinAndi=0, poinBudi=0;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Kartu Andi: ");
        kartuAndi1 = keyboard.nextInt(); 
        kartuAndi2 = keyboard.nextInt();
        kartuAndi3 = keyboard.nextInt();
        keyboard.nextLine();// ditutup agar menyimpan nilai dulu
        
        
        System.out.print("Kartu Budi: ");
        kartuBudi1 = keyboard.nextInt();
        kartuBudi2 = keyboard.nextInt();
        kartuBudi3 = keyboard.nextInt();
        keyboard.nextLine();//ditutup agar menyimpan nilai dulu
        
        //memeriksa kartu yang dipilih jika ada 1 atau lebih dari 10
        if((kartuAndi1 >=2 && kartuBudi1 <= 10) && (kartuAndi2 >= 2 && kartuBudi2 <=10) && (kartuAndi3 >=2 && kartuBudi3 <=10)){
            // masuk kan nilai hasil menang ke poin
            if(kartuAndi1 > kartuBudi1) poinAndi = poinAndi + 1;
            else if(kartuAndi1 < kartuBudi1) poinBudi = poinBudi + 1;
            
            if(kartuAndi2 > kartuBudi2) poinAndi = poinAndi + 1;
            else if(kartuAndi2 < kartuBudi2)  poinBudi = poinBudi + 1;
            
            if(kartuAndi3 > kartuBudi3) poinAndi = poinAndi + 1;
            else if (kartuAndi3 < kartuBudi3) poinBudi = poinBudi + 1;
            
            //membandingkan nilai antara Andi dan Budi
            if(poinAndi > poinBudi) System.out.println("Andi");
            else if(poinAndi < poinBudi)System.out.println("Budi");
            else System.out.println("Seri");
        }
        else{
            System.out.println("Kartu yang dimasukkan salah");
        }
        keyboard.close();
    }
}

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
public class PRAK103_2110817310008_MuhammadKhaliqTeukuAnsari {
     public static void main(String[]args){
        int inputUser, i=0;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("");
        inputUser = keyboard.nextInt();
        
        do{
            if(inputUser % 7 == 0){
                System.out.print(" ");
            }
            else{
                System.out.print(inputUser+ " ");
            }
            inputUser--;
            i++;
        }
        while(i < 5);
    }
}

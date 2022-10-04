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
public class PRAK102_2110817310008_MuhammadKhaliqTeukuAnsari {
    public static void main(String[]args){
        int inputUser, i=0, hasil;
        
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("");
        inputUser = keyboard.nextInt();
        
        while(i < 7){
            if(inputUser % 2 == 0){
                hasil = (inputUser / 2) - 1;
                System.out.printf(" %d ", hasil);
            }
            else{
                System.out.print(inputUser);
            }
            inputUser++;
            i++;
        }
    }
}

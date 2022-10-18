/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PRAK_201_2110817310008_MuhammadKhaliqTeukuAnsari;

/**
 *
 * @author LENOVO
 */
public class Mangga {
    String nama;
    String warna;
    String tekstur;
    String rasa;
    float berat;
    int harga;
    int jumlahBeli;
    float totalBerat;
    int totalHarga;
    
    public Mangga(String nama, String warna, String tekstur,String rasa, int harga, float berat, int jumlahBeli){
        this.nama = nama;
        this.warna = warna;
        this.tekstur = tekstur;
        this. rasa = rasa;
        this.harga = harga;
        this.berat = berat;
        this.jumlahBeli = jumlahBeli;
    }
    public int totalHarga(){
        this.totalHarga = jumlahBeli * harga;
        return totalHarga;
    }

    public float totalBerat(){
        this.totalBerat = berat * jumlahBeli;
        return totalBerat;
    }
    public void tampilkan(){
        System.out.println("Nama Mangga: " + nama);
        System.out.println("Berat: " + berat + " kg");
        System.out.println("Jumlah Beli: " + jumlahBeli);
        System.out.println("Total Berat: " + totalBerat() + " kg");
        System.out.println("Total Harga: Rp" + totalHarga() + "\n");
    }
}

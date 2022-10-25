package praktikum3.soal2;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        HashMap<Integer, String> bulan = new HashMap<>();
        bulan.put(1, "Januari");
        bulan.put(2, "Februari");
        bulan.put(3, "Maret");
        bulan.put(4, "April");
        bulan.put(5, "Mei");
        bulan.put(6, "Juni");
        bulan.put(7, "Juli");
        bulan.put(8, "Agustus");
        bulan.put(9, "September");
        bulan.put(10, "Oktober");
        bulan.put(11, "November");
        bulan.put(12, "Desember");

        LinkedList<Negara> negara = new LinkedList<>();
        Scanner input = new Scanner(System.in);
        int angka = input.nextInt();

        input.nextLine();
        for (int i = 0; i < angka; i++) {
            String nama = input.nextLine();
            String jenisKepemimpinan = input.nextLine();
            String namaPemimpin = input.nextLine();
            if (jenisKepemimpinan.equalsIgnoreCase("Monarki")) {
                negara.add(new Negara(nama, jenisKepemimpinan, namaPemimpin));
                System.out.println("");
            } else {
                int tanggalKemerdekaan = input.nextInt();
                int bulanKemerdekaan = input.nextInt();
                bulan.get(bulanKemerdekaan);
                int tahunKemerdekaan = input.nextInt();
                input.nextLine();
                negara.add(new Negara(nama, jenisKepemimpinan, namaPemimpin, tanggalKemerdekaan, bulanKemerdekaan, tahunKemerdekaan));
                System.out.println("");
            }
        }

        for (int j = 0; j < angka; j++) {
            if (negara.get(j).getJenisKepemimpinan().equalsIgnoreCase("Monarki")) {
                System.out.printf("Negara %s mempunyai Raja bernama %s\n",negara.get(j).getNama(), negara.get(j).getNamaPemimpin());
                System.out.println("");
            } else{
                System.out.printf("Negara %s mempunyai %s bernama %s\n", negara.get(j).getNama(), negara.get(j).toTitleCase(negara.get(j).getJenisKepemimpinan()), negara.get(j).getNamaPemimpin());
                System.out.printf("Deklarasi Kemerdekaan pada Tanggal %d %s %d\n", negara.get(j).getTanggalKemerdekaan(), bulan.get(negara.get(j).getBulanKemerdekaan()), negara.get(j).getTahunKemerdekaan());
                System.out.println("");
            }
        }
    }
}

package praktikum4.soal1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String judul;
        String penulis;
        int tahun;

        Scanner input = new Scanner(System.in);

        System.out.printf("Judul: ");
        judul = input.nextLine();
        System.out.printf("Penulis: ");
        penulis = input.nextLine();
        System.out.printf("Tahun Terbit: ");
        tahun = input.nextInt();

        Buku buku1 = new Buku(judul, penulis, tahun);

        buku1.display();
    }
}
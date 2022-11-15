package praktikum4.soal2;

import java.util.Scanner;

public class Main {
    public static void main(String [] args){

        int pilihan = 0;
        String judul;
        String penulis;
        String genre;
        String sinopsis;
        String tahun;
        int volume;

        do{
        System.out.println("Pilih buku yang ingin diinputkan:");
        System.out.println("1 = Novel");
        System.out.println("2 = Komik");
        Scanner input = new Scanner(System.in);

        System.out.printf("Masukkan Pilihan: ");

        pilihan = input.nextInt();
            if(pilihan == 1){
                input.nextLine();
                System.out.printf("Judul: ");
                judul = input.nextLine();

                System.out.printf("Penulis: ");
                penulis = input.nextLine();

                System.out.printf("Tahun Terbit: ");
                tahun = input.nextLine();

                System.out.printf("Genre: ");
                genre = input.nextLine();

                System.out.printf("Sinopsis: ");
                sinopsis = input.nextLine();
                System.out.println("");

                Novel n = new Novel(judul, penulis, tahun, genre, sinopsis );
                n.display();
                System.out.println(n.getNovelDetail());
            }else if(pilihan == 2){
                input.nextLine();
                System.out.printf("Judul: ");
                judul = input.nextLine();

                System.out.printf("Penulis: ");
                penulis = input.nextLine();

                System.out.printf("Tahun Terbit: ");
                tahun = input.nextLine();

                System.out.printf("Volume: ");
                volume = input.nextInt();

                input.nextLine();
                System.out.printf("Sinopsis: ");
                sinopsis = input.nextLine();
                System.out.println("");

                Komik k = new Komik(judul, penulis, tahun, volume, sinopsis);
                k.display();
                System.out.println(k.getKomikDetail());
            }else{
                System.out.println("==================");
                System.out.println("Tidak ada pilihan");
                System.out.println("Memilih kembali");
                System.out.println("==================");
            }
        }while(pilihan >2 || pilihan <1);
    }
}

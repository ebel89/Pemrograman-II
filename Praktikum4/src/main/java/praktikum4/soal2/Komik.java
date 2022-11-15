package praktikum4.soal2;

public class Komik extends Buku{
    private int volume;
    private String sinopsis;

    public Komik(String j, String p, String t, int v, String s){
        judul = j;
        penulis = p;
        tahun = Integer.parseInt(t);
        volume = v;
        sinopsis = s;
    }

    public String getKomikDetail(){
        return "Sebuah komik dengan judul \"" + this.judul + "\". Komik tersebut dibuat oleh " + penulis + " dan diterbitkan pada tahun " + tahun + ". Sampai saat ini komik tersebut memiliki jumlah volume sebanyak " + volume + " buah.\n" + "Sinopsis: " + sinopsis.substring(0, 64) + "...";
    }

}

package praktikum4.soal1;

public class Buku {
    private String judul;
    private String penulis;
    private int tahun;

    public Buku(String j, String p, int t){
        this.judul = j;
        this.penulis = p;
        this.tahun = t;
    }

    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public int getTahun() {
        return tahun;
    }

    public void display(){
        System.out.println("Detail Buku:");
        System.out.printf("Judul adalah %s\n", judul);
        System.out.printf("Penulis adalah %s\n", penulis);
        System.out.printf("Tahun Terbit adalah %d", tahun);
    }

}

package praktikum4.soal2;

public class Novel extends Buku {
    private String genre;
    private String sinopsis;

    public Novel(String j, String p, String t, String g, String s) {
        judul = j;
        penulis = p;
        tahun = Integer.parseInt(t);
        genre = g;
        sinopsis = s;
    }

    public String getNovelDetail() {
        return "Sebuah Novel bergenre " + genre.substring(0, 1).toUpperCase() + genre.substring(1) + " dengan judul \""
                + judul + "\". Novel tersebut ditulis oleh " + penulis + " dan diterbitkan pada tahun " + tahun + ".\n"
                + "Sinopsis: " + sinopsis.substring(0, 59) + "...";
    }

}

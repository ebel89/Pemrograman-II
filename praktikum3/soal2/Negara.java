package praktikum3.soal2;

public class Negara {
    private String nama;
    private String jenisKepemimpinan;
    private String namaPemimpin;
    private int tanggalKemerdekaan;
    private int bulanKemerdekaan;
    private int tahunKemerdekaan;
    public String toTitleCase(String input) {
        StringBuilder titleCase = new StringBuilder(input.length());
        boolean nextTitleCase = true;

        for (char c : input.toCharArray()) {
            if (Character.isSpaceChar(c)) {
                nextTitleCase = true;
            } else if (nextTitleCase) {
                c = Character.toTitleCase(c);
                nextTitleCase = false;
            }

            titleCase.append(c);
        }

        return titleCase.toString();
    }

    public Negara(String nama, String jenisKepemimpinan, String namaPemimpin, int tanggalKemerdekaan, int bulanKemerdekaan, int tahunKemerdekaan){
        this.setNama(nama);
        this.setJenisKepemimpinan(jenisKepemimpinan);
        this.setNamaPemimpin(namaPemimpin);
        this.setTanggalKemerdekaan(tanggalKemerdekaan);
        this.setBulanKemerdekaan(bulanKemerdekaan);
        this.setTahunKemerdekaan(tahunKemerdekaan);
    }

    public Negara (String nama, String jenisKepemimpinan, String namaPemimpin){
        this.setNama(nama);
        this.setJenisKepemimpinan(jenisKepemimpinan);
        this.setNamaPemimpin(namaPemimpin);
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenisKepemimpinan() {
        return jenisKepemimpinan;
    }

    public void setJenisKepemimpinan(String jenisKepemimpinan) {
        this.jenisKepemimpinan = jenisKepemimpinan;
    }

    public String getNamaPemimpin() {
        return namaPemimpin;
    }

    public void setNamaPemimpin(String namaPemimpin) {
        this.namaPemimpin = namaPemimpin;
    }

    public int getTanggalKemerdekaan() {
        return tanggalKemerdekaan;
    }

    public void setTanggalKemerdekaan(int tanggalKemerdekaan) {
        this.tanggalKemerdekaan = tanggalKemerdekaan;
    }

    public int getBulanKemerdekaan() {
        return bulanKemerdekaan;
    }

    public void setBulanKemerdekaan(int bulanKemerdekaan) {
        this.bulanKemerdekaan = bulanKemerdekaan;
    }

    public int getTahunKemerdekaan() {
        return tahunKemerdekaan;
    }

    public void setTahunKemerdekaan(int tahunKemerdekaan) {
        this.tahunKemerdekaan = tahunKemerdekaan;
    }
}

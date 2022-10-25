package praktikum3.soal1;

public class Dadu {
    private int nilaiDadu;
    public int acakNilai() {
        return nilaiDadu = (int)(Math.random()*(6+1-1)+1);
    }

    public int getAngka() {
        return nilaiDadu;
    }


}
package praktikum3.soal1;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int total = 0;
        Scanner input = new Scanner(System.in);
        LinkedList<Dadu> dadu = new LinkedList<>();
        int masuk = input.nextInt();

        for (int i = 0; i <= masuk; i++){
            dadu.add(new Dadu());
            dadu.getLast().acakNilai();
        }
        for (int j = 1; j < dadu.size(); j++){
            System.out.printf("Dadu ke-%d bernilai %d\n", j, dadu.get(j).getAngka());
            total += dadu.get(j).getAngka();

        }
        System.out.println("Total nilai keseluruhan " + total);
    }
}

package Semester1.Modul4;
import java.util.Scanner;

public class Tugas {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukan Gaji Pokok: Rp");
        float gp = in.nextFloat();
        float tunjangan = gp * 0.2f;
        System.out.println("Gaji Tunjangan: Rp"+tunjangan);
        float tunjanganlain = gp * 0.1f;
        System.out.println("Gaji Tunjangan Lain: Rp"+tunjanganlain);
        float total = gp + tunjangan + tunjanganlain;
        System.out.println("Total Gaji Yang di Dapatkan: Rp"+total);

        in.close();
    }
}

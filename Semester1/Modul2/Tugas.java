package Semester1.Modul2;
import java.util.Scanner;


public class Tugas {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double spa;
        double angsuran1 = 0.40;
        double angsuran2 = 0.30;
        double angsuran3 = 0.20;
        double angsuran4 = 0.10;
        System.out.print("Masukan Besara SPA: ");
        spa = in.nextDouble();
        angsuran1 = spa * angsuran1;
        angsuran2 = spa * angsuran2;
        angsuran3 = spa * angsuran3;
        angsuran4 = spa * angsuran4;
        System.out.println("Angsuran 1: " +angsuran1);
        System.out.println("Angsuran 2: " +angsuran2);
        System.out.println("Angsuran 3: " +angsuran3);
        System.out.println("Angsuran 4: " +angsuran4);

        in.close();
    }
}

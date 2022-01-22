package Semester1.Modul14;
import java.util.Scanner;

public class Tugas {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukan a: ");
        int a = in.nextInt();
        System.out.print("Masukan b: ");
        int b = in.nextInt();
        System.out.print("Masukan c: ");
        int c = in.nextInt();
        int D = b * b - 4 * a * c;
        if (D > 0) {
            System.out.println("Bilangan real: "+D+" > 0");
        } else {
            if (D == 0) {
                System.out.println("Bilangan kembar: "+D+" == 0");
            } else {
                System.out.println("Bilangan kompleks: "+D+" < 0");
            }
        }
        in.close();
    }
}

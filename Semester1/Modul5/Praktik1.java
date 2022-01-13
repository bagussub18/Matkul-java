package Semester1.Modul5;
import java.util.Scanner;

public class Praktik1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan Bilangan Angka: ");
        int bil = input.nextInt();
        if (bil == 0) {
            System.out.println("Bilangan 0");
        } else {
            System.out.println("Bukan Bilangan 0");
        }

        input.close();
    }
}

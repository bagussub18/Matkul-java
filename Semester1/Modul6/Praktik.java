package Semester1.Modul6;
import java.util.Scanner;

public class Praktik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan Angka Bilangan: ");
        int bil = input.nextInt();
        bil = bil % 2;
        switch (bil) {
            case 0:
                System.out.println("Bilangan Genap;");
                break;
            case 1:
                System.out.println("Bilangan Ganjil");
                break;
            default:
                System.out.println("Salan Input");
                break;
        }

        input.close();
    }
}

package Semester1.Modul5;
import java.util.Scanner;

public class Praktik3 {
    public static void main(String[] args) {
        Scanner sys = new Scanner(System.in);

        System.out.print("Masukan Umur Anda: ");
        int umur = sys.nextInt();
        if (umur <= 5) {
            System.out.println("Balita");
        } else { if (umur > 5 && umur <= 11) {
            System.out.println("Kanak-kanak");
        } else { if (umur > 11 && umur <= 25) {
            System.out.println("Remaja");
        } else {
            System.out.println("Dewasa");
                }
            }
        }

        sys.close();
    }
}

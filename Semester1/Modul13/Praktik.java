package Semester1.Modul13;
import java.util.Scanner;

public class Praktik {
    public static void main(String[]args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Cetak Bilngan Bulat, Cacah, atau Prima: ");
        String bilangan = in.nextLine();
        if (bilangan.equalsIgnoreCase("bulat")) {
            for (int a = -5; a <= 5; a++) {
                System.out.print(a+", ");
            }
        } else {
            if (bilangan.equalsIgnoreCase("Cacah")) {
                int a = 0;
                while (a <= 10) {
                    System.out.print(a+", ");
                    a++;
                }
                System.out.print(" ..... n");
            } else {
                if (bilangan.equalsIgnoreCase("Prima")) {
                    int a = 2;
                    do {
                        if (a == 2 | a == 3 | a == 5) {
                            System.out.print(a+", ");
                        } else {
                            if (a % 3 == 0 | a % 2 == 0 | a % 5 == 0) {
                                //pada state ini menetukan bilangan bukan prima dari angka 6 dst...
                            } else {
                                //pada state ini setelah menetukan bilangan bukan prima, maka selain itu adalah bilangan prima
                                System.out.print(a+", ");
                            }
                        }
                        a++;
                    } while (a <= 100);
                } else {
                    System.out.println("Salah Input");
                }
            }
        }
        in.close();
    }
}

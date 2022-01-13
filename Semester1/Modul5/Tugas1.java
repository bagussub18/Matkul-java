package Semester1.Modul5;
import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner tug1 = new Scanner(System.in);

        System.out.print("Masukan Bilangan 1: ");
        int bil1 = tug1.nextInt();
        System.out.print("Masukan Bilangan 2 ");
        int bil2 = tug1.nextInt();
        System.out.print("Masukan Bilangan 3: ");
        int bil3 = tug1.nextInt();
        if (bil1 < bil2 && bil1 < bil3 && bil2 > bil3) {
            System.out.println("Bilangan Terkecil: "+bil1);
            System.out.println("Bilangan Terbesar: "+bil2);
        } else {
            if (bil2 < bil3 && bil1 < bil2) {
                System.out.println("Bilangan Terkecil: "+bil1);
                System.out.println("Bilangan Terbesar: "+bil3);
            } else {
                if (bil1 > bil2 && bil1 > bil3 && bil2 < bil3) {
                    System.out.println("Bilangan Terkecil: "+bil2);
                    System.out.println("Bilangan Terbesar: "+bil1);
                } else {
                    if (bil2 > bil3 && bil1 > bil2) {
                        System.out.println("Bilangan Terkecil: "+bil3);
                        System.out.println("Bilangan Terbesar: "+bil1);
                    } else {
                        if (bil2 > bil3) {
                            System.out.println("Bilangan Terkecil: "+bil3);
                            System.out.println("Bilangan Terbesar: "+bil2);
                        } else {
                            System.out.println("Bilangan Terkecil15: "+bil2);
                            System.out.println("Bilangan Terbesar: "+bil3);
                        }
                    }
                }
            }
        }

        tug1.close();
    }
}

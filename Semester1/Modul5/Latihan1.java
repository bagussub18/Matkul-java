package Semester1.Modul5;
import java.util.Scanner;

public class Latihan1 {
    public static void main(String[] args) {
        Scanner lat1 = new Scanner(System.in);

        System.out.print("Masukan IPK Anda: ");
        float ipk = lat1.nextFloat();
        if (ipk < 2.75) {
            System.out.println("Kurang Memuaskan");
        } else {
            if (ipk > 2.74 && ipk < 3.00) {
                System.out.println("Memuaskan");
                } else {
                    if (ipk > 2.99 && ipk <= 3.50) {
                        System.out.println("Sangat Memuaskan");
                    } else {
                        if (ipk > 3.50 && ipk <= 4.00) {
                            System.out.println("Dengan Pujian");
                        } else {
                            System.out.println("Salah Input IPK");
                        }
                    }
                }
            }

        lat1.close();
    }
}

package Semester2.Modul1;
import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("------------------------------------------");
        System.out.print("Pilih Motor/Mobil: ");
        String a = in.nextLine();
        if (a.equalsIgnoreCase("Mobil")) {
            System.out.println("Mobil: Honda/Suzuki");
        } else {
            if (a.equalsIgnoreCase("motor")) {
                System.out.println("Motor: Honda/Yamaha: ");
            }
        }
        System.out.print("Pilih merk: ");
        String merk = in.nextLine();
        System.out.println("------------------------------------------");
        if (a.equalsIgnoreCase("mobil")) {
            if (merk.equalsIgnoreCase("honda")) {
                System.out.println("Jazz: Rp170.000.000");
                System.out.println("Brio: Rp 120.000.000");
                System.out.println("Mobilio: Rp170.000.000");
            } else {
                if (merk.equalsIgnoreCase("suzuki")) {
                    System.out.println("APV: Rp180.000.000");
                    System.out.println("Swift: Rp155.000.000");
                    System.out.println("Ertiga: Rp160.000.000");
                } else {
                    System.out.println("Salah Input");
                }
            }
        } else {
            if (a.equalsIgnoreCase("motor")) {
                if (merk.equalsIgnoreCase("honda")) {
                    System.out.println("Vario: Rp15.000.000");
                    System.out.println("Supra: RP12.000.000");
                } else {
                    if (merk.equalsIgnoreCase("yamaha")) {
                        System.out.println("Mio: 14.000.000\nVixion: 20.000.000");
                    } else {
                        System.out.println("Salah Input");
                    }
                }
            } else {
                System.out.println("Salah Input");
            }
        }
        in.close();
    }
}

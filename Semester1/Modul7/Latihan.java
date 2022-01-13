package Semester1.Modul7;
import java.util.Scanner;

public class Latihan {
    public static void main(String[] args) {
        Scanner sys = new Scanner(System.in);

        String merk;
        System.out.println("Masukan Jenis Kendaraan");
        System.out.println("1. Mobil | 2. Motor");
        System.out.print("Pilih 1 atau 2: ");
        byte pil = sys.nextByte();
        sys.nextLine();
        if (pil == 1) {
            System.out.println("Pilih Jenis Mobil");
            System.out.println("Jazz | Brio | Mobilio");
            System.out.print("Ketik Pilihan Anda: ");
            merk = sys.nextLine();
            if (merk.equalsIgnoreCase("jazz")) {
                System.out.println("Harga Mobil Jazz: Rp170.000.000,00");
            } else {
                if (merk.equalsIgnoreCase("brio")) {
                    System.out.println("Harga Mobil Brio: Rp120.000.000,00");
                } else {
                    if (merk.equalsIgnoreCase("mobilio")) {
                        System.out.println("Harga Mobil Mobilio: Rp170.000.000,00");
                    } else {
                        System.out.println("Salah Input Merk");
                    }
                }
            }
        } else {
            if (pil == 2) {
                System.out.println("Masukan Jenis Motor");
                System.out.println("Vario | Beat | Vixion");
                System.out.print("Ketik Pilihan Anda: ");
                merk = sys.nextLine();
                if (merk.equalsIgnoreCase("vario")) {
                    System.out.println("Harga Motor Vario: Rp16.000.000,00");
                } else {
                    if (merk.equalsIgnoreCase("beat")) {
                        System.out.println("Harga Motor Beat: Rp14.000.000,00");
                    } else {
                        if (merk.equalsIgnoreCase("vixion")) {
                            System.out.println("Harga Motor Vixion: Rp20.000.000,00");
                        }
                    }
                }
            } else {
                System.out.println("Salah Input");
            }
        }

        sys.close();
    }
}

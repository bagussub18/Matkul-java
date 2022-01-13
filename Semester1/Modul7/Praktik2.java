package Semester1.Modul7;
import java.util.Scanner;


public class Praktik2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String lk;
        System.out.println("----- Menghitung Bangun? -----");
        System.out.println("1. Persegi | 2. Lingkaran");
        System.out.println("------------------------------");
        System.out.print("Pilih 1 atau 2: ");
        int bangun = in.nextInt();
        switch (bangun) {
            case 1:
                System.out.println("Persegi");
                System.out.print("Masukan Sisi: ");
                int sisi = in.nextInt();
                in.nextLine();
                System.out.println("Luas Persegi | Keliling Persegi");
                System.out.print("Ketik luas atau keliling: ");
                lk = in.nextLine();
                switch (lk) {
                    case "luas":
                        System.out.println("Menghitung Luas Persegi");
                        int luasp = sisi * sisi;
                        System.out.println("Luas Persegi: "+luasp);
                        break;
                    case "keliling":
                        System.out.println("Menghitung Keliling Persegi");
                        int kelp = sisi * 4;
                        System.out.println("Keliling Persegi: "+kelp);
                        break;
                    default:
                        System.out.println("Salah Input");
                        break;
                }
                break;
            case 2:
                System.out.println("Lingkaran");
                System.out.print("Masukan jari-jari Lingkaran: ");
                int j = in.nextInt();
                in.nextLine();
                System.out.println("Luas Lingkaran | Keliling Lingkaran");
                System.out.print("Ketik Luas | Keliling: ");
                lk = in.nextLine();
                switch (lk) {
                    case "luas":
                        System.out.println("Menghitung Luas Lingkaran");
                        float luasl = 3.14f * j * j;
                        System.out.println("Luas Lingkaran: "+luasl);
                        break;
                    case "keliling":
                        System.out.println("Menghitung Keliling Lingkaran");
                        float kell = 2 * 3.14f * j;
                        System.out.println("Keliling Lingkaran: "+kell);
                        break;
                    default:
                        System.out.println("Salah Input");
                        break;
                }
                break;
            default:
                System.out.println("Salah Input");
                break;
        }   
        
        in.close();
    }
}

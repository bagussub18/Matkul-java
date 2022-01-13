package Semester1.Modul6;
import java.util.Scanner;

public class Praktik2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("IF | TK | MI | SI | KA");
        System.out.print("Masukan Kode Jurusan: ");
        String jur = in.nextLine();
        switch (jur) {
            case "IF":
                System.out.println("INFORMATIKA");
                break;
            case "TK":
                System.out.println("TEKNOLOGI KOMPUTER");
                break;
            case "MI":
                System.out.println("MANAGEMEN INFORMATIKA");
                break;
            case "SI":
                System.out.println("SISTEM INFORMASI");
                break;
            case "KA":
                System.out.println("KOMPUTERISASI AKUNTASI");
                break;
            default:
                System.out.println("Salah Input Jurusan");
                break;
        }

        in.close();
    }
}

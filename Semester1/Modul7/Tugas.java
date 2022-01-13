package Semester1.Modul7;
import java.util.Scanner;

public class Tugas {
    public static void main(String[] args) {
        Scanner tug = new Scanner(System.in);

        System.out.println("----- S1 | D3----- ");
        System.out.print("Masukan Jenjang: ");
        String jenjang = tug.nextLine();
        System.out.println("S1 : IF | SI");
        System.out.println("D3 : TK | KA | MI");
        System.out.print("Pilih Jurusan: ");
        String jurusan = tug.nextLine();
        switch (jenjang) {
            case "S1":
                switch (jurusan) {
                    case "IF":
                        System.out.println("Biaya Kuliah Jenjang S1, Jurusan "+jurusan+" Rp13.000.000,00");
                        break;
                    case "SI":
                        System.out.println("Biaya Kuliah Jenjang S1, Jurusan "+jurusan+" Rp12.000.000,00");
                        break;
                    default:
                        System.out.println("Salah Input");
                        break;
                }
                break;
            case "D3":
                switch (jurusan) {
                    case "TK": case "KA": case "MI":
                        System.out.println("Biaya Kuliah Jenjang D3, Jurusan "+jurusan+" Rp10.000.000,00");
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

        tug.close();
    }
}

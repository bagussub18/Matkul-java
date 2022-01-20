package Semester1.Modul13;
import java.util.Scanner;

public class Tugas {
    public static void main(String[]args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Pilih Fibonacci atau Faktorial: ");
        String pilihan = in.nextLine();
        switch (pilihan) {
            case "fibonacci":
                System.out.print("Masukan jumlah deret: " );
                int loop = in.nextInt();
                int a;
                int b = 0;
                int h = 1;
                    for (int l = 0; l <= loop; l++) {
                        System.out.print(h+", ");
                        a = h;
                        h = b + h;
                        b = a;
                    }
                break;
            case "faktorial":
                System.out.print("Masukan angka untuk faktorial: ");
                int faktorial = in.nextInt();
                int f = 1;
                int z = 1;
                while (f < faktorial) {
                    f++;
                    z = z * f;
                }
                System.out.print(z);
                break;
            default:
                System.out.println("Salah Input");
                break;
        }
        in.close();
    }
}

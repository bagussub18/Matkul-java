package Semester2.Modul4;
import java.util.Scanner;

public class Praktik3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = 3, b = 3;
        int matriks1[][] = new int[a][b];
        int matriks2[][] = new int[a][b];
        System.out.println("Ini adalah letak matriks\n[00][01][02]\n[10][11][12]\n[20][21][22]");
        for (int x = 0; x < a; x++) {
            for (int y = 0; y < b; y++) {
                System.out.print("Masukan matriks 1 ke - "+x+""+y+": ");
                matriks1[x][y] = in.nextInt();
                System.out.print("Masukan matriks 2 ke - "+x+""+y+": ");
                matriks2[x][y] = in.nextInt();
            }
        }
        System.out.println("===========================");
        for (int x = 0; x < a; x++) {
            for (int y = 0; y < b; y++) {
                System.out.print(+(matriks1[x][y]*matriks2[x][y])+ "\t");
            }
            System.out.println();
        }
        System.out.println("===========================");
        in.close();
    }
}

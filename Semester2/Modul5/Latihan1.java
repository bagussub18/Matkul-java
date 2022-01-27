package Semester2.Modul5;
import java.util.Scanner;

public class Latihan1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int b = 0;
        System.out.print("Jumlah identitas yang dimasukan: ");
        int jml = in.nextInt();
        in.nextLine();
        System.out.println();
        String id [][] = new String[jml][jml];
        int nim [] = new int[jml];
        for (int a = 0; a < jml; a++) {
            while (b < jml) {
                System.out.print("Masukan Nama: ");
                id[b][0] = in.nextLine();
                System.out.print("Masukan NIM: ");
                nim[b] = in.nextInt();
                in.nextLine();
                System.out.print("Masukan Alamat: ");
                id[b][1] = in.nextLine();
                System.out.println();
                b++;
            }
            System.out.println("Nama: "+id[a][0]);
            System.out.println("NIM: "+nim[a]);
            System.out.println("Alamat: "+id[a][1]+ "\n");
            System.out.println("----------------------------");
        }
        in.close();
    }
}
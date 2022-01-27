package Semester2.Modul4;
import java.util.Scanner;

public class Latihan1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukan Jumlah mahasiswa: ");
        int mhs = in.nextInt();
        int tertinggi = 0, terendah = 0, total = 0, q = 0;
        double max = 0, min = 0;
        Double [] rerata = new Double[mhs];
        int [][] nilai = new int[mhs][3];
        for (int a = 0; a < mhs; a++) {
            System.out.println("Mahasiswa ke "+(a+1));
            for (int b = 0; b < 3; b++) {
                System.out.print("Masukan tes ke - "+(b+1)+": ");
                nilai[a][b] = in.nextInt();
                total+=nilai[a][b];
                if (b == 2) {
                    rerata[a]= total / 3d;
                    total = 0;
                }
            }
        }
        System.out.println("\n======================");
        System.out.println("Daftar Nilai Mahasiswa");
        System.out.println("======================\n");
        System.out.println("Urutan\t\tTes 1\tTes 2\tTes 3\tRata-rata");
        for (int a = 0; a < mhs; a++) {
            System.out.print("Mahasiswa "+(a+1));
            for (int b = 0; b < 3; b++) {
                System.out.print("\t"+nilai[a][b]+"");
                if (b == 2) {
                    System.out.print("\t"+rerata[a]);
                }
            }
            System.out.println();
        }
        System.out.print("\nTertinggi\t");
        for (int a = 0; a < 3; a++) {
            for (int c = 0; c < mhs; c++) {
                if (nilai[c][a] > tertinggi) {
                    tertinggi = nilai[c][a];
                }
            while (q < mhs) {
                if (rerata[q] > max) {
                    max = rerata[q];
                }
                q++;
            }
            }
            System.out.print(tertinggi+"\t");
            tertinggi = 0; 
        }
        System.out.print(max);
        q = 0;
        System.out.print("\nTerendah\t");
        for (int a = 0; a < 3; a++) {
            for (int c = 0; c < mhs; c++) {
                if (terendah == 0) {
                    terendah = nilai[c][a];
                } else {
                    if (nilai[c][a] < terendah) {
                        terendah = nilai[c][a];
                    }
                }
            while (q < mhs) {
                if (min == 0) {
                    min = rerata[q];
                } else {
                    if (rerata[q] < min) {
                        min = rerata[q];
                    }
                }
                q++;
            }
            }
            System.out.print(terendah+"\t");
            terendah = 0;
        }
        System.out.print(min);
        in.close();
    }
}

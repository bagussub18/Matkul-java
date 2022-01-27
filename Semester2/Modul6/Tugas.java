package Semester2.Modul6;
import java.util.Scanner;

public class Tugas {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String [] matkul = new String[5];
        int [] sks = new int[5];
        int b = 0, total = 0;;
        System.out.println("---------------------------------------");
        System.out.print("Masukan Jenjang (D3 / S1): ");
        String jen = in.nextLine();
        System.out.print("Masukan jumlah Mata Kuliah: ");
        int jum = in.nextInt();
        in.nextLine();
        System.out.println("---------------------------------------");
        if (jen.equalsIgnoreCase("d3")) {
            if (jum <= 3) {
                for (int a = 0; a < jum; a++) {
                    while (b < jum) {
                        System.out.print("Masukan Mata Kuliah: ");
                        matkul[b] = in.nextLine();
                        System.out.print("Masukan SKS: ");
                        sks[b] = in.nextInt();
                        in.nextLine();
                        System.out.println();
                        total+=sks[b];
                        b++;
                    }
                    System.out.println("Mata Kuliah yang diambil: "+matkul[a]);
                }
                System.out.println("Jumlah SKS diambil: "+total);
            } else {
                System.out.println("Maksimal 3");
            }
        } else {
            if (jen.equalsIgnoreCase("s1")) {
                if (jum <= 5) {
                    for (int a = 0; a < jum; a++) {
                        while (b < jum) {
                            System.out.print("Masukan Mata Kuliah: ");
                            matkul[b] = in.nextLine();
                            System.out.print("Masukan SKS: ");
                            sks[b] = in.nextInt();
                            in.nextLine();
                            System.out.println();
                            total+=sks[b];
                            b++;
                        }
                        System.out.println("Mata Kuliah yang diambil: "+matkul[a]);
                    }
                    System.out.println("Jumlah SKS diambil: "+total);
                } else {
                    System.out.println("Maksimal 5");
                }
            }
        }
        in.close();
    }
}

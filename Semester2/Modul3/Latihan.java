package Semester2.Modul3;
import java.util.Scanner;

public class Latihan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nama, jur;
        int nim;
        System.out.println("===================================================");
        System.out.println("Menghitung Nilai Mahasiswa");
        System.out.println("===================================================");
        System.out.print("\nMasukan Jumlah Mata Kuliah: ");
        int a = in.nextInt();
        in.nextLine();
        System.out.println();
        float nilai[] = new float[a], uts[] = new float[a], uas[] = new float[a];
        String matkul[] = new String[a];
        char grade[] = new char[a];
        System.out.println("===================================================");
        System.out.print("Masukan Nama: ");
        nama = in.nextLine();
        System.out.print("Masukan NIM: ");
        nim = in.nextInt();
        in.nextLine();
        System.out.print("Masukan Jurusan: ");
        jur = in.nextLine();
        System.out.println("===================================================");
        int c = 0;
        for (int b = 0; b < a; b++) {
            while (c <= b) {
                System.out.print("Mata Kuliah ke - "+(c+1)+": ");
                matkul[c] = in.nextLine();
                System.out.print("Nilai UTS: ");
                uts[c] = in.nextFloat();
                in.nextLine();
                System.out.print("Nilai UAS: ");
                uas[c] = in.nextFloat();
                in.nextLine();
                nilai[c] = uts[c] + uas[c];
                nilai[c]/=2;
                c++;
            }
            if (nilai[b] > 80 & nilai[b] <= 100) {
                grade[b] = 'A';
            } else {
                if (nilai[b] <= 80 & nilai[b] >= 70) {
                    grade[b] = 'B';
                } else {
                    if (nilai[b] < 70 & nilai[b] >= 50) {
                        grade[b] = 'C';
                    } else {
                        if (nilai[b] < 50 & nilai[b] >= 30) {
                            grade[b] = 'D';
                        } else {
                            if (nilai[b] < 30 & nilai[b] >= 1) {
                                grade[b] = 'E';
                            }
                        }
                    }
                }
            }
        }
        System.out.println("===================================================");
        System.out.print("Nama: "+nama+"\tNIM: "+nim+"\tJurusan: "+jur);
        System.out.println("===================================================");
        System.out.println("Mata Kuliah\tNilai\tGrade");
        for (int b = 0; b < a; b++) {
            System.out.println(matkul[b]+"\t\t"+nilai[b]+"\t"+grade[b]);
        }
        in.close();
    }
}

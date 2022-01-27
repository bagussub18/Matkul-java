package Semester2.Modul5;
import java.util.Scanner;

public class Praktik {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double rerata1 = 0, rerata2 = 0;
        int nosiswa = 0, noujian = 0;
        System.out.print("Masukan Jumlah Siswa: ");
        int siswa = in.nextInt();
        System.out.print("Masukan Banyak Ujian: ");
        int ujian = in.nextInt();
        double [][][] nilai = new double[siswa][ujian][2];
        System.out.println("----- Masukan Data -----");
        for (int a = 0; a < siswa; a++) {
            System.out.println();
            System.out.println("Nilai Mahasiswa ke "+(a+1));
            System.out.print("Nomor Siswa: ");
            nosiswa = in.nextInt();
            nosiswa--;
            System.out.print("Nomor Ujian: ");
            noujian = in.nextInt();
            noujian-=(1+a);
            for (int b = 0; b < ujian; b++) {
                System.out.println();
                System.out.println("Ujian ke "+(+b+1));
                System.out.print("Nilai Pilihan Ganda: ");
                double pilgan = in.nextDouble();
                System.out.print("Nilai Essay: ");
                double essay = in.nextDouble();
                nilai[nosiswa][noujian][0] = pilgan;
                nilai[nosiswa][noujian][1] = essay;
                noujian++;
            }
        }
        for (int a = 0; a < siswa; a++) {
            System.out.println();
            System.out.println("Nilai Mahasiswa ke "+(a+1));
            for (int b = 0; b < ujian; b++) {
                System.out.println("Nilai Ujian ke "+(b+1));
                System.out.print("nilai["+a+"]["+b+"][0]: "+nilai[a][b][0]);
                System.out.print("\tnilai["+a+"]["+b+"][1]: "+nilai[a][b][1]);
                System.out.println();
            }
        } 
        for (int a = 0; a < siswa; a++) {
            for (int b = 0; b < ujian; b++) {
                rerata1 = rerata1 + nilai[a][b][0];
                rerata2 = rerata2 + nilai[a][b][1];
            }
            rerata1/=ujian;
            rerata2/=ujian;
            System.out.println();
            System.out.println("Rata - rata Nilai Pilihan Ganda Mahasiswa "+(a+1)+ ": " +rerata1);
            System.out.println("Rata - rata Nilai Essay Mahasiswa "+(a+1)+ ": " +rerata2);
            rerata1 = 0;
            rerata2 = 0;
        }
        in.close();
    }   
}

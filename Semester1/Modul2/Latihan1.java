package Semester1.Modul2;
import java.util.Scanner;

public class Latihan1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nama;
        int nim;
        String jurusan;
        String alamat;
        long notelp;

        System.out.print("Masukan Nama Anda: ");
        nama = input.nextLine();
        System.out.print("Masukan NIM Anda: ");
        nim = input.nextInt();
        input.nextLine();
        System.out.print("Masukan Jurusan Anda ");
        jurusan = input.next();
        input.nextLine();
        System.out.print("Masukan Alamat Anda: ");
        alamat = input.nextLine();
        System.out.print("Masukan Nomor Telepon Anda: ");
        notelp = input.nextLong();
        input.nextLine();

        System.out.println("");
        System.out.println("----------------------");
        System.out.println("Nama Anda           : " +nama);
        System.out.println("NIM Anda            : " +nim);
        System.out.println("Jurusan Anda        : " +jurusan);
        System.out.println("Alamat Anda         ; " +alamat);
        System.out.println("Nomor Telepon Anda  : " +notelp);
        System.out.println("----------------------");

        input.close();
    }

}

package Semester1.Modul8;
import java.util.Scanner;

public class Praktik1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean status = true;
        int jumlah = 0;
        while (status) {
            jumlah++;
            System.out.println("");
            System.out.println("---------------------------------------");
            System.out.println("Univeraitas Teknologi Digital Indonesia");
            System.out.println("---------------------------------------");
            System.out.println("");
            System.out.print("Tampilkan tulisan Lagi? [ya / tidak]: ");
            String pilihan = in.nextLine();
            if (pilihan.equalsIgnoreCase("tidak")) {
                status = false;    
            }
        }
        System.out.println("Melakukan Print sebanyak " +jumlah+ " kali");
        in.close();
    }
}

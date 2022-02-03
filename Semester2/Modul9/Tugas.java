package Semester2.Modul9;
import java.util.Scanner;

public class Tugas {
    public static Scanner in = new Scanner(System.in);
    static double kuadrat (double a) {
        return Math.sqrt(a);
    }
    static double pangkat (double a, double b) {
        double total;
        total = Math.pow(a, b);
        return total;
    }
    static double pembulatanfloor (double a) {
        return Math.floor(a);
    }
    static double pembulatanceil (double a) {
        return Math.ceil(a);
    }
    static int max (int a, int b) {
        return Math.max(a,b);
    }
    static int min (int a, int b) {
        return Math.min(a,b);
    }
    static int strlength (String a) {
        return a.length();
    }
    static String concat (String a) {
        System.out.print("Tulis kata pada bagian belakang: ");
        String kata1 = in.nextLine();
        a = a.concat(kata1);
        return a;
    }
    public static void main(String[] args) {
        System.out.print("Masukan angka: ");
        int a = in.nextInt();
        in.nextLine();
        int b = in.nextInt();
        in.nextLine();
        System.out.println("Kuadrat dari "+a+": "+kuadrat(a));
        System.out.print("Masukan angka: ");
        Double c = in.nextDouble();
        in.nextLine();
        System.out.println(a+" Pangkat "+b+": "+pangkat(a, b));
        System.out.println("Pembulatan terbesar dari "+c+": "+pembulatanfloor(c));
        System.out.println("Pembulatan terkecil dari "+c+": "+pembulatanceil(c));
        System.out.println("Nilai max dari angka"+a+" dan "+b+": "+max(a,b));
        System.out.println("Nilai min dari angka"+a+" dan "+b+": "+min(a,b));
        System.out.print("Tulis kata: ");
        String kata = in.nextLine();
        System.out.println("Menghitung panjang String: "+strlength(kata));
        System.out.println("Menulis kata: "+concat(kata));
        in.close();
    }
}

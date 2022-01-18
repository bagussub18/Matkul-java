package Semester1.Modul8;
import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = 1;
        int b = 1;
        int c = 3;
        System.out.print("Masukan banyak deret (n): ");
        int n = in.nextInt();
        while (a <= n) {
            System.out.println(b);
            b+=c;
            c+=2;
            a++;
        }
        in.close();;
    }
}

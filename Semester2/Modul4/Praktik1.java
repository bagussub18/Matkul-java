package Semester2.Modul4;
import java.util.Scanner;

public class Praktik1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String cats[][]= {{"terry","brown"}, {"kitty","white"}, {"toby","gray"}, {"fido","black"}};
            System.out.println("Akses array Kolom: ");
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.println("Akses array Baris: ");
            int c = in.nextInt();
            int d = in.nextInt();
        System.out.println(cats[a][b]+ " " +cats[c][d]);
        in.close();
    }    
}

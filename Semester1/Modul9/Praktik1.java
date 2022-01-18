package Semester1.Modul9;
import java.util.Scanner;

public class Praktik1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int banyak = 1;
        System.out.print("Masukan Banyak yang dicetak: ");
        int a = in.nextInt();
        do {
            System.out.println(banyak+". Universitas Teknologi Digital Indonesia");
            a--;
            banyak++;
        } while (1 <= a);
        in.close();
    }
}

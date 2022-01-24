package Semester2.Modul2;

public class Praktik3 {
    public static void main(String[] args) {
        int a = 1;
        do {
            int b = 1;
            do {
                b++;
                System.out.print("*");
            } while (b <= a);
            a++;
            System.out.println();
        } while (a <= 5);
    }
}
package Semester2.Modul2;

public class Praktik4 {
    public static void main(String[] args) {
        int a = 1;
        int z = 1;
        do {
            int b = 5;
            int c = 1;
            do {
                System.out.print(" ");
                b--;
            } while (b >= a);
            do {
                System.out.print("*");
                c++;
            } while (c <= z);
            z+=2;
            a++;
            System.out.println();
        } while (a <= 5);
    }
}

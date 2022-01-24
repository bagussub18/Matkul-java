package Semester2.Modul2;

public class Praktik2 {
    public static void main(String[] args) {
        int a = 1;
        int x = 5;
        while (a <= x) {
            int b = 4;
            int c = 1;
            int d = 2;
            while (b >= a) {
                System.out.print(' ');
                b--;
            }
            while (c <= a) {
                System.out.print(c);
                c++;
            }
            c--;
            while (d <= c) {
                System.out.print(c);
                d++;
                }
            System.out.println();  
            a++;
        }
    }
}

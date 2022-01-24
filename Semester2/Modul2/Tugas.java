package Semester2.Modul2;

public class Tugas {
    public static void main(String[] args) {
        int a = 5;
        int b = 1;
        while (a >= 1) {
            while (b <= 5) {
                int c = 1;
                while (c <= b) {
                    System.out.print(c);
                    c++;
                }
                b++;
                System.out.println();
            }
            a--;
            int d = 1;
            while (d <= a) {
                System.out.print(d);
                d++;
            }
            System.out.println();
        }
    }
}

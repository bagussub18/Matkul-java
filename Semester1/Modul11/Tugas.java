package Semester1.Modul11;

public class Tugas {
    public static void main(String[]args) {
        int a = 1;
        int b = 1;
        int e = 4;
        while (a <= 4) {
            while (b <= 5) {
                int c = 1;
                while (c <= b) {
                    System.out.print(c+" ");
                    c++;
                }
                b++;
                System.out.println();
            }
            int d = 1;
            while (d <= e) {
                System.out.print(d+" ");
                d++;
            }
            e--;
            a++;
            System.out.println();
        }
    }
}

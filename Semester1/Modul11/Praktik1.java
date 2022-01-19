package Semester1.Modul11;

public class Praktik1 {
    public static void main(String[]args) {
        int a = 1;
        while (a <= 3) {
            int b = 1;
            while (b <= 2) {
                System.out.println("[" + a + "]" + "[" + b + "]");
                b++;
            }
            a++;
        }
    }
}

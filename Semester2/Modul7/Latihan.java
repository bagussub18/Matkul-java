package Semester2.Modul7;

public class Latihan {
    public static void main(String[] args) {
        int a = 0;
        while (a <= 10) {
            if (a % 2 == 0) {
                System.out.println("Bilangan Genap "+a);
            } else {
                if (a % 2 == 1) {
                    System.out.println("Bilangan Ganjil "+a);
                }
            }
            a++;
        }
    }
}

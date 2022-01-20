package Semester1.Modul12;

public class Tugas {
    public static void main(String[] args) {
        for (int a = 1; a <= 10;a++) {
            if (a % 2 == 1) {
                System.out.println(a+" adalah Bilangan Ganjil");
            } else {
                System.out.println(a+" adalah bilangan Genap");
            }
        }
        int a = 11;
        while (a <= 20) {
            if (a % 2 == 0) {
                System.out.println(a+" adalah Bilangan Genap");
            } else {
                System.out.println(a+" adalah Bilangan Ganjil");
            }
            a++;
        }
        a = 21;
        do {
            if (a % 2 == 1) {
                System.out.println(a+" adalah Bilangan Ganjil");
            } else {
                System.out.println(a+" adalah bilangan Genap");
            }
            a++;
        } while (a <= 30);
    }
}

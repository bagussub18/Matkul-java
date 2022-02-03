package Semester2.Modul9;

public class Praktik2 {
    void jum (int a, int b) {
        System.out.println((a+b));
    }
    void jum (int a, int b, int c) {
        System.out.println((+a+b+c));
    }
    public static void main(String[] args) {
        Praktik2 cek = new Praktik2();
        cek.jum(4,9);
        cek.jum(2,6,8);
    }
}

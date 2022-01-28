package Semester2.Modul8;

public class Praktik2 {
    public int total() {
        int a = 5, b = 9;
        return a + b;
    }
    public static void main(String[] args) {
        Praktik2 objek = new Praktik2();
        System.out.println("Jumlah Pemanggilan pada method: "+objek.total());
    }
}

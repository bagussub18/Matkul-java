package Semester2.Modul2;

public class Latihan2 {
    public static void main(String[] args) {
        int z = 0;
        for (int a = 5; a >= 1; a--) {
            for (int b = 1; b <= z; b++) {
                System.out.print(' ');
            }
            z+=2;
            for (int c = 1; c <= a; c++) {
                System.out.print("* ");
            }
            System.out.print("UTDI");
            System.out.println();
        }
    }
}

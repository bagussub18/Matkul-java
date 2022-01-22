package Semester1.Modul14;

public class Latihan {
    public static void main(String[] args) {
        int z = 1;
        int x = 1;
        int v = 3;
        int n = 7;
        int m = 3;
        for (int a = 0; a <= 4; a++) {
            for (int b = 0; b <= a; b++) {
                System.out.print(" ");
            }
            for (int c = 1; c <= 8; c++) {
                if (a == z) {
                   System.out.print(" ");
                   z++;
                    if (a == v) {
                        v++;
                        System.out.print(" ");
                        if (a == 4) {
                            System.out.print(" ");
                        } 
                    }
                }
                if (a == x & a + c == 8) {
                    x++;
                    break;
                } else {
                    if (a == m & a + c == n) {
                        n--;
                        m++;
                        break;
                    }
                }
                System.out.print("* ");
            }
            System.out.println("\n");
        }
    }
}

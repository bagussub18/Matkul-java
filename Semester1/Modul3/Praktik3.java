package Semester1.Modul3;
import java.util.Scanner;

public class Praktik3 {
    public static void main(String[] args) {
        Scanner sys = new Scanner(System.in);

        System.out.print("Masukan Panjang Dalam Meter: ");
        float m = sys.nextFloat();
        float cm = m * 100;
        float inci = m * 100 / 2.54f;
        System.out.println("Konvert M ke CM: " +cm+ " cm");
        System.out.println("Konvert M ke Inci: "+inci+ " in");

        sys.close();;
    }
}

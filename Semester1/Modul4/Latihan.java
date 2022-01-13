package Semester1.Modul4;
import java.util.Scanner;

public class Latihan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Jika ingin mencari luas lingkaran segarusnya menggunakan if...else karena ada perbedaan rumus pi.
        System.out.print("Masukan Jari-jari: ");
        float r = input.nextFloat();
        System.out.print("Masukan Diameter: ");
        float d = input.nextFloat();
        float luas = 3.14f * r * r;
        System.out.println("Luas Lingkaran dari r: " +luas);
        luas = 1f / 4f * 3.14f * d * d;
        System.out.println("Luas Lingkaran dari d: " +luas);

        input.close();
    }
}

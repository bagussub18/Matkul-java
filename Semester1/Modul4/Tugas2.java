package Semester1.Modul4;
import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner sys = new Scanner(System.in);

        System.out.print("Masukan Suhu: ");
        float c = sys.nextFloat();
        float k = c + 273.15f;
        System.out.println("Celcius ke Kelvin: "+k);
        float f = (c * 1.8f) + 32;
        System.out.println("Celcius Ke Fahrenheit: "+f);

        sys.close();
    }
}

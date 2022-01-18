package Semester1.Modul9;

public class Latihan1 {
    public static void main(String[] args) {
        int a = 20;
        float jumlah;
        do {
            System.out.println("Konversi Celcius ke Fahrenheit");
            jumlah = (a * 9f / 5f) + 32f;
            System.out.println(a+ " Celcius = "+jumlah+ " Fahrenheit");
            System.out.println("");
            a++;
        } while (a <= 30); 
    }
}

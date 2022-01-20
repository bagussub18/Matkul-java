package Semester1.Modul12;

public class Latihan {
    public static void main(String[]args) {
        int [] array = {10, 20, 30, 40, 50};
        int a = 0;
        //program dibawah adalah while
        while (a <= array.length) {
            if (array[a] == 30) {
                break;
            }
            a++;
        }
        System.out.print(array[a]+"\n");
        a = 0;
        //program dibawah adalah do while
        do {
            if (array[a] == 20) {
                break;
            } 
            a++;
        } while (a <= array.length);
        System.out.print(array[a]);
    }
}

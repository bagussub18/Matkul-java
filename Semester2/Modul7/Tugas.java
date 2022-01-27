package Semester2.Modul7;

public class Tugas {
    public static void main(String[] args) {
        int x = 0, y = 1, z = 2;
        for (int a = 1; a <= 20; a++) {
            System.out.println("Suku ke - "+y+": "+a);
            if (a == z) {
                y++;
                x = x + a;
                System.out.println("Suku ke - "+y+": "+x);
                z+=2;
            }
            x = a;
            y++;
        }
    }
}

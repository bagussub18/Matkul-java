import java.util.Scanner;

public class Convert {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char letak[][] = new char[3][26];
        char huruf = 'a';
        System.out.print("Masukan nama: ");
        String nama = in.nextLine();

        //membuat variabel char array dengan panjang dari inputan
        char [] ch = new char[nama.length()];

        //convert dari string ke char serta memasukan kedalam array
        for (int t = 0; t < nama.length(); t++) {
            ch[t] = nama.charAt(t);
        }

        //mengisi variabel letak array dengan mengisi huruf abjad serta menentukan urutan angka
        for (int a = 0; a < 3; a++) {
            for (int b = 0; b <= 9; b++) {
            letak[a][b] = huruf;
            huruf++;
                //seleksi jika angka atau array 26 maka berisi spasi
                if (letak[a][b] == letak[2][6]) {
                    letak[a][b] = ' ';
                } else {
                    if (a >= 2 & b > 6) {
                        break;
                    }
                }
            }
        }

        //mencetak angka sesuai dari urutan huruf
        for (int a = 0; a < nama.length(); a++) {
            for (int b = 0; b < 3; b++) {
                for (int c = 0; c <= 9; c++) {
                    if (letak[b][c] == ch[a]) {
                        System.out.print(b+""+c);
                        break;
                    }
                }
            }
        }
        in.close();
    }
}

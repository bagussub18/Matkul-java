package Semester2.Modul9;

public class Latihan2 {
    String nama;
    int nim;
    String jurusan;
    double ipk;
    int sks;
    public void setMhs (String nama, int nim, String jurusan, double ipk, int sks) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.ipk = ipk;
        this.sks = sks;
    }
    String getnama () {
        return this.nama;
    }
    int getnim () {
        return this.nim;
    }
    String getjurusan () {
        return this.jurusan;
    }
    double getipk () {
        return this.ipk;
    }
    int getsks () {
        return this.sks;
    }
    public static void main(String[] args) {
        Latihan2 mhs = new Latihan2();
        mhs.setMhs("Bagus", 205410081, "Informatika", 3.52, 68);
        System.out.println("Nama\t: "+ mhs.getnama());
        System.out.println("NIM\t: "+ mhs.getnim());
        System.out.println("Jurusan : "+ mhs.getjurusan());
        System.out.println("IPK\t: "+ mhs.getipk());
        System.out.println("SKS\t: "+ mhs.getsks());
    }
}

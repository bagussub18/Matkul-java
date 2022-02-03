package Semester2.Modul9;

public class Praktik1 {
        String nama;
        int nim;
        String jurusan;

    public void setMhs (String nama, int nim, String jurusan) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
    }
    public void tampil () {
        System.out.println("Nama: "+nama);
        System.out.println("NIM: "+nim);
        System.out.println("Jurusan: "+jurusan);
    }
    public static void main(String[] args) {
        Praktik1 mhs = new Praktik1();
        mhs.setMhs("Bagus", 205410081, "Informatika");
        mhs.tampil();
    }
}

package Semester2.Modul9;

public class Latihan1 {
    String nama;
    int nim;
    String jurusan;
    double ipk;

    public void setMhs (String nama, int nim, String jurusan, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.ipk = ipk;
    } 
    void tampil () {
        System.out.println("Nama\t: "+nama);
        System.out.println("NIM\t: "+nim);
        System.out.println("Jurusan : "+jurusan);
        System.out.println("IPK\t: "+ipk);
    }
    public static void main(String[] args) {
        Latihan1 mhs = new Latihan1();
        mhs.setMhs("Bagus", 205410081, "Informatika", 3.50);
        mhs.tampil();
    }
}

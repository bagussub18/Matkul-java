package Semester2.Modul1;
import java.util.Scanner;

public class Latihan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("-------------------------");
        System.out.print("Masukan Gelombang: ");
        int gel = in.nextInt();
        in.nextLine();
        System.out.print("Masukan Jenjang: ");
        String jen = in.nextLine();
        System.out.print("Masukan Jurusan: ");
        String jur = in.nextLine();
        System.out.println("-------------------------");
        switch (gel) {
            case 1:
                switch (jen) {
                    case "S1":
                        switch (jur) {
                            case "TI":
                                System.out.println("Rp13.400.000");
                                break;
                            case "SI":
                                System.out.println("Rp12.400.000");
                                break;
                            default:
                                System.out.println("Salah Input");
                            break;
                        }
                        break;
                    case "D3":
                        switch (jur) {
                            case "TK": 
                            case "KA":
                            case "MI":
                            System.out.println("RP8.600.000");
                                break;
                            default:
                                System.out.println("Salah Input");
                                break;
                        }
                        break;
                    default:
                        System.out.println("Salah Input");
                        break;
                }
                break;
            case 2:
                switch (jen) {
                    case "S1":
                        switch (jur) {
                            case "TI":
                                System.out.println("Rp13.900.000");
                                break;
                            case "SI":
                                System.out.println("Rp12.900.000");
                                break;
                            default:
                                System.out.println("Salah Input");
                                break;
                        }
                        break;
                    case "D3":
                        switch (jur) {
                            case "TK": 
                            case "KA":
                            case "MI":
                            System.out.println("RP9.100.000");
                                break;
                            default:
                                System.out.println("Salah Input");
                                break;
                        }
                        break;
                    default:
                        System.out.println("Salah Input");
                        break;
                }
                break;
            case 3:
                switch (jen) {
                    case "S1":
                        switch (jur) {
                            case "TI":
                                System.out.println("Rp14.400.000");
                                break;
                            case "SI":
                                System.out.println("Rp13.400.000");
                                break;
                            default:
                                System.out.println("Salah Input");
                                break;
                        }
                        break;
                    case "D3":
                        switch (jur) {
                            case "TK": 
                            case "KA":
                            case "MI":
                            System.out.println("RP9.600.000");
                                break;
                            default:
                                System.out.println("Salah Input");
                                break;
                        }
                        break;
                    default:
                        System.out.println("Salah Input");
                        break;
                }
                break;
            default:
                System.out.println("Salah Input");
                break;
        }
        in.close();;
    }
}

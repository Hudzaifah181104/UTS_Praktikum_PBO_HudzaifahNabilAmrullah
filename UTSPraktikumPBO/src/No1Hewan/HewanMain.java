package No1Hewan;

import java.util.Scanner;

public class HewanMain {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Kucing kucing = new Kucing(null);
        Anjing anjing = new Anjing(null);

        System.out.print("Masukkan Nama Hewan Kucing/Anjing: ");
        String jenisHewan = input.nextLine();

        if (jenisHewan.equalsIgnoreCase("Kucing")) {
            kucing.bersuara();
        } else if (jenisHewan.equalsIgnoreCase("Anjing")) {
            anjing.bersuara();
        } else {
            System.out.println("Hewan yang anda masukan salah, silahkan masukan Kucing/Anjing.");
        }

        System.out.print("\nApa Anda ingin melihat jenis hewan ini? (Y/N): ");
        String pilihan = input.nextLine();

        if (pilihan.equalsIgnoreCase("Y")) {
            if (jenisHewan.equalsIgnoreCase("Kucing")) {
                (kucing).jenis();
            } else if (jenisHewan.equalsIgnoreCase("Anjing")) {
                (anjing).jenis();
            } else {
                System.out.println("Hewan ini bukan mamalia.");
            }
        } else if (pilihan.equalsIgnoreCase("N")) {
            System.out.println("Baik, terima kasih");
        } else {
            System.out.println("Pilihan yang Anda masukkan salah.");
        }
    }
}

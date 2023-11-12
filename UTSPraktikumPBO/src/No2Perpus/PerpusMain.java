package No2Perpus;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PerpusMain {
    
    public static void hapusBuku(List<Buku> daftarBuku, Buku buku) {
        if (daftarBuku.contains(buku)) {
            daftarBuku.remove(buku);
            System.out.println("Buku berhasil dihapus.");
        } else {
            System.out.println("Buku yang anda cari tidak ditemukan.");
        }
    }

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        List<Buku> daftarBuku = new ArrayList<Buku>();
        daftarBuku.add(new Fiksi("The Maze Runner"));
        daftarBuku.add(new Fiksi("Percy Jackson: The Chalice of The Gods"));
        daftarBuku.add(new Fiksi("The Chronicles of Narnia"));
        daftarBuku.add(new Fiksi("Brave New World"));
        daftarBuku.add(new Nonfiksi("Into the Wild"));
        daftarBuku.add(new Nonfiksi("The Elements of Style"));
        daftarBuku.add(new Nonfiksi("The Immortal Life of Henrietta Lack"));
        daftarBuku.add(new Nonfiksi("Thinking, Fast and Slow"));
        
        System.out.print("Login (User/Admin): ");
        String login = input.nextLine();
        if (login.equalsIgnoreCase("User")) {
            System.out.print("Masukkan Nama User: ");
            String nama = input.nextLine();
            User user = new User(nama);
            user.indentifikasi();
            System.out.println();
            user.liatBuku(daftarBuku);
        } else if (login.equalsIgnoreCase("Admin")) {
            System.out.print("Masukkan Nama Admin: ");
            String nama = input.nextLine();
            Admin admin = new Admin(nama);
            admin.indentifikasi();
            System.out.println();
            System.out.println("Pilih Menu:");
            System.out.println("1. Tambah Buku pada Daftar Buku");
            System.out.println("2. Lihat Daftar Buku");
            System.out.println("3. Hapus Buku");
            System.out.print("Masukkan Pilihan Menu (1-3): ");
            int pilihan = input.nextInt();
            input.nextLine();
            
            switch (pilihan) {
                case 1: {
                    System.out.println();
                    System.out.print("Masukkan judul Buku Baru yang diinginkan : ");
                    String judulBaru = input.nextLine();
                    System.out.print("Masukkan Genre Buku Baru : ");
                    String genreBaru = input.nextLine();
                    if (genreBaru.equalsIgnoreCase("Fiksi")) {
                        daftarBuku.add(new Fiksi(judulBaru));
                        System.out.println("Buku baru berhasil ditambahkan");
                        admin.liatBuku(daftarBuku);
                    } else if (genreBaru.equalsIgnoreCase("Non-Fiksi")) {
                        daftarBuku.add(new Nonfiksi(judulBaru));
                        System.out.println("Buku baru berhasil ditambahkan");
                        admin.liatBuku(daftarBuku);
                    }
                    break;
                }
                case 2: {
                    System.out.println();
                    admin.liatBuku(daftarBuku);
                    break;
                }
                case 3: {
                    System.out.println();
                    System.out.print("Masukkan judul Buku yang ingin dihapus: ");
                    String judulHapus = input.nextLine();
                    boolean bukuDitemukan = false;
                    for (Buku buku : daftarBuku) {
                        if (buku.judul.equalsIgnoreCase(judulHapus)) {
                            daftarBuku.remove(buku);
                            System.out.println("Buku berhasil dihapus.");
                            bukuDitemukan = true;
                            break;
                        }
                    }
                    if (!bukuDitemukan) {
                        System.out.println("Buku yang anda cari tidak ditemukan.");
                    }
                    admin.liatBuku(daftarBuku);
                    break;
                }
                default:
                    System.out.println("Menu yang anda pilih tidak tersedia.");
            }
        } else {
            System.out.println("Pengguna tidak terdaftar.");
        }
    }
}

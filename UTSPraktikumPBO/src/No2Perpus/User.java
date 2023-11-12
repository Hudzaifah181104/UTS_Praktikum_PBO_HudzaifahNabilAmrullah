
package No2Perpus;

import java.util.List;
public class User extends Pengguna {
	public User(String nama) {
		super(nama);
	}
	
	public void indentifikasi() {
		System.out.println("User "+nama);	
	}
	
	public void liatBuku(List<Buku> daftarBuku) {
		System.out.println("Daftar Buku-Buku: ");
		for (Buku buku : daftarBuku) {
			System.out.println(buku);
		}
	}
}


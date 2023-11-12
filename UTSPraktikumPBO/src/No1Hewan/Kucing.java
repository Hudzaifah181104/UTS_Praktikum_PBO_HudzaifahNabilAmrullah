
package No1Hewan;


public class Kucing extends Hewan {
	public Kucing(String jenisSuara) {
		super("Meong");
	}

	public void bersuara() {
		System.out.println("Suara Kucing adalah: "+jenisSuara);
	}
	
	public void jenis() {
		System.out.println("Jenis hewan ini adalah Mamalia");
	}
}

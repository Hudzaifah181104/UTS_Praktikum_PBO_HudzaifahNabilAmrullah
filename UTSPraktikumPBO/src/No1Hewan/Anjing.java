
package No1Hewan;


public class Anjing extends Hewan{
	public Anjing(String jenisSuara) {
		super("Guk Guk");
	}
	
	public void bersuara() {
		System.out.println("Suara Anjing adalah: "+jenisSuara);
	}
	
	public void jenis() {
		System.out.println("Jenis hewan ini adalah Mamalia");
	}

}
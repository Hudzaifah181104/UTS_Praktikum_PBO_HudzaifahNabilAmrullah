package No1Hewan;

public class Hewan {
	protected String jenisSuara;
	
	public Hewan(String jenisSuara) {
		this.jenisSuara = jenisSuara;
	}
	
	public void bersuara() {
		System.out.println("Hewan Bersuara: "+jenisSuara);
	}
}




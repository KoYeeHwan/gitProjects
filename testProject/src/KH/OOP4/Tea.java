package KH.OOP4;

public class Tea {
	private String iceTea;
	private String iceAme;
	private String hotCho;
	
	public String getIceTea() {
		return this.iceTea;
	}
	
	public String getIceAme() {
		return this.iceAme;
	}
	
	public String getHotCho() {
		return this.hotCho;
	}
	
	public void setIceTea(String iceTea) {
		this.iceTea = iceTea;
	}
	
	public void setIceAme(String iceAme) {
		this.iceAme = iceAme;
	}
	
	public void setHotCho(String hotCho) {
		this.hotCho = hotCho;
	}

	@Override
	public String toString() {
		return this.iceTea + " " +this.iceAme + " " + this.hotCho;
	}
	
	
}

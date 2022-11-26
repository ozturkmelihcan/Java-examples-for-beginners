package StreamApi;

public class Kisi {
	
	private String name;
	private int yas;
	private ECinsiyet cinsiyet;
	
	
	
	public Kisi(String name, int yas, ECinsiyet cinsiyet) {
		super();
		this.name = name;
		this.yas = yas;
		this.cinsiyet = cinsiyet;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYas() {
		return yas;
	}
	public void setYas(int yas) {
		this.yas = yas;
	}
	public ECinsiyet getCinsiyet() {
		return cinsiyet;
	}
	public void setCinsiyet(ECinsiyet cinsiyet) {
		this.cinsiyet = cinsiyet;
	}
	@Override
	public String toString() {
		return "Kisi [name=" + name + ", yas=" + yas + ", cinsiyet=" + cinsiyet + "]";
	}
	

	
}

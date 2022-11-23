package collections;

public class Hasta implements Comparable<Hasta>{

	private String isim;
	private String sikayet;
	private int oncelik;

	public Hasta(String isim, String sikayet) {
		super();
		this.isim = isim;
		this.sikayet = sikayet;
		if(sikayet.equalsIgnoreCase("Apandisit")) {
			this.oncelik =1;
		}else if(sikayet.equalsIgnoreCase("Yanık")) {
			this.oncelik=2;
		}else
			this.oncelik=3;
	//	this.oncelik = sikayet.equalsIgnoreCase("apandisit") ? 1 : sikayet.equalsIgnoreCase("yanık") ? 2
	//			 : sikayet.equalsIgnoreCase("Ağrı") ? 3 : 4;
	}

	public void setOncelik(String sikayet) {
		if(sikayet.equalsIgnoreCase("Apandisit")) {
			this.oncelik =1;
		}else if(sikayet.equalsIgnoreCase("Yanık")) {
			this.oncelik=2;
		}else
			this.oncelik=3;
	}
	
	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String getSikayet() {
		return sikayet;
	}

	public void setSikayet(String sikayet) {
		this.sikayet = sikayet;
	}

	public int getOncelik() {
		return oncelik;
	}


	public void setOncelik(int oncelik) {
		this.oncelik = oncelik;
	}

	@Override
	public String toString() {
		return "Hasta [isim=" + isim + ", sikayet=" + sikayet + ", oncelik=" + oncelik + "]";
	}

	@Override
	public int compareTo(Hasta hasta) {
		if(hasta.getOncelik()>this.oncelik) {
			return -1;
		}else if(hasta.oncelik<getOncelik()) {
			return 1;
		}
		return 0;
	}

}

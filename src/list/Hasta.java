package list;

public class Hasta implements Comparable<Hasta> {
	private String isim;
	private String sikayet;
	private int oncelik;

	public Hasta(String isim, String sikayet) {
		super();
		this.isim = isim;
		this.sikayet = sikayet;
		if (sikayet.equalsIgnoreCase("apandisit")) {
			this.oncelik = 1;
		} else if (sikayet.equalsIgnoreCase("yanık")) {
			this.oncelik = 2;
		} else {
			this.oncelik = 3;
		}

	}

	public void setOncelik(String sikayet) {
		if (sikayet.equalsIgnoreCase("apandisit")) {
			this.oncelik = 1;
		} else if (sikayet.equalsIgnoreCase("yanık")) {
			this.oncelik = 2;
		} else {
			this.oncelik = 3;
		}

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
	public int compareTo(Hasta o) {
		if (o.getOncelik() > this.oncelik) {
			return -1;
		} else if (o.getOncelik() < this.oncelik) {
			return 1;
		} else {
			return 0;
		}

	}

}

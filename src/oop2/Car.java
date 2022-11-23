package oop2;

public class Car {
	
	// Fields , Properties
	
	private String color;
	private  String model;
	private  double engine;
	private  int doors;
	
	
	public Car(String color , String model) {
		this(color,model,0,0);
	}
	
	
	public Car() {
	
		this("Bilgi yok" , "Bilgi yok", 0 , 0);
	}
	

	
	
	public Car(String color, String model, double engine, int doors) {
		this.color = color;
		this.model = model;
		this.engine = engine;
		this.doors = doors;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return this.color;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getEngine() {
		return engine;
	}

	public void setEngine(double engine) {
		this.engine = engine;
	}

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		if (doors==2 || doors ==4) {
			this.doors = doors;
		}
		else
		{
			System.out.println("Kapı sayısı sadece 2 veya 4 olabilir.");
		}
		
		
		
	}

	public void start() {
		System.out.println("Araba çalıştı");
	}
	
	public void stop() {
		System.out.println("Araba durdu...");
	}
	
	public void showInfos() {
		System.out.println("Arabanın rengi: " + this.color);
		System.out.println("Arabanın modeli: " + this.model);
		System.out.println("Arabanın motor hacmi: " + this.engine);
		System.out.println("Arabanın kapı sayısı: " + this.doors);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

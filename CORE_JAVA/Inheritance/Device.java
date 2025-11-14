package p1;

 class Device {

	String brand;
	String model;
	double price;
	
	
	Device(){
		
		brand="SAMSUNG";
		 model="J6";
		 price=12000;
		 
	}
	
	Device(String brand, String model, double price) {
		super();
		this.brand = brand;
		this.model = model;
		this.price = price;
	}

	String getBrand() {
		return brand;
	}

	void setBrand(String brand) {
		this.brand = brand;
	}

	String getModel() {
		return model;
	}

	void setModel(String model) {
		this.model = model;
	}

	double getPrice() {
		return price;
	}

	void setPrice(double price) {
		this.price = price;
	}
	
	void Display() {
		System.out.println("Brand Name :" +  this.brand);
		System.out.println("Brand Model :" + this.model);
		System.out.println("Brand Price :" + this.price);
		
	}
	
}
// device end here

class Mobile extends Device{
	
	int batterylife;
	int cameramp;
	
	Mobile(){
		super();
		batterylife=24;
		cameramp=48;
		
		
	}
	
	Mobile(String brand, String model, double price,int batterylife, int cameramp) {
		super(brand,model,price);
		this.batterylife = batterylife;
		this.cameramp = cameramp;
	}

	int getBatterylife() {
		return batterylife;
	}

	void setBatterylife(int batterylife) {
		this.batterylife = batterylife;
	}

	int getCameramp() {
		return cameramp;
	}

	void setCameramp(int cameramp) {
		this.cameramp = cameramp;
	}
	void Display() {
		super.Display();
		System.out.println("BatteryLife :" + this.batterylife + "hr");
		System.out.println("Camera Megapixel :" + this.cameramp + "Mp" );
	}
}
// mobile end here
class Tv extends Device{
	
	int screensize;
	String resolution;
	
	Tv(){
		super();
		
		
		screensize=72;
		resolution="4K";
	}
	
	
	Tv(String brand, String model, double price,int screensize, String resolution) {
		super(brand,model,price);
		this.screensize = screensize;
		this.resolution = resolution;
	}
	void Display() {
		super.Display();
		System.out.println("ScreeSize :" + this.screensize + "Inch");
		System.out.println("Resolution :" + this.resolution);
	}
	
	
}
class source_Device{
	
	
	public static void main(String[] args) {
		
		Device d1=new Device();
		d1.Display();
	}
}

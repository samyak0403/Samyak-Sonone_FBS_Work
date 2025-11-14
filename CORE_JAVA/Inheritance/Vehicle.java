package p1;




class Vehicle {
String brand;
String color;
double price;

Vehicle(){
	
	brand="Mahindra";
	color="Black";
	price=1500000;
	
}
Vehicle(String brand, String color, double price) {
	
	this.brand = brand;
	this.color = color;
	this.price = price;
}
String getBrand() {
	return brand;
}
void setBrand(String brand) {
	this.brand = brand;
}
String getColor() {
	return color;
}
void setColor(String color) {
	this.color = color;
}
double getPrice() {
	return price;
}
void setPrice(double price) {
	this.price = price;
}
void Display() {
	
	System.out.println("Vehicle Brand :" + this.brand);
	System.out.println("Vehicle Color :" + this.color);
	System.out.println("Vehicle Price :" + this.price);
	
}
}
//vehicle end here

class Car extends Vehicle
{
	 int NoOfGears;

	 
	 Car(){
		 super();
		 
		 NoOfGears =5;
		 
	 }
	 Car(String brand, String color, double price,int noOfGears) {
		super(brand,color,price);
		NoOfGears = noOfGears;
	 }

	 int getNoOfGears() {
		 return NoOfGears;
	 }

	 void setNoOfGears(int noOfGears) {
		 NoOfGears = noOfGears;
	 }
	 void Display() {
		 super.Display();
		 System.out.println("No Of Gears :" + this.NoOfGears);
	 }
}
//car end here
class Bike extends Vehicle

{
int NoOfSeat;

Bike(){
	 super();
	 
	 NoOfSeat=2;
}

Bike(String brand, String color, double price,int noOfSeat) {
	super(brand,color,price);
	NoOfSeat = noOfSeat;
}

int getNoOfSeat() {
	return NoOfSeat;
}

void setNoOfSeat(int noOfSeat) {
	NoOfSeat = noOfSeat;
}
void Display()
{
	 super.Display();
	 System.out.println("No Of Seats :" + this.NoOfSeat);
}

}




class Test{
	 public static void main(String[] args) {
		
		 Vehicle v1=new Vehicle();
		 v1.Display();
		 System.out.println("\n");
		 Car c1=new Car();
		 c1.Display();
		 System.out.println("\n");
		 Bike b1=new Bike();
		 b1.Display();
		 System.out.println("\n");
		 
		 Vehicle v2=new Vehicle ("BMW","Blue",10000000);
		 v2.Display();
		 
		 
		 
		 
		 
	}
}



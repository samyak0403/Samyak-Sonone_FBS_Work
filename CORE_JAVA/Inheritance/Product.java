package p1;


public class Product {

	
	String product_name;
	double price;
	int stock;
	
	Product(){
		product_name="Shampoo";
		price=100;
		stock=1000;
		
		
	}
	
	
	Product(String product_name, double price, int stock) {
	
		this.product_name = product_name;
		this.price = price;
		this.stock = stock;
	}


	String getProduct_name() {
		return product_name;
	}


	void setProduct_name(String product_name) {
		this.product_name = product_name;
	}


	double getPrice() {
		return price;
	}


	void setPrice(double price) {
		this.price = price;
	}


	int getStock() {
		return stock;
	}


	void setStock(int stock) {
		this.stock = stock;
	}
	void Display() {
		

		System.out.println("Product Name : " + this.product_name);
		System.out.println("Product price :" + this.price);
		System.out.println("product Stock :" + this.stock);
		
	}
	
}
//Product end here

class Electronics extends Product{
	int waranty;
	String brnd;
	
	Electronics(){
		super();
		
		waranty=4;
		 brnd="Clinicplus";
		 
		
	}
	
	Electronics(String product_name, double price, int stock,int waranty, String brnd) {
		super(product_name,price, stock);
		
		this.waranty = waranty;
		this. brnd= brnd;
	}

	int getWaranty() {
		return waranty;
	}

	void setWaranty(int waranty) {
		this.waranty = waranty;
	}

	String getBrnd() {
		return brnd;
	}

	void setBrnd(String brnd) {
		this.brnd = brnd;
	}
	void Display() {
		super.Display();
		System.out.println("Product Waranty :" + this.waranty);
		System.out.println("product Brand :" + this.brnd);
	}
}
// Electronics end here

class Grocery extends Product{
	
	String expiry_date;
	double weight;
	
	Grocery(){
		super();
		
		expiry_date="26_june";
		weight=12;
		
		
	}
		
	
	Grocery(String product_name, double price, int stock,String expiry_date, double weight) {
		super(product_name,price, stock);
		this.expiry_date = expiry_date;
		this.weight = weight;
	}


	String getExpiry_date() {
		return expiry_date;
	}


	void setExpiry_date(String expiry_date) {
		this.expiry_date = expiry_date;
	}


	double getWeight() {
		return weight;
	}


	void setWeight(double weight) {
		this.weight = weight;
	}
	
	void Display() {
		super.Display();
		System.out.println("Product Expiry Date :" + this.expiry_date);
		System.out.println("Product Weight :" + this.weight + "Kg");
	}
}
// Grocery end here
class Test6{
	
	public static void main(String[] args) {
		Product p1=new Product();
		p1.Display();
	}
}
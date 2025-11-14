package p1;


public class Flight {

	int flight_no;
	String airlines;
	String source;
	
	
	Flight(){
		
		flight_no=101;
		airlines="INDIA";
		source="MUMBAI";
		
	}
	
	
	Flight(int flight_no, String airlines, String source) {

		this.flight_no = flight_no;
		this.airlines = airlines;
		this.source = source;
	}


	int getFlight_no() {
		return flight_no;
	}


	void setFlight_no(int flight_no) {
		this.flight_no = flight_no;
	}


	String getAirlines() {
		return airlines;
	}


	void setAirlines(String airlines) {
		this.airlines = airlines;
	}


	String getSource() {
		return source;
	}


	void setSource(String source) {
		this.source = source;
	}
	void Display() {
		
		
		System.out.println("Flight No :" + this.flight_no);
		System.out.println("Airlines :"  + this.airlines);
		System.out.println("Source :" + this.source);
		
	}
	
	
	
}
//flight end here
class Domestic extends Flight{
	
	double distance;
	boolean mealinclude;
	
	Domestic(){
		super();
		distance=1000;
		mealinclude=true;
		
	}
	
	Domestic(int flight_no, String airlines, String source,double distance, boolean mealinclude) {
		super(flight_no, airlines,source);
		this.distance = distance;
		this.mealinclude = mealinclude;
	}

	double getDistance() {
		return distance;
	}

	void setDistance(double distance) {
		this.distance = distance;
	}

	boolean isMealinclude() {
		return mealinclude;
	}

	void setMealinclude(boolean mealinclude) {
		this.mealinclude = mealinclude;
	}
	void Display() {
		super.Display();
		System.out.println("Distance :" + this.distance);
		
		System.out.println("MealInclude " + this.mealinclude);
	}
}
//Domestic end here

class InternationFlight extends Flight{
	
	String destinationcountry;
	double baggagelimt;
	
	InternationFlight(){
		super();
		
		destinationcountry="America";
		baggagelimt=25.2;
		
		
		
		
	}
	InternationFlight(int flight_no, String airlines, String sourc,String destinationcountry, double baggagelimt)
	{
		super(flight_no, airlines,sourc);
		this.destinationcountry = destinationcountry;
		this.baggagelimt = baggagelimt;
	}
	String getDestinationcountry() {
		return destinationcountry;
	}
	void setDestinationcountry(String destinationcountry) {
		this.destinationcountry = destinationcountry;
	}
	double getBaggagelimt() {
		return baggagelimt;
	}
	void setBaggagelimt(double baggagelimt) { //SocialMediaAccount
		this.baggagelimt = baggagelimt;
	}
	void Display() {
		super.Display();
		System.out.println("Destination :" + this.destinationcountry);
		System.out.println("Baggage limit :" + this.baggagelimt);
	}
	
}
// internationfloght end here

class Test7 {
	
	public static void main(String[] args) {
		Flight f1=new Flight ();
		f1.Display();
	}
}

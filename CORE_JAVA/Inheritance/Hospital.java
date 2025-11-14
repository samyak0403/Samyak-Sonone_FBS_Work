package p1;

 class Hospital {

	String hospitalname;
	String location;
	int capacity;
	
	
	Hospital(){
		hospitalname="Galaxy";
		location="Mubai";
		capacity=1000;
		
		
	}
	
	
	Hospital(String hospitalname, String location, int capacity) {
		super();
		this.hospitalname = hospitalname;
		this.location = location;
		this.capacity = capacity;
	}


	String getHospitalname() {
		return hospitalname;
	}


	void setHospitalname(String hospitalname) {
		this.hospitalname = hospitalname;
	}


	String getLocation() {
		return location;
	}


	void setLocation(String location) {
		this.location = location;
	}


	int getCapacity() {
		return capacity;
	}


	void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	void Display() {
		
		System.out.println("Hospital Name :" + this.hospitalname);
		System.out.println("Hospital Name :" + this.location);
		System.out.println("Hospital Capacity :" + this.capacity);
		
	}
	
}
// Hospital end here

class Doctor extends Hospital{
	
	String specilization;
	int year_of_experice;
	
	Doctor(){
		specilization="Cardiology";
		year_of_experice=12;
		
	}
	
	
	Doctor(String hospitalname, String location, int capacity,String specilization, int year_of_experice) {
		super( hospitalname,location,capacity);
		this.specilization = specilization;
		this.year_of_experice = year_of_experice;
	}


	String getSpecilization() {
		return specilization;
	}


	void setSpecilization(String specilization) {
		this.specilization = specilization;
	}


	int getYear_of_experice() {
		return year_of_experice;
	}


	void setYear_of_experice(int year_of_experice) {
		this.year_of_experice = year_of_experice;
	}
	void Display() {
		
		super.Display();
		System.out.println("Specilization :" + this.specilization);
		System.out.println("Experince :" + this.year_of_experice);
	}
	
	
	
}
// Doctor end here

class Nurse extends Hospital{
	String shift;
	int patien_assinged;
	
	Nurse(){
		super();
		
		shift="Night";
		patien_assinged=20;
		
	}
	
	Nurse(String hospitalname, String location, int capacity,String shift, int patien_assinged) 
	{
		super (hospitalname,location,capacity);
		this.shift = shift;
		this.patien_assinged = patien_assinged;
	}

	String getShift() {
		return shift;
	}

	void setShift(String shift) {
		this.shift = shift;
	}

	int getPatien_assinged() {
		return patien_assinged;
	}

	void setPatien_assinged(int patien_assinged) {
		this.patien_assinged = patien_assinged;
	}
	void Display() {
		
		super.Display();
		System.out.println("Nurse Shift :" + this.shift);
		System.out.println("Patient Assinged :" + this.patien_assinged);
		
	}
	
}
// Nurse end here

class wardboy extends Hospital{
	
	String assingedward;
	int duty_hour;
	
	wardboy(){
		super();
		assingedward="General Ward A";
		duty_hour=8;
		
		
	}
	
	wardboy(String hospitalname, String location, int capacity,String assingedward, int duty_hour) {
		super(hospitalname,location,capacity);
		this.assingedward = assingedward;
		this.duty_hour = duty_hour;
	}

	String getAssingedward() {
		return assingedward;
	}

	void setAssingedward(String assingedward) {
		this.assingedward = assingedward;
	}

	int getDuty_hour() {
		return duty_hour;
	}

	void setDuty_hour(int duty_hour) {
		this.duty_hour = duty_hour;
	}
	void Display() {
		
		super.Display();
		System.out.println("Assinged Ward :" + this.assingedward);
		System.out.println("Duty Hour :" + this.duty_hour + "hr");
	}
	
}
class source_Hospital{
	
	public static void main(String[] args) {
		
		Hospital h1=new Hospital();
		h1.Display();
		System.out.println("\n");
		Doctor d1=new Doctor();
		d1.Display();
		System.out.println("\n");
		Nurse n1=new Nurse ();
		n1.Display();
		System.out.println("\n");
		 wardboy w1=new  wardboy();
		 w1.Display();
		
		
	}
	
	
}










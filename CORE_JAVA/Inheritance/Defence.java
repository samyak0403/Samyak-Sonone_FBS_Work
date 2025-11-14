package p1;



public class Defence {

	String Nameofhed;
	int nooftrops;
	int noofvehicle;
	String countryname;
	int noofmission;
	String locationofheadquaters;
	int noofdept;
	
	
	Defence(){
		Nameofhed="C.abhinadan";
		nooftrops=25;
		noofvehicle=100;
		countryname="india";
		noofmission=1;
		locationofheadquaters ="kashmir";
		noofdept=3;
				
		
	}
	
Defence(String nameofhed, int nooftrops, int noofvehicle, String countryname, int noofmission,
			String locationofheadquaters, int noofdept) {
		super();
		Nameofhed = nameofhed;
		this.nooftrops = nooftrops;
		this.noofvehicle = noofvehicle;
		this.countryname = countryname;
		this.noofmission = noofmission;
		this.locationofheadquaters = locationofheadquaters;
		this.noofdept = noofdept;
	}

String getNameofhed() {
	return Nameofhed;
}

void setNameofhed(String nameofhed) {
	Nameofhed = nameofhed;
}

int getNooftrops() {
	return nooftrops;
}

void setNooftrops(int nooftrops) {
	this.nooftrops = nooftrops;
}

int getNoofvehicle() {
	return noofvehicle;
}

void setNoofvehicle(int noofvehicle) {
	this.noofvehicle = noofvehicle;
}

String getCountryname() {
	return countryname;
}

void setCountryname(String countryname) {
	this.countryname = countryname;
}

int getNoofmission() {
	return noofmission;
}

void setNoofmission(int noofmission) {
	this.noofmission = noofmission;
}

String getLocationofheadquaters() {
	return locationofheadquaters;
}

void setLocationofheadquaters(String locationofheadquaters) {
	this.locationofheadquaters = locationofheadquaters;
}

int getNoofdept() {
	return noofdept;
}

void setNoofdept(int noofdept) {
	this.noofdept = noofdept;
}
	void Display() {
		System.out.println("Name OF Head :" + this.Nameofhed);
		System.out.println("No of troops :" + this.nooftrops);
		System.out.println("No Of Vehicle :" + this.noofvehicle);
		System.out.println("Countr Name :" + this.countryname);
		System.out.println("No Of Mission :" + this.noofmission);
		System.out.println("Location :" + this.locationofheadquaters);
		System.out.println("No of department :" + this.noofdept);
	}
	
}
// defence end here



class Army extends Defence
{
	int nooftanks;
	int noofguns;
	int noofgrandan;
	String nameofbatlian;
	
	Army(){
		super();
		nooftanks=25;
		noofguns=100;
		noofgrandan=10;
		nameofbatlian="MAHAR";
	}
	
	
	
	Army(String nameofhed, int nooftrops, int noofvehicle, String countryname, int noofmission,
			String locationofheadquaters, int noofdept,int nooftanks, int noofguns, int noofgrandan, String nameofbatlian) {
		
		super(nameofhed,nooftrops,noofvehicle,countryname,noofmission,locationofheadquaters,noofdept);
		this.nooftanks = nooftanks;
		this.noofguns = noofguns;
		this.noofgrandan = noofgrandan;
		this.nameofbatlian = nameofbatlian;
	}



	int getNooftanks() {
		return nooftanks;
	}



	void setNooftanks(int nooftanks) {
		this.nooftanks = nooftanks;
	}



	int getNoofguns() {
		return noofguns;
	}



	void setNoofguns(int noofguns) {
		this.noofguns = noofguns;
	}



	int getNoofgrandan() {
		return noofgrandan;
	}



	void setNoofgrandan(int noofgrandan) {
		this.noofgrandan = noofgrandan;
	}



	String getNameofbatlian() {
		return nameofbatlian;
	}



	void setNameofbatlian(String nameofbatlian) {
		this.nameofbatlian = nameofbatlian;
	}
	void Display() {
		
		super.Display();
		System.out.println("No of Tanks :" + this.nooftanks);
		System.out.println("No of Guns :" + this.noofguns);
		System.out.println("No Of grandon :" + this.noofgrandan);
		System.out.println("Name Of Batalin :" + this.nameofbatlian);
	}
}
// Army end here
class Navy extends Defence

{
	int noofships;
	int noofsubmarine;
	int nooftorpedos;
	
	
	Navy(){
		super();
		noofships=20;
		noofsubmarine=10;
		nooftorpedos=5;
		
	}
	
	Navy(String nameofhed, int nooftrops, int noofvehicle, String countryname, int noofmission,
			String locationofheadquaters, int noofdept,int noofships, int noofsubmarine, int nooftorpedos) 
	{
		super(nameofhed,nooftrops,noofvehicle,countryname,noofmission,locationofheadquaters,noofdept);
		this.noofships = noofships;
		this.noofsubmarine = noofsubmarine;
		this.nooftorpedos = nooftorpedos;
	}
	int getNoofships() {
		return noofships;
	}

	void setNoofships(int noofships) {
		this.noofships = noofships;
	}

	int getNoofsubmarine() {
		return noofsubmarine;
	}

	void setNoofsubmarine(int noofsubmarine) {
		this.noofsubmarine = noofsubmarine;
	}

	int getNooftorpedos() {
		return nooftorpedos;
	}

	void setNooftorpedos(int nooftorpedos) {
		this.nooftorpedos = nooftorpedos;
	}

	void Display() {
		super.Display();
		System.out.println("No Of Ships :" + this.noofships);
		System.out.println("No Of Submarine :" + this.noofsubmarine);
		System.out.println("No of Toreedos :" + this.nooftorpedos);
	}

}
//Navy end here

class Airforce extends Defence

{
	int noofmissile;
	String aircraft;
	int Noofsqardon;
	
	Airforce(){
		
		super();
		noofmissile=200;
		aircraft="punjab";
		Noofsqardon=50;
	}
	
	
	Airforce(String nameofhed, int nooftrops, int noofvehicle, String countryname, int noofmission,
			String locationofheadquaters, int noofdept,int noofmissile, String aircraft, int noofsqardon) {
		super(nameofhed,nooftrops, noofvehicle,countryname,noofmission,locationofheadquaters, noofdept);
		this.noofmissile = noofmissile;
		this.aircraft = aircraft;
		Noofsqardon = noofsqardon;
	}


	int getNoofmissile() {
		return noofmissile;
	}


	void setNoofmissile(int noofmissile) {
		this.noofmissile = noofmissile;
	}


	String getAircraft() {
		return aircraft;
	}


	void setAircraft(String aircraft) {
		this.aircraft = aircraft;
	}


	int getNoofsqardon() {
		return Noofsqardon;
	}


	void setNoofsqardon(int noofsqardon) {
		Noofsqardon = noofsqardon;
	}
	void Display() {
		super.Display();
		System.out.println("No Of Missile :" + this.noofmissile);
		System.out.println("No of Aircraft :" + this.aircraft);
		System.out.println("No Of sqaurdon :" + this.Noofsqardon);
	}
	
}
//Airforce end here
class Test3{
	public static void main(String[] args) {
		Defence d1=new Defence();
		d1.Display();
		
		System.out.println("\n");
		Army a1 =new Army();
		a1.Display();
		
		System.out.println("\n");
		
		Navy n1=new Navy();
		n1.Display();
		
		System.out.println("\n");
		
		Airforce Af1= new Airforce();
		Af1.Display();
		
	}
}




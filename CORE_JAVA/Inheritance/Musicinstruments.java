package p1;

public class Musicinstruments {
String name;
String type;


Musicinstruments(){
	
	name="tabla";
	
	type="Drum";
}

void play() {
	System.out.println("sounds");
}

Musicinstruments(String name, String type) {
	super();
	this.name = name;
	this.type = type;
}



String getName() {
	return name;
}



void setName(String name) {
	this.name = name;
}



String getType() {
	return type;
}



void setType(String type) {
	this.type = type;
}
void Display() {
	
	
	System.out.println("Name :" + this.name);
	System.out.println("Type :" + this.type);
	
	
}
}
// Musicinstruments end here


class guitar extends Musicinstruments{
	
	
	int no_of_strings;

	guitar(){
		super();
		no_of_strings=6;
	}
	
	
	guitar(String name, String type,int no_of_strings) {
		super(name,type);
		this.no_of_strings = no_of_strings;
	}


	int getNo_of_strings() {
		return no_of_strings;
	}


	void setNo_of_strings(int no_of_strings) {
		this.no_of_strings = no_of_strings;
	}
	void Display() {
		super.Display();
		System.out.println("No Of string :" + this.no_of_strings);
	}
	void play() {
		System.out.println("Strumming the guitar");
	}
}
//giutar end here


class drum extends Musicinstruments{
	
	
	
	int no_of_drums;

	drum(){
		super();
		 no_of_drums=5;
	}
	
	drum(String name, String type,int no_of_drums) {
		super(name,type);
		this.no_of_drums = no_of_drums;
	}

	int getNo_of_drums() {
		return no_of_drums;
	}

	void setNo_of_drums(int no_of_drums) {
		this.no_of_drums = no_of_drums;
	}
	
	void Display() {
		super.Display();
		System.out.println("No of Drums :" + this.no_of_drums);
	}
void play() {
	System.out.println("drum is Bang");
}
	
}
// drum end here

class source_Musicinstruments{
	
	public static void main(String[] args) {
		Musicinstruments m1=new Musicinstruments();
		m1.Display();
		m1.play();
		System.out.println("\n");
		guitar g1= new guitar ();
		g1.Display();
		g1.play();
		drum d1=new drum();
		d1.Display();
		d1.play();
	}
}
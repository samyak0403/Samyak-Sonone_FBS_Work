package p1;



class Person {

	String name;
	int age;
	String address;
	
	Person(){
		
		name="Sammy";
		age=22;
		address="Akoli";
	}
	
	
	
	Person(String name, int age, String address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	int getAge() {
		return age;
	}
	void setAge(int age) {
		this.age = age;
	}
	String getAddress() {
		return address;
	}
	void setAddress(String address) {
		this.address = address;
	}
	void Display() {
		
		System.out.println("Person Name :" + this.name);
		System.out.println("Person age :"+ this.age);
		System.out.println("Person address :" + this.address);
	}
	 
}
//person end here
class Student extends Person
{
	
	 int rollno;
	 String course;
	 
	 Student(){
		 rollno=10;
		 course="Engineering";
	 }
	 
	 Student(String name, int age, String address,int rollno, String course) {
		super(name,age,address);
		this.rollno = rollno;
		this.course = course;
	 }


	 int getRollno() {
		 return rollno;
	 }


	 void setRollno(int rollno) {
		 this.rollno = rollno;
	 }


	 String getCourse() {
		 return course;
	 }


	 void setCourse(String course) {
		 this.course = course;
	 }
	 void Display() {
		super.Display();
		 System.out.println("Student rollno :" + this.rollno);
		 System.out.println("Student Course " + this.course);
	 }
}
//student end here
class Test2{
	 public static void main(String[] args) {
		Person p1=new Person();
		p1.Display();
	}
}

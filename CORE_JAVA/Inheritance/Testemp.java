package p1;



class Employee {

	int Id;
	String Name;
	double Salary;
	
	
Employee(){
		
	 Id=1;
	 Name="NA";
  Salary=2000; 
		
	}
Employee(int id, String name, double salary) {
		
		Id = id;
		Name = name;
		Salary = salary;
	}



	int getId() {
		return Id;
	}
	void setId(int id) {
		Id = id;
	}
	String getName() {
		return Name;
	}
	void setName(String name) {
		Name = name;
	}
	double getSalary() {
		return Salary;
	}
	void setSalary(double salary) {
		Salary = salary;
	}
	void Display() {
		System.out.println("Employee Id :" + this.Id);
		System.out.println("Employee Name :" + this.Name);
		System.out.println("Employee salary :" + this.Salary);
	}
	
}
//Employee End here

class Admin extends Employee
{
	 
double allowance; //step 1
		
Admin(){
			
			super();
			allowance=100;
		}
		
		
		Admin(int id, String name, double salary, double allowance) {
			
			super(id,name,salary);
			this.allowance = allowance;
		}
		int getId() {
			return Id;
		}
		void setId(int id) {
			Id = id;
		}
		String getName() {
			return Name;
		}
		void setName(String name) {
			Name = name;
		}
		double getSalary() {
			return Salary;
		}
		void setSalary(double salary) {
			Salary = salary;
		}
		double getAllowance() {
			return allowance;
		}
		void setAllowance(double allowance) {
			this.allowance = allowance;
		}
		void Display() {
			super.Display();
			System.out.println("Employee allowance :" + this.allowance);
		}
}






class SalesManager extends Employee
{
	double incentive;
	int Target;
	
	
SalesManager(){
		super();
		
		incentive=150;
	}
	
	
	SalesManager(int id, String name, double salary,double incentive, int target) {
		super(id,name,salary);
		this.incentive = incentive;
		Target = target;
	}
	double getIncentive() {
		return incentive;
	}
	void setIncentive(double incentive) {
		this.incentive = incentive;
	}
	int getTarget() {
		return Target;
	}
	void setTarget(int target) {
		Target = target;
	}
	void Display() {
		super.Display();
		System.out.println("incentive :" + this.incentive);
		System.out.println("target :" + this.Target);
	}
}
//SalesManager end here

 class Testemp {
public static void main(String []args) {
	
	Employee e1=new Employee();
	e1.Display();
	
	System.out.println("\n");
	Employee e2= new Employee(25,"Sammi",2745);
	e2.Display();
	System.out.println("\n");
	Admin a1=new Admin(65,"Mummy",82000,200.0);
	a1.Display();
	
	
	System.out.println("\n");
	SalesManager sm1=new SalesManager(47,"Pratiksha",90000,4000,10);
	sm1.Display();
	
	
	
	
}
}

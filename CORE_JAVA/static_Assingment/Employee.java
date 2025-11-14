//Q2. Design a class Employee with instance variables name, basicSalary, and a static variable companyBonusRate.
//Add a static method to change the bonus rate.
//Add a non-static method calculateTotalSalary() that calculates total salary as basicSalary + (basicSalary × companyBonusRate / 100).


class Employee{


String Name;
double BasicSalary;
static double BonusRate;
double calculateTotalSalary;

static{

BonusRate=12.5;
}
void setName(String Name){
this.Name=Name;
}

void setBasicSalary(double BasicSalary ){
this.BasicSalary=BasicSalary;
}

static void setBonusRate(double BonusRate){
Employee.BonusRate=BonusRate;
}
//set end here

String getName(){
 return this.Name;
}

double getBasicSalary(){
 return this.BasicSalary;
}

double  calculateTotalSalary(){
return BasicSalary + (BasicSalary * BonusRate / 100);
}

//get End here

Employee(){

this.Name="not assinged";

this.BasicSalary=0.0;
}
//default constructor end here

Employee(String Name,double BasicSalary){
this.Name=Name;
this.BasicSalary=BasicSalary;
}

//parameterize cnstructr end here

void Display(){

System.out.println("\n--- Employee Salary Details ---");
System.out.println("Enter Name :" + Name);
System.out.println("Enter Salary :" + BasicSalary);
System.out.println("Enter BonusRate : " + BonusRate + "%");
System.out.println("Total salary :₹"+ calculateTotalSalary());
}
 }

class Test{

public static void main(String [] args){

Employee e1=new Employee("Sammy",50000);
Employee e2=new Employee("Sammi",45000);

e1.Display();
e2.Display();

Employee.setBonusRate(13.5);
e1.Display();
e2.Display();

 }
}











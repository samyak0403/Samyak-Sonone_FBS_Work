//Q1. Design a class ElectricityBill with a static variable ratePerUnit. Each object will have customer details and number of units consumed. Use a static method to change the rate. //Calculate bill using a non-static method.




class ElectricityBill{

int CustomerId;
String CustomerName;
double UnitConsumed;
static double RatePerUnit;
double totalBill;


static{

RatePerUnit=6.5;
}
//static end here

void setCustomerId(int CustomerId){

this.CustomerId=CustomerId;
}

void setCustomerName(String CustomerName){
this.CustomerName=CustomerName;
}

void setUnitConsumed(double  UnitConsumed){
this.UnitConsumed= UnitConsumed;
}

static void setRatePerUnit(double RatePerUnit){
ElectricityBill.RatePerUnit=RatePerUnit;
}

void CalulateBill() {

this.totalBill = RatePerUnit * UnitConsumed;
}

//set end here
int getCustomerId(){
return this.CustomerId;
}

String getCustomerName(){
return this.CustomerName;
}

double getUnitConsumed(){
return this.UnitConsumed;
}
double getTotalBill(){

return this.totalBill;
}

//get end here

 ElectricityBill(){
this.CustomerId=0;
this.CustomerName="not assongied";
this. UnitConsumed=0;
this.totalBill = 0;
}
//default constructor end here


ElectricityBill(int CustomerId,String CustomerName,double UnitConsumed){

this.CustomerId=CustomerId;
this.CustomerName=CustomerName;
this.UnitConsumed= UnitConsumed;
this.totalBill =totalBill;
}
//parametrized constructor end here

void Display(){

System.out.println("\n--- Electricity Bill ---");
System.out.println("Enter Id :" + CustomerId);
System.out.println("Enter Name :" + CustomerName);
System.out.println("Enter Unit :" + UnitConsumed);
System.out.println("Enter Rate :"+ RatePerUnit );
System.out.println("Total Bill :" +totalBill);

  }
}

class Test{

public static void main(String []args){

ElectricityBill b1=new ElectricityBill(101,"Sammy",120);
ElectricityBill b2=new ElectricityBill(102,"Sammi",125);

 b1.CalulateBill();
 b2.CalulateBill();


b1.Display();
b2.Display();

ElectricityBill.setRatePerUnit(7.5);

b1.CalulateBill();
 b2.CalulateBill();


b1.Display();
b2.Display();

  }
}



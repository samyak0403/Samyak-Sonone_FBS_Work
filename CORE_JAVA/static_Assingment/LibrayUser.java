
//Q3. Problem:
//Design a class LibraryUser with name, daysLate as instance variables, and finePerDay as a static variable.
//Create a method calculateFine() that multiplies daysLate with finePerDay.



class LibraryUser{

String Name;
int DaysLate;
static double FinePerDay;

static {

FinePerDay=5.6;
}
void setName(String Name){

this.Name=Name;
}
void setDaysLate(int DaysLate){
this.DaysLate=DaysLate;
}
static  void setFinePerDay(double FinePerDay){
LibraryUser.FinePerDay=FinePerDay;
}

//set end here

String getName(){
 return this.Name=Name;
}
int getDaysLate(){
return this.DaysLate=DaysLate;
}

double  CalculateFine(){

return DaysLate * FinePerDay;
}

LibraryUser(){

this.Name=Name;
this.DaysLate=DaysLate;
this.FinePerDay=FinePerDay;
}
//default constructor end here

LibraryUser(String Name,int DaysLate){
this.Name=Name;
this.DaysLate=DaysLate;
}
//get end here

void Display(){

System.out.println("\n---- Deatils -----");
System.out.println(" Name :" + Name);
System.out.println("DaysLate :" + DaysLate);
System.out.println("FinePerDay :" + FinePerDay);
System.out.println("totalfine  :" + CalculateFine());
 }
}

class Test {

public static void main(String []args){


LibraryUser l1=new LibraryUser("Sammy",7);
LibraryUser l2=new LibraryUser("Sammi",5);

l1.Display();
l2.Display();

LibraryUser.setFinePerDay(7.5);
l1.Display();
l2.Display();

 }
}












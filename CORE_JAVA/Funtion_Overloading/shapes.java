class shape{

void area(double base, double height){

double Result = 0.5 * base * height;

System.out.println("Area of tringle =" + Result);

}
//tringle end here

void area(int lenght, int breadth){

int Result = lenght * breadth;
System.out.println("Area of rectangle =" + Result);

}
//rectangle end here

void area(double radius){

double Result=3.14 * radius * radius;
System.out.println("Area of circle =" + Result);

 
}


} 

//class shape end here

class Test

{


 public static void main(String [] args){

shape s = new shape();

        s.area(10.0, 5.0);  
        s.area(8, 6);      
        s.area(4.5);

}
  }



























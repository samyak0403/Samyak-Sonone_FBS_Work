class calculator{

void add(int a, int b){

System.out.println("fun1");
System.out.println(a+b);
}

 void add(int a, double b){

System.out.println("fun2");
System.out.println(a+b);
}

void add(double a, double b){

System.out.println("fun3");
System.out.println(a+b);
}


void add(double  b, int a){

System.out.println("fun4");
System.out.println(a+b);
}

//add end here
void substract(int a, int b){

System.out.println("fun1");
System.out.println(a-b);
}

 void substract(int a, double b){

System.out.println("fun2");
System.out.println(a-b);
}

void substract(double a, double b){

System.out.println("fun3");
System.out.println(a-b);
}

void substract(double  b, int a){

System.out.println("fun4");
System.out.println(a-b);
}

//substract end here


void multiply(int a, int b){

System.out.println("fun4");
System.out.println(a*b);
}

void multiply(int a, double b){

System.out.println("fun4");
System.out.println(a*b);
}

void multiply(double a, double b){

System.out.println("fun4");
System.out.println(a*b);
}

void multiply(double  b, int a){

System.out.println("fun4");
System.out.println(a*b);
}

//multilply end here

void divide(int a, int b){

System.out.println("fun4");
System.out.println(a/b);
}

void divide(int a, double b){

System.out.println("fun4");
System.out.println(a/b);
}

void divide(double a, double b){

System.out.println("fun4");
System.out.println(a/b);
}

void divide(double  b, int a){

System.out.println("fun4");
System.out.println(a/b);
}








 }

class Test{

public static void main(String[] args){

calculator c1=new calculator();
c1.add(1,1);
c1.add(1,2.5);
c1.add(2.5,3.5);
c1.add(1.5,1);

c1.substract(1,1);
c1.substract(1,2.5);
c1.substract(2.5,3.5);
c1.substract(1.5,1);

c1.divide(1,1);
c1.divide(1,2.5);
c1.divide(2.5,3.5);
c1.divide(1.5,1);





  }

}





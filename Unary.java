//some test unary operater in java 
class Example {

	static int x=1;
	Example(){
	
	System.out.println(" constructor excection ");
	}//end of the constructor
}//end of the class Example
class Unary {
	public static void main(String[] args) {
	int i1=+5;System.out.println(i1);
int i2=-6;System.out.println(i2);
boolean b=!true; System.out.println(b);
System.out.println(~5);//inramnt +1
System.out.println(~10);
System.out.println(~12);
System.out.println(~13);
 int y=Example.x+new Example().x;
 System.out.println(y);
 Example.x=1;
 int z=new Example().x+Example.x++;
 System.out.println(z);

		//System.out.println("Hello World!");
	}//end of the main method 
}//end of the class unary 

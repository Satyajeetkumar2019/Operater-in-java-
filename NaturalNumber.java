import java.util.Scanner;
class NaturalNumber 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
//fatorial  of a programe
int factorial=1;
for(int i=1;i<n;i++){
factorial=factorial*i;
	
}
System.out.println(factorial);




		/*
for(int i=1;i<=10;i++){

System.out.println(n+"*"+i+"=" +i*n);
}//end of the for loop 
*/
		/*
		for(int i=1;i<=n;i++){
		System.out.println(i);
		}*/
		//even natural numbr print 
		/*
for(int i=0;i<=10;i++){
if(i%2!=0)
	System.out.println(i);
}*/
		/*
		//natrural nuber print in reversr order 
		for(int i=10;i>=1;i--){
		System.out.print(i+"\n");
		}//end of the for loop
*/

	}//endd of the main method 
}//end of the class

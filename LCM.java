//to Calculate the lcm of given number
import java.util.Scanner;
class LCM {

	public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
		System.out.println("entr the two number :");
		int a=scn.nextInt();
		//scn.nextInt();
		int b=scn.nextInt();
		int lcm;
		for(lcm=1;lcm<a*b;lcm++){
		if(lcm%a==0&&lcm%b==0)
			//System.out.println(lcm);
		break;
		//==lcm++;
		}
System.out.println(lcm);

	}//END of the main method 
}//end of the class

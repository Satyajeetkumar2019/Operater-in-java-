class Logical{ 
	public static void main(String[] args) {
		//some test case 
	//System.out.println(5 && 6);//ce not int value only boolean value
     System.out.println(true&&true);//true
	 System.out.println(true&&false);//false
	 System.out.println(false&&false);//false
    System.out.println(false&&true);//false
	System.out.println();
	System.out.println(m1()&&m2());//false
	System.out.println(m2()&&m1());//false
	System.out.println();
	//System.out.println(23||23);//ce only one boolean value not int 
	System.out.println(true||true);//true
	System.out.println(true|| false);//true
	System.out.println(false||true);//true
	System.out.println(false||false);//false
	System.out.println();
	System.out.println(m1()||m2());//true
	System.out.println(m2()||m1());//true







	//	System.out.println("");



	}//end of the main method 
static boolean m1(){
System.out.println("Frome m1");
return false;
}//end 0f the m1 method 
static boolean m2(){
System.out.println("Frome m2");
return true;
}//end of the m2 method 

}//end of the class

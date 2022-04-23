class Bitwise{ 

	public static void main(String[] args) {
	
		System.out.println(5&6);//0101&0001=0100=4 boolan value only contn 
		System.out.println(12&6);
		System.out.println(true&true);//true
		System.out.println(true&false);//false
		System.out.println(false&true);//false
		System.out.println(false&false);//false
		System.out.println();
		System.out.println(m1()& m2());//false
		System.out.println(m2()& m1());//false
		System.out.println(5|6);//7
		System.out.println(true&true);//true
		System.out.println(true&false);//false
		System.out.println(false&true);//false
		System.out.println(false&false);//false
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

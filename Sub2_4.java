import java.util.Scanner;
//import the Scanner class
class Sub2_4{
	public static void main(String[] args){
	Scanner a = new Scanner(System.in);
	// create a Scanner object
		System.out.println("enter the first number");
		int x = a.nextInt();
		
		System.out.println("enter the second number");
		int y = a.nextInt();
		
		int Sub = x-y;
		System.out.println("Sub of two given numbers = " + Sub);
	}
}
import java.util.Scanner;//import the Scanner class
class Multiplication1_4{
	public static void main(String[] args){
	Scanner a = new Scanner(System.in);
	//create a scanner object
	
	System.out.println("enter the first number");
	int x = a.nextInt();
	
	System.out.println("enter the second number");
	int y = a.nextInt();
	
	int multiplication = x*y;
	System.out.println("multiplication of given two numbers = " + multiplication);
	}
}
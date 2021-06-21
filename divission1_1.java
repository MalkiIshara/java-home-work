import java.util.Scanner;//import the Scanner class
class divission1_1{
	public static void main(String[] args){
	Scanner a = new Scanner(System.in);
	//create a Scanner object
	
	System.out.println("enter the first number");
	int x = a.nextInt();
	
	System.out.println("enter the second number");
	int y = a.nextInt();
	
	int ans = x/y;
	System.out.println("divission of given two numbers = " + ans );
	}
}
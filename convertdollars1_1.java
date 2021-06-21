import java.util.Scanner;//import the Scanner class
class convertdollars1_1{
	public static void main(String[] args){
	Scanner a = new Scanner(System.in);
	//create a Scanner object
	
	// y - 1Dollar = 200rupees
	
	System.out.println("enter the amount of dollars");
	int x = a.nextInt();
	
	System.out.println("enter the value of 1Dollar");
	int y = a.nextInt();
	
	int value = x*y;
	System.out.println("Amount = " + value);
	}
}
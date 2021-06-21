import java.util.Scanner;//import the Scanner class
class Average1_2{
	public static void main(String[] args){
	Scanner x = new Scanner(System.in);
	//create a Scanner object
	
	System.out.println("enter the 1st number");
	int a = x.nextInt();
	
	System.out.println("enter the 2nd number");
	int b = x.nextInt();
	
	System.out.println("enter the 3rd number");
	int c = x.nextInt();
	
	System.out.println("enter the 4th number");
	int d = x.nextInt();
	
	System.out.println("enter the 5th number");
	int e = x.nextInt();
	
	int Total = (a+b+c+d+e)/5;
	System.out.println("Average of given five numbers = " + Total);
	}
}
	
	
	
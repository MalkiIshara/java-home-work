import java.util.Scanner;//import the Scanner class
class AreaOfTraingle1_4{
	public static void main(String[] args){
	Scanner a = new Scanner(System.in);
	//create a Scanner object
	
	System.out.println("enter the value of base");
	int b = a.nextInt();
	
	System.out.println("enter the value of height");
	int h = a.nextInt();
	
	int Area = (b*h)/2;
	System.out.println("Area of the traingle = " + Area);
	}
}
	
	
import java.util.Scanner;
class Sum6{
	public static void main(String[] args){
		Scanner x = new Scanner(System.in);
		System.out.println("enter the first number");
		int a = x.nextInt();
		
		System.out.println("enter the second number");
		int b = x.nextInt();
		
		int sum = a+b;
		System.out.println("sum of  given two numbers = "+ sum);
	}
}
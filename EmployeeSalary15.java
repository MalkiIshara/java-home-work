class EmployeeSalary15{
	public static void main(String[] args){
	//  a- hourly rate=250
	//  b- number of hours=100
	//	c- deduction rate=8% 
	   
	int a=250,b=100,Gross_salary,deduction,net_salary1,net_salary,c=8%;
	
	
	Gross_salary=b*a;
	System.out.println(Gross_salary);
	
	deduction=Gross_salary*c;
	System.out.println(deduction);
	
	net_salary1=Gross_salary-c;
	System.out.println(net_salary1);
	
	net_salary=Gross_salary-deduction;
	System.out.println(net_salary);
	}
}
	
	
	
	
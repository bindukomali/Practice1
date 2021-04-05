import java.util.Scanner;
public class EmpSal {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		 
		System.out.println("Enter employee Names");
		String name =in.nextLine();
		System.out.println("Enter Employee address");
		String add = in.nextLine();
		
		
		System.out.println("Monthly Salary");
		double sal = in.nextDouble();
		double basic=0.15*sal;
		double HRA =0.10*sal;
		double DA =0.5*sal; 
		int PF = 1800;
		double netsal = (basic+HRA+DA)-PF;
		System.out.println("employees Name:"+name);
		System.out.println("employees address:"+add);
		System.out.println("employees Net Salary:"+netsal);
	}

}



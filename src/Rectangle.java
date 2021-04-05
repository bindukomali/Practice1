import java.util.Scanner;
public class Rectangle {
	double length,breadth,area;
	Rectangle(double length,double breadth){
		this.length=length;
		this.breadth=breadth;
	}
	double returnRectangle() {
		area=length*breadth;
		return area;
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter length of Rectangle:");
		double l=s.nextDouble();
		System.out.println("Enter Breadthof Rectangle:");
		double b=s.nextDouble(); 
		
		Rectangle R=new Rectangle(l,b);
		System.out.println("Area of Rectangle :"+R.returnRectangle());
s.close();
	}

}

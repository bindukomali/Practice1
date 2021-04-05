import java.util.Scanner;
public class StudentMarks{
public static void main(String[] args) {
// TODO Auto-generated method stub

int s1,s2,s3,s4,s5;
float total,avg;
Scanner s=new Scanner(System.in);
System.out.println("enter 5 subjects marks ");
s1=s.nextInt();
s2=s.nextInt();
s3=s.nextInt();
s4=s.nextInt();
s5=s.nextInt();
total=s1+s2+s3+s4+s5;
avg=total/5;
System.out.println("Student Average is"+avg  );
if(avg>80)
{
System.out.println("firstclass");
}
else if(avg>60 && avg<80)
{
System.out.println("2ndclass");
}
else if(avg>40 && avg<60)
{
System.out.println("3rdclass");
}
else
{
System.out.println("fail");
}


 

}


 

}

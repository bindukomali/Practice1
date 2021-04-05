
public class DiamondPattern {

 

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        int i=0,j=0;
        for(i=1;i<=5;i++)
        {
            for(j=i;j<5;j++)
                System.out.print(" ");
            for(j=1;j<=((2*i)-1);j++)
                System.out.print("*");
            System.out.println();
         }
        for(i=4;i>=1;i--)
        {
            for(j=i;j<5;j++)
                System.out.print(" ");

 

                for(j=1;j<=((2*i)-1);j++)
                    System.out.print("*");
                System.out.println();

 

        }

 

    }

 

}
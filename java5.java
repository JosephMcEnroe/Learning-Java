import java.util.Scanner;
public class java5 {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        //variables
        int x;  //Number1
        int y;  //Number2
        int z;  //sum of two numbers
        int max; //max of two numbers

        //input
        System.out.print("Pick a number:\t");
        x = scan.nextInt();
        System.out.print("\nPick another number:\t");
        y= scan.nextInt();

        //Calling Methods
        max = MaxNum(x, y);
        z = SumofNum(x,y);

        //Calling Void Method
        Write(max,z);

    }

    private static void Write(int x, int y) 
    {
        System.out.printf("\nThe number larger of the two is\t"+x);
        System.out.printf("\nThe Sum of the two numbers is\t"+y);

    }

    private static int SumofNum(int x, int y) //returns sum
     {
        x = x + y;
        return x;
    }

    public static int MaxNum(int x, int y) //returns max number
    {
        int z;
        if(x > y);
        {
            z = x;
            
        }
        
        if(y > x)
        {
            z=y;
        }
        
        return z;

    }

}

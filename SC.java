import java.util.*;
public class SC
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number :");
        int n = in.nextInt();
        int sq =0;
        int cube=0;
        for(int i =1;i<=n;i++)
        {
            sq = i*i;
            cube = i*i*i;
        System.out.println("The square of the number is :" +sq);
        System.out.println("The cube of the number is : "+cube);
    }
}}
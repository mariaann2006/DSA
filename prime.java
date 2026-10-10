import java.util.*;
public class prime 
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number :");
        int num = in.nextInt();
        int rem;
        int count =0;
        int temp;
        double sum=0.0;
        temp = num;
        while(temp>0)
        {
            count=count+1;
            temp=temp/10;
        }
        temp = num;
        while(temp>0)
        {
            rem =temp%10;
            sum = sum + Math.pow(rem,count);
            temp = temp/10;
        }
        if(sum == num)
        {
            System.out.println("The number is armstrong");
        }
        else
        {
            System.out.println("The number is not armstrong");
        }
    }
}

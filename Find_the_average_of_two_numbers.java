import java.util.*;
public class Average
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        float x,y,avg;
        x=sc.nextFloat();
        y=sc.nextFloat();
        avg=(x+y)/2;
        System.out.printf("%.4f",avg);
    }
}
import java.util.*;
public class Circle
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int r;
        float ar;
        r=sc.nextInt();
        float pi=3.14f;
        ar=pi*r*r;
        System.out.printf("%.2f",ar);
    }
}
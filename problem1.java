import java.util.Scanner;
class hours
{
    static int hcalc(int h)
    {
       return 24 - h;
    }
}


public class problem1
{
    public static void main(String[] args)
    {
        hours employee1 = new hours();
        System.out.println("write the amount of hours worked below");
        Scanner work = new Scanner(System.in);
        int num = work.nextInt();
        System.out.println("The amount of hours slept is: " + employee1.hcalc(num));
        
    }

}
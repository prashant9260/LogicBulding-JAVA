//Q3 - accept one number from user if number is less than 10 then print "Hello" otherwise print "Demo"

import java.util.Scanner;

class Logic
{
    void Display(int iNo)
    {
       if(iNo < 10)
       {
            System.out.println("Hello");
       }
       else
       {
            System.out.println("Demo");
       }
    }
}
class A2Q3
{
    public static void main(String A[])
    {
        int iValue = 0;

        Logic lboj = new Logic();
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number: ");

        iValue = sobj.nextInt();

        lboj.Display(iValue);

        lboj = null;
        sobj = null;

        System.gc();

    }
}
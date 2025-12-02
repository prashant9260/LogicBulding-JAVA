//Q4 - accept two number from user and display first number in secound number of times.

import java.util.Scanner;

class Logic
{
    void Display(int iNo1, int iNo2)
    {
       int i = 0;
        
        if(iNo2 < 0)
        {
            iNo2 = -iNo2;
        }

        for(i = 1; i <= iNo2; i++)
        {
            System.out.println(iNo1);
        }
    }
}
class A2Q4
{
    public static void main(String A[])
    {
        int iValue1= 0, iValue2 = 0;

        Logic lboj = new Logic();
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter first number: ");
        iValue1 = sobj.nextInt();

        System.out.println("Enter secound number: ");
        iValue2 = sobj.nextInt();

        lboj.Display(iValue1, iValue2);

        lboj = null;
        sobj = null;

        System.gc();

    }
}
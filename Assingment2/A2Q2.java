//Q2 - accept one number from user and print that number of * on screen
import java.util.Scanner;

class Logic
{
    void Display(int iNo)
    {
        if(iNo < 0)
        {
            iNo = -iNo;
        }

        while(iNo > 0)
        {
            System.out.println(" * ");
            iNo--;
        }
    }
}
class A2Q2
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
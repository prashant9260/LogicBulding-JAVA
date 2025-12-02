//Q = Accept one number form user and print that number of * on screen.

import java.util.Scanner;

class Display
{
    public void show(int iNO)
    {
       int iCnt = 0;

       for(iCnt = 1; iCnt <= iNO; iCnt++)
       {
            System.out.print("*\t");
       }

    }
}
class A1Q5
{
    public static void main(String A[])
    {
       Display dobj = new Display();
       Scanner sobj = new Scanner(System.in);
       int iValue = 0;

       System.out.println("Enter the number: ");
       iValue = sobj.nextInt();

       dobj.show(iValue);


    }
}
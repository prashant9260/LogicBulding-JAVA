//Q1 = Accept one number form user and print that number of * on screen.

import java.util.Scanner;

class Display
{
    public void show(int iNO)
    {
       int iCnt = 0;

       if(iNO < 0)
       {
            iNO = -iNO;
       }

       while(iCnt < iNO)
       {
            System.out.print("*\t");
            iCnt++;
       }

    }
}
class A2Q1
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
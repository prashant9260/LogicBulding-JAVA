//Q4. Accept number from user and and display below pattern

//Input:  4
//Output: #    1   *   #   2   *   #   3   *   #   4   *

import java.util.Scanner;

class Pattern
{
    void Display(int iNo)
    {
       int iCnt = 0, iCount = 0;

        iCount = 1;
        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            System.out.print("#\t");
            System.out.print(iCount+"\t");
            System.out.print("*\t");
            iCount++;
        }
    }
}
class A26Q4
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;
        System.out.println("Enter the number: ");
        iValue = sobj.nextInt();

        Pattern pboj = new Pattern();
        pboj.Display(iValue);
    }
}
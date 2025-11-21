//Q3. Accept number from user and and display below pattern

//Input:  5
//Output: 1   *   2   *   3   *   4   *   5   *

import java.util.Scanner;

class Pattern
{
    void Display(int iNo)
    {
       int iCnt = 0, iCount = 0;

        iCount = 1;
        for(iCnt = 1; iCnt <= iNo+iNo; iCnt++)
        {
            if((iCnt % 2) == 0)
            {
                System.out.print("*\t");
            }
            else
            {
                System.out.print(iCount+"\t");
                iCount++;
            }
        }
    }
}
class A26Q3
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
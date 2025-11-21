//Q2. Accept number from user and and display below pattern

//Input:  5
//Output: 5   #   4   #   3   #   2   #   1   #

import java.util.Scanner;

class Pattern
{
    void Display(int iNo)
    {
       int iCnt = 0, iCount = 0;

        iCount = iNo;
        for(iCnt = 1; iCnt <= iNo+iNo; iCnt++)
        {
            if((iCnt % 2) == 0)
            {
                System.out.print("#\t");
            }
            else
            {
                System.out.print(iCount+"\t");
                iCount--;
            }
        }
    }
}
class A26Q2
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
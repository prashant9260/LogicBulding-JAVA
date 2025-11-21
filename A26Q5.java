//Q5. Accept number from user and and display below pattern

//Input:  8
//Output: 2  4   6   8   10  12  14   16

import java.util.Scanner;

class Pattern
{
    void Display(int iNo)
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            System.out.print((iCnt * 2)+"\t");
        }
    }
}
class A26Q5
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
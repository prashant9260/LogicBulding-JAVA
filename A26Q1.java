//Q1. Accept number from user and and display below pattern

//Input:  5
//Output: A   B   C   D   E

import java.util.Scanner;

class Pattern
{
    void Display(int iNo)
    {
        int iCnt = 0;
        char Ch = 'A';

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            System.out.print(Ch+"\t");
            Ch++;
        }
    }
}
class A26Q1
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
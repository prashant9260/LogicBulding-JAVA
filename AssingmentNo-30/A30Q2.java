//2. Accept number of rows and number of columns from user and display below pattern.
/*
    input: iRow- 4      iCol - 4
    ouput:  
         *  *   *   *
         *  *   *   #
         *  *   #   #
         *  #   #   #
*/

import java.util.Scanner;

class Pattern
{
    public void Display(int iRow, int iCol)
    {
        //I will solve the logic later.
    }
}

class A30Q2
{
    public static void main(String A[])
    {
        int iValue1 = 0, iValue2 = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of Rows: ");
        iValue1 = sobj.nextInt();

        System.out.println("Enter the number of Column: ");
        iValue2 = sobj.nextInt();

        Pattern pobj = new Pattern();

        pobj.Display(iValue1,iValue2);
    }
}
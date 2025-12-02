//Q5. Accept number of rows and number of columns from user and display below pattern.
/*
    input:  iRow = 4   iCol = 4

    output: 
            1   2   3   4
            2   3   4   5
            3   4   5   6
            4   5   6   7
        
 */

import java.util.Scanner;

class Pattern
{
    public void Display(int iRow, int iCol)
    {
        int i = 0, j = 0;

        for(i = 1; i <= iRow; i++)
        {    
            for(j = 1; j <= iCol; j++)
            {
               System.out.print((i + j -1)+"\t");
            }
            System.out.println();
        }
    }
}

class A29Q5
{
    public static void main(String A[])
    {
        int iValue1 = 0, iValue2 = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of Rows: ");
        iValue1 = sobj.nextInt();

        System.out.println("Enter the number of Columns: ");
        iValue2 = sobj.nextInt();

        Pattern pobj = new Pattern();

        pobj.Display(iValue1,iValue2);
        
    }
}
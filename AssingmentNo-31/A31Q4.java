//Q4 - Accept number of rows and columns from user and display below pattern
/*
    Input:  iRow = 4    iCol = 4
    ouput:
       *    *   *   *   *   *
       *    *               *
       *        *           *
       *            *       *
       *                *   *
       *    *   *   *   *   *                   
       
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
                if(i == j || i == iRow || i == 1 || j == 1 || j == iCol)
                {
                    System.out.print("*"+"\t");
                }
                else
                {
                    System.out.print(" \t");
                }
            }
            System.out.println();
        }
    } 
}

class A31Q4
{
    public static void main(String A[])
    {
        int iValue1 = 0, iValue2 = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of Rows: ");
        iValue1 = sobj.nextInt();

        System.out.println("Enter the number of Colums: ");
        iValue2 = sobj.nextInt();

        Pattern pobj = new Pattern();

        pobj.Display(iValue1,iValue2);
    }
}
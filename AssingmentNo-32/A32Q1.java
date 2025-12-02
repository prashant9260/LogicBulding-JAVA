//Q1 - Accept number of rows and number of columns from user and display below pattern.
/*
    input: iRow = 4     iCol = 4
    output:
        *   *   *   #
        *   *   #   *
        *   #   *   *
        #   *   *   *
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
                if(i + j == iCol + 1)   
                {
                    System.out.print("#\t");
                }
                else
                {
                    System.out.print("*\t");
                }
            }

            System.out.println();
        }
    }
}

class A32Q1
{
    public static void main(String A[])
    {
        int iValue1 = 0, iValue2 = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        iValue1 = sobj.nextInt();

        System.out.print("Enter the number of Columns: ");
        iValue2 = sobj.nextInt();

        Pattern pobj = new Pattern();
        pobj.Display(iValue1, iValue2);
    }
}

//Q4 - Accept number of rows and number of columns from user and display below pattern

//Input:    iRow = 3        iCol = 4
/*
    *   #   *   #
    *   #   *   #
    *   #   *   #
*/
import java.util.*;

class Pattern
{
    public void Display(int iRow, int iCol)
    {
        int i = 0, j = 0;

        for(i = 1; i <= iRow; i++)
        {
            for(j = 1; j <= iCol; j++)
            {
               if((j % 2) == 0)
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

class A27Q4
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue1 = 0, iValue2 = 0;
        
        Pattern pboj = new Pattern();

        System.out.println("Enter the number of Rows : ");
        iValue1 = sobj.nextInt();

        System.out.println("Enter the number of Colums : ");
        iValue2 = sobj.nextInt();

        pboj.Display(iValue1,iValue2);

    }
}
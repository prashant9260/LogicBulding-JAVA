//Q5 - Accept number of rows and number of columns from user and display below pattern

//Input:    iRow = 4        iCol = 4
/*
   1    1   1   1
   2    2   2   2
   3    3   3   3
   4    4   4   4
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
               System.out.print(i+"\t");
            }
            System.out.println();
        }
    }
}

class A27Q5
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
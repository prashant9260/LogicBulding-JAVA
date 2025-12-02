//Q3 - Accept number of rows and number of columns from user and display below pattern

//Input:    iRow = 3        iCol = 5
/*
    5   4   3   2   1
    5   4   3   2   1
    5   4   3   2   1
*/
import java.util.*;

class Pattern
{
    public void Display(int iRow, int iCol)
    {
        int i = 0, j = 0;

        for(i = 1; i <= iRow; i++)
        {
            for(j = iCol; j >= 1; j--)
            {
                System.out.print(j+"\t");
            }
            System.out.println();
        }
    }
}

class A27Q3
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
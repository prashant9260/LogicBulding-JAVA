//Q5 - Accept number of rows and number of columns from user and display below pattern.
/*
    input: iRow = 5     iCol = 5    
    output:                                                 
          1   2   3   4   5                 
          1   2           5       
          1       3       5
          1            4  5
          1 2     3    4  5      

*/
import java.util.*;

class Pattern
{
    public void Display(int iRow, int iCol)
    {
        for(int i = 1; i <= iRow; i++)
        {
            for(int j = 1; j <= iCol; j++)
            {
                if(i == j)
                {
                    System.out.print(i+"\t");
                }
                else if(i == 1 || j == 1 || i == iRow || j == iCol)
                {
                    System.out.print(j+"\t");
                }
                else
                {
                    System.out.print("\t");
                }
             
            }
            System.out.println();
        }
    }
}

class A32Q5
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

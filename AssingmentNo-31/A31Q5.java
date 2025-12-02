//Q5 - Accept number of rows and columns from user and display below pattern
/*
    Input:  iRow = 4    iCol = 4
    ouput:
         1  2   3   4
             2  3   4
                3   4
                    4                  
       
*/
import java.util.Scanner;

class Pattern
{
    public void Display(int iRow, int iCol)
    {
        int i = 0, j = 0, s = 0;

        for(i = 1; i <= iRow; i++)
        {
            for(s = 1; s < i; s++)
            {
                System.out.print("\t");
            }
            for(j = i; j <= iCol; j++)
            {
               System.out.print(j+"\t");
            }

            System.out.println();
        }
    } 
}

class A31Q5
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
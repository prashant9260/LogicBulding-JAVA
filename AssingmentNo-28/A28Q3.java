//Q3 - Accept number of rows and number of coulums from user and display below pattern.
//input:  iRow - 3     iCol - 5
/*
   A    A   A   A   A
   B    B   B   B   B  
   C    C   C   C   C
*/
import java.util.*;

class Pattern
{
    public void Display(int iRow, int iCol)
    {
        int i = 0, j = 0;
        char ch = 'A';
         
        for(i = 1; i <= iRow; i++)
        {
            for(j = 1; j <= iCol; j++)
            {
                System.out.print(ch+"\t");
            }
            ch++;
            System.out.println();
        }
    }
}
class A28Q3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue1 = 0, iValue2 = 0;

        System.out.println("Enter the number rows: ");
        iValue1 = sobj.nextInt();

        System.out.println("Enter the number Columns: ");
        iValue2 = sobj.nextInt();

        Pattern pobj = new Pattern();

        pobj.Display(iValue1,iValue2);

    }
}
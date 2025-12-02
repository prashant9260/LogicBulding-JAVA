//Q4 - Accept number of rows and number of coulums from user and display below pattern.
//input:  iRow - 4     iCol - 5
/*
    4   4   4   4   4
    3   3   3   3   3
    2   2   2   2   2
    1   1   1   1   1
*/
import java.util.*;

class Pattern
{
    public void Display(int iRow, int iCol)
    {
        int i = 0, j = 0;
        int temp = iRow;
         
        for(i = 1; i <= iRow; i++)
        {
            for(j = 1; j <= iCol; j++)
            {
                System.out.print(temp+"\t");
            }
            System.out.println();
            temp -= 1;
            
        }
    }
}
class A28Q4
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
//Q2 - Accept number of rows and number of coulums from user and display below pattern.
//input:  iRow - 4      iCol - 4
/*
    A    B   C   D
    a    b   c   d
    A    B   C   D
    a    b   c   d
*/
import java.util.*;

class Pattern
{
    public void Display(int iRow, int iCol)
    {
        int i = 0, j = 0;
        char ch1 = 'A';
        char ch2 = 'a';
        int iCount = 0;
    
        iCount = 1;
        for(i = 1; i <= iRow; i++)
        {
            ch1 = 'A';
            ch2 = 'a';
            for(j = 1; j <= iCol; j++)
            {
                if((iCount % 2) == 0)
                {
                    System.out.print(ch2+"\t");
                    ch2++;
                }
                else
                {
                    System.out.print(ch1+"\t");
                    ch1++;
                }

            }
            iCount++;
            System.out.println();
        }
    }
}
class A28Q2
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
//Q2. Accept number of rows and number of columns from user and display below pattern.
/*
    output: 
            1   2   3   4
            5   6   7   8
            9   1   2   3
            4   5   6   7
 */


import java.util.Scanner;

class Pattern
{
    public void Display(int iRow, int iCol)
    {
        int i = 0, j = 0, iCnt = 0;

        iCnt = 1;
        for(i = 1; i <= iRow; i++)
        {
            for(j = 1; j <= iCol; j++)
            {
                if(iCnt > 9)
                {
                    iCnt = 1;
                }
                System.out.print(iCnt+"\t");                  
                iCnt++;
            }
            System.out.println();
          
        }
    }
}

class A29Q1
{
    public static void main(String A[])
    {
        int iValue1 = 0, iValue2 = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the frequency of Rows: ");
        iValue1 = sobj.nextInt();        

        System.out.println("Enter the frequency of Columns: ");
        iValue2 = sobj.nextInt();

        Pattern pobj = new Pattern();

        pobj.Display(iValue1,iValue2);

    }
}
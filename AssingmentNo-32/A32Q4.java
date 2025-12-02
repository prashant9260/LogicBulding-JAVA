//Q4 - Accept number of rows and number of columns from user and display below pattern.
/*
    input: iRow = 6     iCol = 6
    output:
          *   *   *   *   *   *
          *   #   #   #   *   *
          *   #   #   *   $   *
          *   #   *   $   $   *
          *   *   $   $   $   *
          *   *   *   *   *   *       

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
                // Border condition
                if(i == 1 || i == iRow || j == 1 || j == iCol)
                {
                    System.out.print("*\t");
                }
                // Diagonal
                else if(i == j)
                {
                    System.out.print("*\t");
                }
                // Left of diagonal
                else if(j < i)
                {
                    System.out.print("#\t");
                }
                // Right of diagonal
                else
                {
                    System.out.print("$\t");
                }
            }
            System.out.println();
        }
    }
}


class A32Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int r = sc.nextInt();
        System.out.print("Enter cols: ");
        int c = sc.nextInt();

        Pattern p = new Pattern();
        p.Display(r, c);
    }
}

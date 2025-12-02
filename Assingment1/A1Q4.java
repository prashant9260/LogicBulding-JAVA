//Q = Accept one number and check whether it is divisible by 5 or not

import java.util.Scanner;

class Check
{
    public boolean show(int iNO)
    {
        if((iNO % 5) == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
class A1Q4
{
    public static void main(String A[])
    {
       Check cobj = new Check();
       Scanner sobj = new Scanner(System.in);
       int iValue = 0;
       boolean bRet = false;

       System.out.println("Enter Number: ");
       iValue = sobj.nextInt();

       bRet = cobj.show(iValue);

       if(bRet == true)
       {
            System.out.println("Divisible by 5");
       }
       else
       {
            System.out.println(iValue + " is not Divisible by 5");
       }

    }
}
//Q1 = program to divide two numbers

class Divide
{
    int Divide(int iNo1, int iNo2)
    {
        int iAns = 0;

        if(iNo2  == 0)
        {
            return -1;
        }

        iAns = iNo1 / iNo2;
        return iAns;
    }
}

class A1Q1
{
    public static void main(String A[])
    {
        int iValue1 = 15, iValue2 = 5;
        int iRet = 0;

        Divide dobj = new Divide();

        iRet = dobj.Divide(iValue1,iValue2);

        System.out.println("Division is: " + iRet);
    }
}
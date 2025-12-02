//Q = program to print 5 to 1 numbers on screen

class Display
{
    public void show()
    {
        int i= 0;
        i = 5;

        while(i >= 1)
        {
            System.out.println(i);
            i--;
        }

        
    }
}
class A1Q3
{
    public static void main(String A[])
    {
        Display dobj = new Display();

        dobj.show();

    }
}
//Q = program to print 5 times "Marvellous" on screen

class Display
{
    public void show()
    {
        int i= 0;

        for(i = 1; i <= 5; i++)
        {
            System.out.println("Marvellous");
        }
    }
}
class A1Q2
{
    public static void main(String A[])
    {
        Display dobj = new Display();

        dobj.show();

    }
}
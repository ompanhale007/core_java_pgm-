package ifelsestatement;

public class lab008
{
    public static void main(String[] args)
    {
        int a=95,b=90,c=56,max=0;

        if(a>b && b>c)
        {
            max=a;
        }
        else if (b>a && b>c)
        {
            max=b;
        }
        else
        {
            max=c;
        }
        System.out.println("Max Value is-:"+max);
    }
}

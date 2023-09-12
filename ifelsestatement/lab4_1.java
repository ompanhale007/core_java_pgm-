package ifelsestatement;


import java.util.Scanner;

public class lab4_1
{
    //Find max of three using if and elseif
    public static void main(String[] args)
    {
        System.out.println("Enter The Value Of a,b,c");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        System.out.println("Your Input Are-:"+a+" "+b+" "+c);

        if(a>b && a>c)
        {
            System.out.println("Max is-:"+a);
        }
        else if (b>a && b>c)
        {
            System.out.println("Max is-:"+b);
        }
        else if (c>a && c>b)
        {
            System.out.println("Max is-:"+c);
        }

    }
}

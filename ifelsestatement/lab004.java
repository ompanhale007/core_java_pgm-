
        package ifelsestatement;

import java.util.Scanner;

public class lab004
{
    //max of three number using if statement
    public static void main(String[] args) {
        System.out.println("Enter The Value of a,b,c");

        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        System.out.println("Your Input Are-:"+a+" "+b+" "+c);

        if(a>b && a>c)
        {
            System.out.println("Max Is-:"+a);
        }
        if(b>a && b>c)
        {
            System.out.println("Max Is-:"+b);
        }
        if(c>a && c>b)
        {
            System.out.println("Max Is-:"+c);
        }
    }
}

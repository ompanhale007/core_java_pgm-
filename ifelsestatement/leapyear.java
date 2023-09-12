package ifelsestatement;

import java.util.Scanner;

public class leapyear
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Year-:");
        int year= sc.nextInt();

        if((year%400==0) || (year%4==0 && year%100!=0))
        {
            System.out.println("**Enter Year Is Leap Year**");
        }
        else
        {
            System.out.println("**Enter Year Is Not Leap Year**");
        }

    }
}

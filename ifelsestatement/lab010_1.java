package ifelsestatement;

import java.util.Scanner;

public class lab010_1
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Garde-:");
        int score=sc.nextInt();
        String  grade=null;

        if(score>=90 && score<100)
        {
            grade="A";
        }
        else if(score>=80 && score<90)
        {
            grade="B";
        }
        else if(score>=70 && score<80)
        {
            grade="C";
        }
        else if(score>=60 && score<70)
        {
            grade="D";
        }
        else if(score>=0 && score<59)
        {
            grade="F";
        }
        else
        {
            System.out.println("***InValid Score Plz Score between 1 to 100***");
        }
        System.out.println("Your Grade IS-: "+grade);
    }
}

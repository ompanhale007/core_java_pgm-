package ifelsestatement;

import java.util.Scanner;

public class lab010
{
    public static void main(String[] args)
    {
        //Grade Calculator

//        Write a program that calculates and displays the letter grade for
//        a given numerical score (e.g., A, B, C, D, or F)
//        based on the following grading scale:
//        A: 90-100
//        B: 80-89
//        C: 70-79
//        D: 60-69
//        F: 0-59
//IF User Enter invalid Grade then Proper message should be display with garde is null to handle that use
//String grade=null;


        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Score-:");
        int score=sc.nextInt();
        String grade= null;

        if(score>=90 && score<100)
        {
            grade="A";
        }
        else if (score>=80 && score<90)
        {
            grade="B";
        }
        else if (score>=70 && score<80)
        {
            grade="C";
        }
        else if (score>=60 && score<70)
        {
            grade="D";
        }
        else if (score>=0 && score<60)
        {
            grade="F";
        }
        else
        {
            System.out.println("***Invalid Score Plz Enter Score Between 1 To 100***");
        }
        System.out.println("Your Grade Is-:"+grade);

    }
}

package ifelsestatement;

import java.util.Scanner;

public class ifeslescannerclass
{
    //Program For Odd and Even
    public static void main(String[] args)
    {
        System.out.println("***Enter your Number****");
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();

        if(num%2==0)
        {
            System.out.println("Number is Even");
        }
        else
        {
            System.out.println("Number is Odd");
        }
    }

}

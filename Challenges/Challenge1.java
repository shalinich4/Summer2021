package Challenges;
import java.util.Scanner;
/**
 * Level 1: Write a program that accepts 2 numbers from the user and calculates
 * the sum, difference, product and quotient and remainder of these numbers.
 * 
 * I want you to use camelCase
 * I want atleast 2 comments
 */
public class Challenge1
{
    // initializing values for i and d from input
    
    
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    // initializing values for i and d from input
    int i = sc.nextInt();
    double d = sc.nextDouble();
    // performing arithmetic operations on i and d 
    double sum=i+d;
    System.out.println("sum of i and d :"+sum);
    double diff=i-d;
    System.out.println("difference of i and d :"+diff);
    double prod=i*d;
    System.out.println("product of i and d :"+prod);
    double div=i/d;
    System.out.println("division of i and d :"+div);
    double mod=i%d;
    System.out.println("modulo of i and d :"+mod);  
    }
}
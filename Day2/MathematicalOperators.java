package Day2;


/**
 * Write a description of class MathematicalOperators here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MathematicalOperators
{
   
    public static void main(String args[])
    {
        int x = 10;
        int y = 3;

        double xd = 3.0;
        System.out.println("Addition");
        System.out.println(x+y);
        
        System.out.println("Subtraction");
        System.out.println((x-y));
        
        System.out.println("Product");
        System.out.println(x*y);
        
        System.out.println("Quotient double 3.33");
        System.out.println(x/xd); //xd is a double
        
        System.out.println("Quotient int 3");
        System.out.println(x/y); // x and y are integers
        
        System.out.println("Remainder 1");
        System.out.println(x%y);
    }

}

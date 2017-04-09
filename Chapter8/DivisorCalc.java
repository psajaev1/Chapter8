
/**
 * Write a description of class DivisorCalc here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class DivisorCalc
{
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("What is your first number");
        int number1 = scan.nextInt();
        System.out.println("What is your second number");
        int number2 = scan.nextInt();
        
        System.out.println("GCD of the two numbers is " + gcd(number1,number2));

    }
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public static int gcd( int number1, int number2)
    {
       
        
        if (number2 == 0)
            return number1;
        return gcd(number2, number1%number2);
       
    }
}


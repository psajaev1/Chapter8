
import java.util.*;
/**
 * Write a description of class Number here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Number
{
  
   
/**
     * Default constructor for objects of class Number
     */
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        
        int num = scan.nextInt();
        
        System.out.println("This number has " +digitCounter(num, 0) + " Digits");
   
    }
    
    public static int digitCounter(int num, int count){
        
        
        
        if (num > 10){
            num = num / 10;
            count+=1;
            count = digitCounter(num,count);
        }
        else{
            count += 1;
            
        
    }
        return count;
}
}
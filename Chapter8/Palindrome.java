
import java.util.*;
/**
 * Write a description of class Palindrome here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Palindrome
{
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = scan.next();
        
        if(isPalindrome(word)){
            
            System.out.println("This is a palindrome");
        }
        
        else
            System.out.println("This is not a palindrome");
        
        
        
        
    }
    
    
   public static boolean isPalindrome(String word)
    {   // if length is 0 or 1 then String is palindrome
        if(word.length() == 0 || word.length() == 1)
            return true; 
        /* check for first and last char of String:
         * if they are same then do the same thing for a substring
         * with first and last char removed. and carry on this
         * until you string completes or condition fails
         
         */
        if(word.charAt(0) == word.charAt(word.length()-1))
        
            return isPalindrome(word.substring(1, word.length()-1));

     
         // If program reaches this point, the String is not palindrome hence return false.
         
        return false;
    }
}
// Phillip Sajaev
// 4/19/17
// 



import java.util.*;
public class Fundraiser
{
   
   public static int n = 0;

    public static void main(String[] args)
    {
        //defines the scanner
        Scanner scan = new Scanner(System.in);
       System.out.println("How much money do you need to check");                     
        double choice = scan.nextInt();
        //an print statement that intros the divide and conquer idea
        System.out.println("");

        //calls the number method
        System.out.println("You collected " + number(choice) + " dollars"); 
        
        
    }
    
    public static int number(double goal)
    {
        //only will run the statement if the goal is above 10 will run 3 times
        if (goal/10 >= 1){
            
            // will run ten times for it
            for (int i = 0; i < 10; i++)
            {
                //counter to see how many people are giving a dollar
                n++;
                //recalls the method
                number(goal/10);
            }
        }
        //returns the count
        return n;
            
    }

}
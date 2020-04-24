
import java.util.Scanner;
import java.lang.String;
import java.util.Arrays;

public class FeetToInchesCalculator

{
       public static void main(String[] args)
    {
        Scanner UserInput = new Scanner(System.in);
        String option;
        boolean continueProgram = true;
        while (continueProgram)
        {
            System.out.println("Main Menu - Please select one of the following options: ");
            System.out.println("1 – Convert feet to inches ");
            System.out.println("2 – Convert inches to feet ");
            System.out.println("3 – Calculate average ");
            System.out.println("4 – Find min and max ");
            System.out.println("5 – Exit ");
       
            option=UserInput.next();    
            switch (option)   
            {   
                case "1":
                    System.out.println("You will now enter an integer to convert from feet to inches:");
                    double feet1;
                    feet1 = UserInput.nextDouble();
                    System.out.println("That is " + feet1 + " feet");
                    System.out.println("The converted integer is " + feet1*12 + " inches\n");
                    break;
                case "2": //converts inch to feet
                    System.out.println("You will now enter an integer to convert from inches to feet:");
                    double inches1;
                    inches1 = UserInput.nextDouble();
                    System.out.println("That is " + inches1 + " inches");
                    System.out.println("The converted integer is " + inches1/12 + " feet\n");  
                    break;
                case "3": //will get average
                    System.out.println("Please enter integers you want the average for (with space in between each integer: ");
                    String enter = UserInput.nextLine();
                    String input = UserInput.nextLine(); //4 42 3
                    String[] inputArray = input.split(""); //should convert it into ["4","42","3]
                    double sum = 0;
                    for(int i = 0; i<inputArray.length; i++) //counter for length of array will keep going counting the sum
                    {
                        sum = sum + Integer.parseInt(inputArray[i]); //sum will be the sum of every integer in the array
                    }
                    double average = sum/inputArray.length;
                    System.out.println("The average is: " + average);
                    System.out.println();
                    break;
                case "4": //will find min and max
                    System.out.println("Please enter integers you want to find minimum for (with space in between each integer: )");
                    String enter1 = UserInput.nextLine();
                    String input2 = UserInput.nextLine();
                    String[] inputArray2 = input2.split(""); //should cut up user input string
                    int min = 0;
                    for(int i = 0; i<inputArray2.length; i++)
                    {
                        min = Integer.parseInt(inputArray2[i]); //turn strings of inputArray into ints
                        Arrays.sort(inputArray2);
                    }
                    System.out.println("Minimum = " + inputArray2[0]);
                case "5":
                    System.out.println("Goodbye!");
                    continueProgram = false;
                    break;
                default:
                    System.out.println("Enter one of the following choices or 4 to exit");
                    break;
            }
       }
    }
}
        
      

     
      

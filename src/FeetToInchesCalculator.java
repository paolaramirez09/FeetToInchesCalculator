
import java.util.Scanner;
import java.lang.String;

public class FeetToInchesCalculator //was not able to convert the numbers to an average, instead of calculating average it defaults. 
        //also when exit is pressed, the program does not exit

{
       public static void main(String[] args)
    {
        Scanner UserInput = new Scanner(System.in);
        String option;
        while (true)
        {
            System.out.println("Main Menu - Please select one of the following options: ");
            System.out.println("1 – Convert feet to inches ");
            System.out.println("2 – Convert inches to feet ");
            System.out.println("3 – Calculate average ");
            System.out.println("4 – Exit ");

            //String option = UserInput.nextLine();
            //execute(option);
        //}
    //}
       option=UserInput.next();
      
       
    //public static void execute(String option)
            
        
        switch (option)   
        {   
            case "1":
                System.out.println("You will now enter an integer to convert from feet to inches:");
                double feet1;
                feet1 = UserInput.nextDouble();
                System.out.println("That is " + feet1 + " feet");
                System.out.println("The converted integer is " + feet1*12 + " inches\n");
            break;
            case "2":
            System.out.println("You will now enter an integer to convert from inches to feet:");
            double inches1;
            inches1 = UserInput.nextDouble();
            System.out.println("That is " + inches1 + " feet");
            System.out.println("The converted integer is " + inches1/12 + " feet\n");  
            break;
            case "3":
            int sum = 0;  
            System.out.println("Please enter 5 integers you want the average for (with space in between each integer:  ");
            //UserInput.useDelimiter(",");
            //int userInputs = 0;
            int integers = UserInput.nextInt();
                if (integers >= 5) //while the user keeps on inputting values
                {
                     int avgnum = UserInput.nextInt(); //will get next number from user
                     System.out.println(avgnum); //will print the value from the user
                     sum += avgnum; //will get the value from user and add it to the sum
                     System.out.println(sum+ "\n"); //will print out the  new sum     
                 }
                else
                 {
                     System.out.println("Please enter 5 integers");
                 }
            break;   
                    //UserInput.close();
                    //int avg = (sum / 5);
                     //System.out.println("Average: " + avg);
            case "4":
            System.out.println("Goodbye!");
            break;
            default:
            System.out.println("Enter one of the following choices or 4 to exit");
            break;
        }
       }
    }
        
      
       
     //UserInput.close();  
     
      

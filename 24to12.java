/*Write a program that converts from 24-hour notation to 12-hour notation. For
example, it should convert 14:25 to 2:25 PM. The input is given as two integers.
There should be at least three methods, one for input, one to do the conversion, and
one for output. Record the AM/PM information as a value of type char, 'A' for AM
and 'P' for PM. Include a loop that lets the user repeat this computation for new
input values again and again until the user wants to quit. */
import java.util.Scanner;
class Conversion {
    //method to take input in HH:mm format
    public String takeinput() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter time in HH:mm format: ");
        return sc.nextLine();
    }

    //method to convert 24-hour time format to 12-hour format
    public String conversion(String timeInput) 
    {
        //split the input time into hours and minutes
        String[] hhmm = timeInput.split(":");
        int hour = Integer.parseInt(hhmm[0]);//Extract hours
        int minute = Integer.parseInt(hhmm[1]);//Extract minutes
        String meridiem;
        int hour12;

        if (hour > 23 || hour < 0 || minute > 59 || minute < 0) 
        {
            System.out.println("Invalid time entered! Hours must be between 0 and 23, and minutes between 0 and 59.");
            System.exit(1); // Exit the program if the input is invalid
        }
        //convert from 24-hour to 12-hour format
        if(hour==0) 
        {
            hour12=12;//midnight (00:00) is 12:00 AM
            meridiem="AM";
        } 
        else if(hour==12) 
        {
            hour12=12;//noon (12:00) is 12:00 PM
            meridiem="PM";
        } 
        else if(hour>12) 
        {
            hour12=hour-12;//convert PM hours (13-23)
            meridiem="PM";
        } 
        else 
        {
            hour12=hour;//AM hours (1-11)
            meridiem="AM";
        }
        // Return the formatted 12-hour time with AM/PM
        return String.format("%02d", hour12) + ":" + String.format("%02d", minute) + " " + meridiem;
    }

    // Method to output the converted time
    public void output(String convertedTime) 
    {
        System.out.println("converted time in 12-hour format: " + convertedTime);
    }
    public static void main(String[] args) 
    {
        // Create an object of the Conversion class
        Conversion conv=new Conversion();
        Scanner sc=new Scanner(System.in);
        String continueChoice;
        do {
            //call methods to perform the time conversion and output the result
            String timeInput = conv.takeinput();// Take input in 24-hour format
            String convertedTime = conv.conversion(timeInput); // Convert to 12-hour format
            conv.output(convertedTime); // Print the converted time
            //ask the user if they want to run the program again
            System.out.print("do you want to convert another time? (yes/no): ");
            continueChoice = sc.nextLine();
        } while (continueChoice.equalsIgnoreCase("yes"));//continue loop if user enters "yes"
        System.out.println("program ended.");
    }
}
//TIME COMPLIXICITY=O(n)

// LEARNINGS OF THE CODE
/*split(:) breaks the time string 14:30 into 14 and 30.
These parts are stored in the array hhmm[] as hhmm[0] = 14 and hhmm[1] = 30.
Integer.parseInt() is then used to convert these string values into integers for use in the conversion logic.*/
/*Qus 1:- Write a java program to generate electricity bill the tariff plans are given below	
No of units	Price Per Unit in rupees
1-50	1.50 (one rupee fifty paisa)
51-100	2.00 (two rupees)
101-150	3.50 (three rupees fifty paisa)
151>=	5.00 (five rupees)
Calculate the bill amount for the current month based on the number of units spent, the minimum bill amount should be 100 rupees.*/

import java.util.Scanner;
class Currentbill
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        double rupees=0;
        System.out.println("Enter the number of units");
        int units=sc.nextInt();
        if(units>=1&&units<=50)
        {
            rupees=units*1.50;
        }
        else if(units>=51&&units<=100)
        {
            rupees=units*2.00;
        }
        else if(units>=101&&units<=150)
        {
            rupees=units*3.50;
        }
        else if(units>=151)
        {
            rupees=units*5.00;
        }
        if(rupees<100)
        {
            System.out.println("the minimum bill amount should be 100 rupees");
        }
        else{
            System.out.println("the bill is "+rupees+" rupees");
        }

    }
}
//TIMECOMPLEXICITY=O(n)
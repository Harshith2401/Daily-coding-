/*Qus 2:- Develop an ATM application in java to perform the following operations
Withdraw: For withdrawing the funds, gets the withdrawal amount from the user, deduct it from the total balance, and display the message.
Deposit: For depositing the funds, gets the deposit amount from the user to add, add it to the total balance, and display the message.
Check the balance: For checking the balance, display the user’s total balance.
Exit: Exit from the application by displaying Thank You message on the screen.*/
import java.util.Scanner;
class Atm
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        int balance=0,withdraw,deposit,option;
        boolean running=true;
        while(running)
        {
            System.out.println("PLEASE SELECT ANY OPTION\n");
            System.out.println("1.WITHDRAW\n");
            System.out.println("2.DEPOSIT\n");
            System.out.println("3.CHECK THE BALANCE\n");
            System.out.println("4.EXIT");
            System.out.println("enter the option\n");
            option=sc.nextInt();
            switch(option)
            {
                case 1:
                System.out.println("enter the withdrawl amount\n");
                withdraw=sc.nextInt();
                if(balance==0)
                {
                    System.out.println("insufficient balance");
                }
                else if(withdraw>balance)
                {
                    System.out.println("insufficient balance");
                }
                else
                {
                    balance=balance-withdraw;
                    System.out.println(withdraw +"is withdrawn from your account");
                    System.out.println("balance :"+balance);
                }
                break;

                case 2:
                System.out.println("enter the deposite ammount");
                deposit=sc.nextInt();
                balance=balance+deposit;
                System.out.println(deposit +"deposited in your account\n");
                System.out.println("Balance:"+balance);
                break;

                case 3:
                System.out.println("the balance is: "+balance);
                break;

                case 4:
                System.out.println("THANK YOU");
                running=false;
                break;

                default:
                System.out.println("invalid option");
            }
            
        }
    }
}
//TIMECOMPLECITY=O(n)

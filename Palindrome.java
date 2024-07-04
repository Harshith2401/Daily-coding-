/*Qus 6: check weather the given number is palindrome or not.*/
import java.util.Scanner;
class palindrome
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int r,sum=0,temp;
        System.out.println("enetr the n");    
        int n=sc.nextInt();
        temp=n;    
        while(n>0)
        {    
            r=n%10;  //getting remainder  
            sum=(sum*10)+r;    
            n=n/10;    
        }    
        if(temp==sum)    
            System.out.println("palindrome number ");    
        else    
            System.out.println("not palindrome");
    }    
}


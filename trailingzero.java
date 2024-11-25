import java.util.scanner;
public class trailingzero {
    public static void main(String[] args) {
        
    
    
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    
        int count = 0;
        int powerOf5 = 5;

        while (n / powerOf5 > 0) {
            count += n / powerOf5;
            powerOf5 *= 5;
        }
    

        return count;
    
    }
}

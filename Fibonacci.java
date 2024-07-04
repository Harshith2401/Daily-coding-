/*us 10: print sum of first 5 elements of Fibonacci series */
public class Fibonacci 
{
        public static void main(String[] args) 
        {
            // The first 5 elements of the Fibonacci series are 0, 1, 1, 2, 3
            int[] fibonacci = new int[5];
            fibonacci[0] = 0;
            fibonacci[1] = 1;
            // Generate the first 5 elements of the Fibonacci series
            for (int i = 2; i < 5; i++) {
                fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            }
            // Calculate the sum of the first 5 elements
            int sum = 0;
            for (int i = 0; i < 5; i++) {
                sum += fibonacci[i];
            }
            System.out.println("Sum of the first 5 elements of the Fibonacci series: " + sum);
        }
}

import java.util.*;
public class arraymanupulation{
    public static int maxSumNonAdjacent(int[] houses) {
        int n=houses.length;
        if (n==0) return 0;
        if (n==1) return houses[0]; 
        int include=houses[0];
        int exclude=0;        
        for (int i=1;i<n;i++) 
        {
            int temp=include;
            include=exclude+houses[i];
            exclude=Math.max(temp, exclude);
        }
        return Math.max(include,exclude);
    }

    public static void main(String[] args) {
        int[] houses = {1,99,100,98,5};
        System.out.println( maxSumNonAdjacent(houses));
    }
}

import java.util.*;
public class HousePro{

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int arr[] = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }

        int arr2[] = new int[n];
        arr2[0] = arr[0];
        arr2[1] = Math.max(arr[0], arr[1]);
        // a theif is going to steal the maximal value of these houses,
        // but he cant stea in 2 adjecnt houses, but he cant steal in two
        // adjacent houses. what is the maximal value

        for(int i=2; i<n; i++){
            arr2[i] = Math.max(arr2[i-1], arr2[i-2] + arr[i]);

        }

        System.out.println(arr2[n-1]);

    }

}
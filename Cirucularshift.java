/*Given an array of 10 two-digit numbers, develop a program that does the following:
The elements in the even position should be shifted right (circular shift) by two 
positions and the elements in the odd position should be shifted left (circular shift) 
by two positions.
INPUT : 
12 23 71 34 92 43 12 67 72 88
OUTPUT:
71 88 92 23 12 34 72 43 12 67 */



class CircularShift {
    public static void main(String args[]) {
        int arr[]={12,23,71,34,92,43,12,67,77,88}; // Directly assigned elements
        int res[]=new int[10];

        int iteration=arr.length/2-1;
        int j=1;
        while(j<=iteration)
        {
            // Shift odd-indexed elements
            for(int i=1;i<arr.length;i+=2) {
                int newIndex=i-2;
                if(newIndex<0)
                    newIndex=newIndex+arr.length; // Circular shift for negative index
                res[newIndex]=arr[i];
            }
    
            // Shift even-indexed elements right by 2 positions
            for(int i=0;i<arr.length;i+=2) {
                int newIndex=i+2;
                if(newIndex>=arr.length)
                    newIndex=newIndex-arr.length; // Circular shift for exceeding index
                res[newIndex]=arr[i];
            }
            for(int k=0;k<res.length;k++)
            {
                arr[k]=res[k];
            }
            j+=1;
        }

        // Output the result
        for(int k=0;k<res.length;k++)
            System.out.print(res[k]+" ");
    }
}
 
public class sort012 {
    public static void sortArray(int[] arr) {
        int count0=0,count1=0,count2=0;
        for (int num : arr) 
        {
            if (num == 0) 
            count0++;
            else if (num == 1) 
            count1++;
            else 
            count2++;
        }
        int index = 0;
        while (count0-- > 0) 
        arr[index++] = 0;
        while (count1-- > 0) 
        arr[index++] = 1;
        while (count2-- > 0) 
        arr[index++] = 2;
    }

    public static void main(String[] args) {
        int[] array = {0,1,2,0,1,2,1,0};
        sortArray(array);

        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}

public class BubbleSort{
    static void bubbleSort(int arr[])
    {
        for (int i = 0; i < arr.length-1; i++)
            for (int j = 0; j <arr.length-i-1; j++) 
                if (arr[j] > arr[j+1]) //comparing the pair of elements
                {
                    // swapping a[j+1] and a[i]
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                   

                }}
        static void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++)
         System.out.print(arr[i] + " "); //printing the sorted array
        System.out.println();
    }
    public static void main(String args[])
    {
        int arr[] = {64, 34, 25, 12, 22, 11, 90};

        bubbleSort(arr);

        System.out.println("Sorted array");

        printArray(arr);
    }
}

    
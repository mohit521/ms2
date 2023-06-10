public class LinearSearch1 {
        // This function returns index of element x in arr[]
        static int search(int arr[], int x)
        {
            for (int i = 0; i < arr.length; i++) {
                // Return the index of the element if the element
                // is found
                if (arr[i] == x)
                    return i;
            }
            // return -1 if the element is not found
            return -1;
        }
    
        public static void main(String[] args)
        {
            int[] arr = { 3, 4, 1, 7, 5 };
            
            int x = 4;
    
            int index = search(arr, x);
            if (index == -1)
                System.out.println("Element is not present in the array");
            else
                System.out.println("Element found at position " + index+"  "+"Total elements are"+" "+arr.length);
        }
    }

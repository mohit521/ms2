public class BinarySearch {
        // CALLED METHOD
        static int binarySearch(int arr[], int start, int end, int target)
        {
            if (end >= start) {
                int mid = start + (end - start) / 2;
    
                // If the element is present at the
                // middle itself
                if (arr[mid] == target)
                    return mid;
    
                // If element is smaller than mid, then
                // it can only be present in left subarray
                if (arr[mid] > target)
                    return binarySearch(arr, start, mid - 1, target);
    
                // Else the element can only be present
                // in right subarray
                return binarySearch(arr, mid + 1, end, target);
            }
    
            // We reach here when element not present 
            return -1;
        }
    
        // MAIN
        public static void main(String args[])
        {
            int arr[] = { 2, 3, 4, 10, 40 };
            int n = arr.length;
            int target = 10;
            int result = binarySearch(arr, 0, n - 1, target);
            if (result == -1)
                System.out.println("Element not present");
            else
                System.out.println("Element found at index "
                                + result);
        }
    }

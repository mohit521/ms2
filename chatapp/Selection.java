import java.io.*;
public class Selection
{
	static void sort(int arr[])
	{
//move boundary of unsorted array...
		for (int i = 0; i < arr.length-1; i++)
		{
			// For minimum element in arr
			int min = i;
			for (int j = i+1; j < arr.length; j++)
				if (arr[j] < arr[min])
					min = j;

			// Swap...
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
        }
    }
	public static void printArray(int arr[])
	{
		for (int i=0; i<arr.length;i++)
			System.out.print(arr[i]+" ");
		System.out.println();
	}
    //main
	public static void main(String args[])
	{
		int arr[] = {64,25,12,22,11};
		sort(arr);
		System.out.println("Sorted array");
		printArray(arr);
	}
}

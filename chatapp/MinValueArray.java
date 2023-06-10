public class MinValueArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,-1,6,7,8};
        System.out.println("Array is already available");
        System.out.println(min(arr));
 
    }
    static int min(int arr[]){
        int value = arr[0];
        for( int i=1;i<arr.length ;i++){
            if(arr[i]<value){
                value=arr[i];
                
            }
        }
        return value;
    }
}

public class Findlargest {
    
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
       int d= largest(arr);
       System.out.println("The largest value in the array is "+d);
    }
    static int largest(int arr[]){
        if(arr.length==0){
         System.out.println("The array don't contain any value in it ");
        }
        for(int i=1;i<arr.length;i++){
            int e=arr[0];
            if(arr[i]>e){
                int temp=arr[i];
                return temp;
            }else{
                return e;
            }
        }
        return -1;

    }
}

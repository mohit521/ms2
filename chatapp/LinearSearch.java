public class LinearSearch {
    public static void main(String[] args) {
        int num[]={22,23,24,25,28,29,56,78};
        int target=24;
        int ans=search(num,target);
        System.out.println(ans);
    }
    static int search(int arr[] , int target){
        if(arr.length==0){
            return -1;
        }
            for(int i=0;i<arr.length;i++){
                int take=arr[i];
                if(take==target){
                    return i ;
                }           
            }
            return -1;
        }
 }
    

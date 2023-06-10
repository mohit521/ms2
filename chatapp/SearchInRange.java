public class SearchInRange {
    public static void main(String[] args) {
        int num[]={1,2,3,4,5,6,7,8,9};
        int target=6;
        int d=search(num,target,2,5);
        System.out.println(d);
    }
    static int search(int arr[],int target,int start,int end){
        if(arr.length==0){
            return -1;
        }
        for(int index=start; index<=end ;index++){
            if(arr[index]==target){
                return index;
            }
        }
        return -1;
    }
}

public class Arr {
    int roll;
    String name ;
    String add;
   public Arr(int roll,String name,String add){
    this.roll=roll;
    this.name=name;
    this.add=add;

   }

 class Dp{
    public static void main(String[] args) {
     String arr[ ] = new String[3];
     arr[0]="Fifteen";
     arr[1]="mohit";
     arr[2]="khanwar";
     for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
     }
    }
}
}
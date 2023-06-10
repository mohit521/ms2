public class Reverse1 {
    public static void main(String[] args) {
        String str= " mohit singh " ;
        char[] ch=str.toCharArray();
        for(int i=ch.length-1;i>=0;i--){ 
            System.out.println(ch[i]);
        }


        String str1="bondms";
        for(int j=str1.length()-1;j>=0;j--){
            System.out.println(str1.charAt(j));
        }



        StringBuffer sb=new StringBuffer(str1);
        System.out.println(sb.reverse());
    }
}

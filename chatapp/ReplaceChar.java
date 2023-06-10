public class ReplaceChar {
    public static void main(String[] args) {
        String s="mohitsingh $%$%$$^&#$##";
        System.out.println(s.replaceAll("[^0-9,A-Z,a-z]" , " "));
        int a=s.charAt(4);
        System.out.println(a);
        
    }
    
}

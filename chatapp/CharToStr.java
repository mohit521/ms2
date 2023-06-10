public class CharToStr {
    public static void main(String[] args) {
        //for Character we are using toString...
        char ch ='A';
        String str=Character.toString(ch);                              
        System.out.println("The String is : "+ str);
        //for String we are using valueOf...
        char ch1=65;
        String str1=String.valueOf(ch1);
        System.out.println("The String is : "+str1);
        //String to character
        
        String s1="mohit";

    for(int i=0;i<s1.length();i++){
        char ls =s1.charAt(i);
        if(ls=='i'){
            break;
        }
        System.out.println("character at "+""+i+""+" is "+ls);
    }
        
    
    }
}
    


    

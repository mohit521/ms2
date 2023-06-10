public class Object {
        String name;
        String surname;
        int rollNo;
        Object(String a, String b, int c){
            this.name= a;
            this.surname = b;
            this.rollNo= c;
        }
        public void getStudentDetails(){
            System.out.println("The name of the student is "+ this.name +" "+ this.surname);
            System.out.println("The roll no of the student is "+ this.rollNo);
        }
        
        public static void main(String args[]) {
            Object var = new Object("Vivek", "Yadav" , 20);
            var.getStudentDetails();
        
        }
    }

class Name{
        String fname;
        String mname;
        void name(String fname,String mname){
            this.fname=fname;
            this.mname=mname;
            System.out.println("NAME GIVEN:  " + "  "+fname+ "  &  " +" " +mname);
        }
}
class Mark{
    int d1,d2,d3;
    void mark(int m1,int m2,int m3){
    this.d1=m1;
    this.d2=m2;
    this.d3=m3;
    System.out.println("MARK GIVEN:  "  +m1+  " " + m2 + "  "+m3);
   }
}
   class Address{
    int dno;
    int pincode;
    String state;
    String country;
    void student(int dno,int pincode, String state,String country){
        this.dno=dno;
        this.pincode=pincode;
        this.state=state;
        this.country=country;
        System.out.println("ADDRESS GIVEN:  "+dno+"/ "+ pincode + " "+ state+" "+country);
    }
} 
class Status{
    int m1,m2,m3;
    void status(int d1,int d2, int d3){
        this.m1=d1;
        this.m2=d2;
        this.m3=d3;
        int total=m1+m2+m3;
        if(total>=150){
            System.out.println("STATUS : "+"  pass");
        }
        else{
            System.out.println("STATUS : "+"  fail");
        }
    }
    public static void main(String[] args) {
        Name n= new Name();
        n.name("Ashok kumar singh","Lalita Devi");
        Mark m=new Mark();
        m.mark(15,67,80);

        Address ad=new Address();
        ad.student(12,221711,"Uttar Pradesh","india");
        Status s=new Status();
        s.status(20,10,40);


    }}
   
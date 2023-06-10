class Mythread extends Thread{  
    public void run(){
        for(int j=1;j<=10;j++){
            System.out.println("Mohit ");
            try{
                Thread.sleep(2000);
            }
            catch(Exception e){
                e.printStackTrace();
            }

        }
        for(int i=1;i<=10;i++){
            System.out.print(" singh ");
            try{
                Thread.sleep(3000);
            }
            catch(Exception e){
                e.printStackTrace();

            }
        }
    }
    
}
class DemoThread{
    public static void main(String[] args) {
        Mythread t=new Mythread();
        t.start();
        System.out.println(Thread.currentThread().getName());
        
    }
}
class InstanceBlock
{
   InstanceBlock( )                                            // This constructor will get executed for 1st kind of object 
   {
      System.out.println("0 argument constructor");
   }

   InstanceBlock(int a)                                        // This constructor will get executed for 2nd kind of object
   {
      System.out.println("1 argument constructor");
   }

   InstanceBlock(int a , int b)                                // This constructor will get executed for 3rd kind of object
   {
      System.out.println("2 arguments constructor");
   }

   {                                                  // Creation of an instance block
      System.out.println("Instance block");          
   }

   public static void main(String[ ] args)
   {
      new InstanceBlock( );                                      // Object of 1st kind
      new InstanceBlock(10);                                     // Object of 2nd kind
      new InstanceBlock(10,20);                                  // Object of 3rd kind
   }
}

public class Polymorphism {
        // Method 1
        // Multiplication of 2 numbers
        static int Multiply(int a, int b)
        {
            return a * b;
        }
    
        // Method 2
        // // Multiplication of 3 numbers
        static int Multiply(int a, int b, int c)
        {
    
            // Return product
            return a * b * c;
        }
        public static void main(String[] args)
        {
    
            // Calling method by passing
            // input as in arguments
            System.out.println(Polymorphism.Multiply(2, 4));
            System.out.println(Polymorphism.Multiply(2, 7, 3));
        }
    }
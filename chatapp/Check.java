public class Check {

   public static int method(int x, int y, int z) {
        int count = 0;
        for (int i = x; i <= y; i++) {
            int num = i;
            while (num > 0) {
                int k = num % 10;
                if (z == k) {
                    count++;
                }
                num = num / 10;
            }

        }
        return count;
    }

    public static void main(String[] args) {
        int result = method(41, 45, 4);
        System.out.println(result);

    }
}
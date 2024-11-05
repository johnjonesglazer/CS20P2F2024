package skillbuilders;

public class Reverse {
    public static void main(String[] args) {
        int[] countdown = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println("Countdown");


        reverse(countdown);

        try {
            for (int i = 0; i < countdown.length; i++) {
                System.out.println(countdown[i]);
               	Thread.sleep(1000); // Sleep for 1 second
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void reverse(int[] array) {
        int start = 0;
        int end = array.length - 1;

        while (start < end) {
            
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;


            start++;
            end--;
        }
    }
}

package skillbuilders;

import java.util.Scanner;
import java.util.Random;

public class RandomNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter the minimum value: ");
        int min = scanner.nextInt();
        
        System.out.print("Enter the maximum value: ");
        int max = scanner.nextInt();

        if (min > max) {
            System.out.println("The minimum value cannot be greater than the maximum value.");
        } else {
            int randomNum = random.nextInt(max - min + 1) + min;
            System.out.println("Random number between " + min + " and " + max + ": " + randomNum);
        }

    }
}


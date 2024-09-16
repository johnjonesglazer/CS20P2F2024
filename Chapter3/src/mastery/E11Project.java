package mastery;

import java.util.Scanner;

public class E11Project {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter time spent designing (in hours): ");
        double designingTime = scanner.nextDouble();

        System.out.print("Enter time spent coding (in hours): ");
        double codingTime = scanner.nextDouble();

        System.out.print("Enter time spent debugging (in hours): ");
        double debuggingTime = scanner.nextDouble();

        System.out.print("Enter time spent testing (in hours): ");
        double testingTime = scanner.nextDouble();

        double totalTime = designingTime + codingTime + debuggingTime + testingTime;

        double designingPercentage = (designingTime / totalTime) * 100;
        double codingPercentage = (codingTime / totalTime) * 100;
        double debuggingPercentage = (debuggingTime / totalTime) * 100;
        double testingPercentage = (testingTime / totalTime) * 100;

        System.out.println("\nTask\t\tTime (%)");
        System.out.println("--------------------------");
        System.out.printf("Designing\t%.2f %%\n", designingPercentage);
        System.out.printf("Coding\t\t%.2f %%\n", codingPercentage);
        System.out.printf("Debugging\t%.2f %%\n", debuggingPercentage);
        System.out.printf("Testing\t\t%.2f %%\n", testingPercentage);

        scanner.close();
    }
}

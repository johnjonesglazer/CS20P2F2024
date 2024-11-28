package skillbuilders;

import java.io.*;
import java.util.*;

public class Stats {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FileWriter writer = null;

        try {
            System.out.println("Enter the name of the file to create:");
            String fileName = scanner.nextLine();
            File file = new File("C:\\Users\\78353001\\git\\CS20P2F2024\\FilesandExceptionHandling\\src\\skillbuilders\\" + fileName);

            System.out.println("Enter the number of students:");
            int numStudents = Integer.parseInt(scanner.nextLine());

            writer = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);

            for (int i = 0; i < numStudents; i++) {
                System.out.println("Enter the student's name:");
                String name = scanner.nextLine();
                System.out.println("Enter the student's score:");
                String score = scanner.nextLine();

                bufferedWriter.write(name);
                bufferedWriter.newLine();
                bufferedWriter.write(score);
                bufferedWriter.newLine();
            }

            bufferedWriter.close();

            FileReader reader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line;
            List<Integer> scores = new ArrayList<>();
            System.out.println("\nStudent Scores:");
            while ((line = bufferedReader.readLine()) != null) {
                String studentName = line;
                if ((line = bufferedReader.readLine()) != null) {
                    int studentScore = Integer.parseInt(line);
                    scores.add(studentScore);
                    System.out.println(studentName + ": " + studentScore);
                }
            }

            bufferedReader.close();

            if (!scores.isEmpty()) {
                int lowest = Collections.min(scores);
                int highest = Collections.max(scores);
                double average = scores.stream().mapToInt(Integer::intValue).average().orElse(0.0);

                System.out.println("\nStatistics:");
                System.out.println("Lowest Score: " + lowest);
                System.out.println("Highest Score: " + highest);
                System.out.printf("Average Score: %.2f%n", average);
            } else {
                System.out.println("No scores available.");
            }

        } catch (IOException e) {
            System.out.println("Error working with the file: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid number entered. Please try again.");
        } finally {
            try {
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
                System.out.println("Error closing the file writer: " + e.getMessage());
            }
            scanner.close();
        }
    }
}

package skillbuilders;

import java.io.*;
import java.util.*;

public class Roster {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FileWriter writer = null;
        BufferedWriter bufferedWriter = null;

        try {
            System.out.println("Enter the name of the file to store student names:");
            String fileName = scanner.nextLine();
            File outputFile = new File("C:\\Users\\78353001\\git\\CS20P2F2024\\FilesandExceptionHandling\\src\\skillbuilders\\" + fileName);

            writer = new FileWriter(outputFile);
            bufferedWriter = new BufferedWriter(writer);

            System.out.println("Enter the number of students in the class:");
            int numberOfStudents = Integer.parseInt(scanner.nextLine());

            List<StuName> studentList = new ArrayList<>();
            for (int i = 1; i <= numberOfStudents; i++) {
                System.out.println("Enter the first name of student " + i + ":");
                String firstName = scanner.nextLine();

                System.out.println("Enter the last name of student " + i + ":");
                String lastName = scanner.nextLine();

                StuName student = new StuName();
                student.firstName = firstName;
                student.lastName = lastName;
                studentList.add(student);

                bufferedWriter.write(student.firstName + " " + student.lastName);
                bufferedWriter.newLine();
            }

            System.out.println("\nClass roster has been saved to: " + fileName);

            System.out.println("\nClass Roster:");
            for (StuName student : studentList) {
                System.out.println(student.firstName + " " + student.lastName);
            }

        } catch (IOException e) {
            System.out.println("Error working with files: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format. Please enter a valid number.");
        } finally {
            try {
                if (bufferedWriter != null) {
                    bufferedWriter.close();
                }
            } catch (IOException e) {
                System.out.println("Error closing the file: " + e.getMessage());
            }
            scanner.close();
        }
    }

    static class StuName {
        public String firstName;
        public String lastName;
    }
}

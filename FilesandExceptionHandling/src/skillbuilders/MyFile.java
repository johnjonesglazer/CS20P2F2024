package skillbuilders;
import java.io.*;
import java.util.Scanner;

public class MyFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        File file = new File("C:\\Users\\78353001\\git\\CS20P2F2024\\FilesandExceptionHandling\\src\\skillbuilders\\zzz.txt");

        try {
            if (file.createNewFile()) {
                System.out.println("File zzz.txt has been created.");
            } else {
                System.out.println("File zzz.txt already exists.");
            }

            System.out.println("Would you like to keep or delete the file? (Enter 'keep' or 'delete')");
            String choice = scanner.nextLine().trim().toLowerCase();

            if (choice.equals("delete")) {
                if (file.delete()) {
                    System.out.println("File zzz.txt has been successfully deleted.");
                } else {
                    System.out.println("Failed to delete the file.");
                }
            } else if (choice.equals("keep")) {
                System.out.println("The file has been kept.");
            } else {
                System.out.println("Invalid input. The file has been kept by default.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

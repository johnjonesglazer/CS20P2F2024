package skillbuilders;

import java.io.*;

public class Assignment {

    public static void main(String[] args) {
        File file = new File("C:\\Users\\78353001\\git\\CS20P2F2024\\FilesandExceptionHandling\\src\\skillbuilders\\assignment_instructions.txt");
        
        try (FileReader fr = new FileReader(file); BufferedReader br = new BufferedReader(fr)) {
            System.out.println("Contents of the file: \n");
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("The file was not found. Please ensure it is in the correct directory.");
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}

import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.*;

public class q9 {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            // Prompt the user for the file name
            System.out.println("Enter the file name:");
            String fileName = reader.readLine();

            // Create a Path object for the specified file
            Path filePath = Paths.get(fileName);
          
          

            // Check if the file exists
            if (!Files.exists(filePath)) {
                System.out.println("The specified file does not exist.");
                return;
            }

            // Get the basic file attributes
            BasicFileAttributes attributes = Files.readAttributes(filePath, BasicFileAttributes.class);

            // Display the file metadata
            System.out.println("File metadata for " + fileName + ":");
            System.out.println("Size: " + attributes.size() + " bytes");
            System.out.println("Last Modified Time: " + attributes.lastModifiedTime());
            System.out.println("Is Directory: " + attributes.isDirectory());
            System.out.println("Is Regular File: " + attributes.isRegularFile());
            System.out.println("Is Symbolic Link: " + attributes.isSymbolicLink());
            System.out.println("Is Other: " + attributes.isOther());
        } catch (IOException e) {
            System.out.println("An error occurred while reading user input or accessing file attributes.");
            e.printStackTrace();
        }
    }
}

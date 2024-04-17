import java.io.File;
import java.util.Scanner;

public class q5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for a directory path
        System.out.println("Enter the directory path:");
        String directoryPath = scanner.nextLine();

        // Create a File object with the specified directory path
        File directory = new File(directoryPath);

        // Check if the directory exists
        if (directory.exists() && directory.isDirectory()) {
            // Get a list of all files in the specified directory
            File[] files = directory.listFiles();

            // Display the list of text files
            System.out.println("Text files in " + directoryPath + ":");
            for (File file : files) {
                if (file.isFile() && file.getName().endsWith(".txt")) {
                    System.out.println(file.getName());
                }
            }
        } else {
            // Inform the user if the directory does not exist
            System.out.println("The specified directory does not exist.");
        }
    }
}

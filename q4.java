import java.io.File;
import java.util.Scanner;

public class q4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for a directory path
        System.out.println("Enter the directory path:");

        String directoryPath = scanner.nextLine();

        // Create a File object with the specified directory path
        File directory = new File(directoryPath);

        // Check if the directory exists
        if (directory.exists() && directory.isDirectory()) {
            // Get a list of all files and directories in the specified directory
            File[] filesAndDirs = directory.listFiles();

            // Display the list of files and directories
            System.out.println("Files and directories in " + directoryPath + ":");
            for (File fileOrDir : filesAndDirs) {
                if (fileOrDir.isDirectory()) { 
                    System.out.println("Directory: " + fileOrDir.getName());
                } else {
                    System.out.println("File: " + fileOrDir.getName());
                }
            }
        } else {
            // Inform the user if the directory does not exist
            System.out.println("The specified directory does not exist.");
        }
    }
}

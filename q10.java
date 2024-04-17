import java.io.File;
import java.util.Scanner;

public class q10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for a directory path
        System.out.println("Enter the directory path:");
        String directoryPath = scanner.nextLine();

        // Create a File object with the specified directory path
        File directory = new File(directoryPath);

        // Check if the directory exists
        if (directory.exists() && directory.isDirectory()) {
            // Display the directory structure recursively
            System.out.println("Directory structure for " + directoryPath + ":");
            listFilesAndDirectories(directory, 0);
        } else {
            // Inform the user if the directory does not exist
            System.out.println("The specified directory does not exist.");
        }
    }

    // Recursive method to list files and subdirectories
    private static void listFilesAndDirectories(File directory, int depth) {
        // Get a list of all files and directories in the specified directory
        File[] filesAndDirs = directory.listFiles();

        // Display the contents of the directory
        for (File fileOrDir : filesAndDirs) {
            // Indent based on the depth of recursion
            for (int i = 0; i < depth; i++) {
                System.out.print("  ");
            }

            // Print the name of the file or directory
            System.out.println(fileOrDir.getName());

            // Recursively call the method for subdirectories
            if (fileOrDir.isDirectory()) {
                listFilesAndDirectories(fileOrDir, depth + 1);
            }
        }
    }
}

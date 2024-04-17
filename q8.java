import java.io.*;

public class q8 {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            // Prompt the user for the current file name
            System.out.println("Enter the current file name:");
            String currentFileName = reader.readLine();

            // Prompt the user for the new file name
            System.out.println("Enter the new file name:");
            String newFileName = reader.readLine();

            // Create File objects for the current and new files
            File currentFile = new File(currentFileName);
            File newFile = new File(newFileName);

            // Check if the current file exists
            if (!currentFile.exists()) {
                System.out.println("The specified file does not exist.");
                return;
            }

            // Check if the new file name already exists
            if (newFile.exists()) {
                System.out.println("A file with the specified new name already exists. Rename failed.");
                return;
            }

            // Perform the rename operation
            if (currentFile.renameTo(newFile)) {
                System.out.println("File renamed successfully.");
            } else {
                System.out.println("Failed to rename the file.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading user input.");
            e.printStackTrace();
        }
    }
}

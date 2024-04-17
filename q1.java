import java.io.*;
import java.util.*;

public class q1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for a diary entry
        System.out.println("Enter your diary entry:");
        String entry = scanner.nextLine();

        // Get the current date
        Date currentDate = new Date();
        String dateString = currentDate.toString();

        // Create or append to the diary file
        try {
           // true for appending
            
            
            // Check if the file already exists
            File diaryFile = new File("C:\\Users\\DELL\\Desktop\\diary.txt");
            if (diaryFile.exists()) {
                System.out.println("The diary file already exists. Appending to it...");
            } else {
                System.out.println("Creating a new diary file...");
            }

            // Write the date and entry to the file
            FileWriter fileWriter = new FileWriter("C:\\Users\\DELL\\Desktop\\diary.txt", true); 
            fileWriter.write("Date: " + dateString);
            fileWriter.write("Entry: " + entry + "\n");
            

            // Close the writers
            
            fileWriter.close();

            System.out.println("Diary entry has been successfully recorded.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the diary file.");
            e.printStackTrace();
        }
    }
}

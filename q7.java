import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write a source path");
        String src1 = sc.nextLine();

        System.out.println("Write a destination path path");
        String src2 = sc.nextLine();

        File f1 = new File(src1);
        File f2 = new File(src2);

        try {
            if (f1.exists() && f2.exists()) {
               
                FileWriter fw = new FileWriter(src2);
                Scanner sc1 = new Scanner(f1);
                while (sc1.hasNextLine()) {
                    String line = sc1.nextLine();
                   
                    fw.write(line);

                }
                fw.close();

            }
        } catch (IOException e) {
            System.out.println("Error shouing...");
        }

    }

}

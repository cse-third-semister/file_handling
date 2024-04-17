import java.io.File;
import java.io.IOException;
import java.util.*;

public class q2 {
    public static void main(String[] args) {
        File myfile = new File("C:\\Users\\DELL\\Desktop\\diary.txt");
        try{
            if(myfile.exists()){
            Scanner sc = new Scanner(myfile);
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
            }
            else {
                System.out.println("file does not exits");
            }
        }
        catch(IOException e){
            System.out.println("file does not exits");
            System.out.println(e.getMessage());
        }
    }

}

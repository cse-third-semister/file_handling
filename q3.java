import java.io.File;
import java.io.FileWriter;
import java.util.*;
import java.io.IOException;



public class q3 {
    public static void main(String[] args) {

        File myfile  = new File("C:\\Users\\DELL\\Desktop\\diary.txt");
        try{
            FileWriter nf = new FileWriter("C:\\Users\\DELL\\Desktop\\diary.txt",true);
            Scanner sc = new Scanner(System.in);
            Date dt = new Date();
            String d = dt.toString();
            System.out.println("enter diary note");
            String s = sc.nextLine();
            nf.write(s + ": "  + d + "\n");
            nf.close();


        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
       

        
    }
    
}

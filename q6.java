import java.io.File;
import java.util.Scanner;
public class q6 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Write a file name");
        String f = sc.nextLine();


        File myFile = new File("D:\\4th_sem_all_code\\"+f);
        if(myFile.delete()){
            System.out.println("I have deleted: " + myFile.getName());
        }
        else{
            System.out.println("Some problem occurred while deleting the file");
        }
        
    }
    
}

import java.io.File;
import java.util.Scanner;
import java.io.IOException;

public class PLZ {
     
    public static void main(String... arg) throws IOException, InterruptedException {
        
        //Create the txt file and check if it's exist
         File file23 = new File("db.txt");
         if (file23.createNewFile()){
           System.out.println(""); } 
         else {
          System.out.println("");}
         
        // Clear the console, set windows size,title
        new ProcessBuilder("cmd", "/c", "cls && mode con:cols=65 lines=90 && TITLE 'txtChat By Renwa'").inheritIO().start().waitFor();

        //Infinite loop for read the file as live
        for (int i = 0; i < 10; i--) {
            
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); //clear console after each read
        
                              //Scanner to read each line
			Scanner scanner = new Scanner(new File("db.txt"));
			while (scanner.hasNextLine()) {
			System.out.println(scanner.nextLine());}
                              
                              Thread.sleep(500); //Delay loop for 0.5 seconds 
}}}
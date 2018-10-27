import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class Ttp {
    public static void main(String[] args) throws IOException, InterruptedException {
        
            // Clear the console, set windows size,title
            new ProcessBuilder("cmd", "/c", "cls && mode con:cols=65 lines=20 && TITLE 'Chat By Renwa'").inheritIO().start().waitFor();

            //Scanner for adding nickname
            Scanner xx = new Scanner(System.in);
            System.out.print("Enter Your Nickname: ");
            String test4 = xx.nextLine();
            
            //Clear console after nickname is set
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            
                    //Create the txt file and check if it's exist
                    File file23 = new File("db.txt");
                    if (file23.createNewFile()){
                    System.out.println("");
                    } else {
                    System.out.println("");}

        //Infinte loop for write to the file
        for (int i = 0; i < 10; i--) {
        
        //Nickname show 
        Scanner ss=new Scanner(System.in);
        System.out.print("<"+test4+"> ");
        String sx = ss.nextLine();
        
        //Clear Screen after each message
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        
        //Write to the file
        String contentToAppend = "<"+test4+"> "+sx+"\r\n";
        Files.write(
        Paths.get("db.txt"), 
        contentToAppend.getBytes(), 
        StandardOpenOption.APPEND);
    
        //Type "-clear" to clear the file
            if ("-clear".equals(sx)){
        clearTheFile();
        }}}
    
    //Clear the file 
    public static void clearTheFile() throws IOException {
        FileWriter fwOb = new FileWriter("db.txt", false); 
        PrintWriter pwOb = new PrintWriter(fwOb, false);
        pwOb.flush();
        pwOb.close();
        fwOb.close();
    }}

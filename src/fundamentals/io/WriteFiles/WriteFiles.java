package WriteFiles;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFiles {
    public static void main(String[] args) throws IOException {
        //learning how to write a file using java (4 popular options)

        // FileWriter = Good for small or medium-sized text files
        // BufferedWriter = Better performance for large amounts of text
        // PrintWriter = Best for structures data, like reports or logs
        // FileOutputStream = Best for binary files (e.g., images, audio files)

        String filePath = "C:\\Users\\chrji\\Downloads\\test.txt";
        String textContent = "I like Pizza!\nIt's really good!\nBuy me pizza!!";

        try( FileWriter write = new FileWriter(filePath) ){
            write.write(textContent);
            System.out.println("File has been written!");
        }catch(FileNotFoundException e){
            System.out.println("Could not locate file location!");
        }catch( IOException e ){
            System.out.println("Could not write the file!");
        }
    }
}

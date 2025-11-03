package ReadFiles;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFiles {
    public static void main(String[] args){
        //how to read a file using java (there is 3 popular options)

        // BufferedReader + FileReader: Best for reading text files line-by-line
        // FileInputStream: Best for binary files (e.g., images, audio files)
        // RandomAccessFile: Best for read/write specific portions of a large file

        String filePath = "C:\\Users\\chrji\\Downloads\\test.txt";

        try( BufferedReader reader = new BufferedReader(new FileReader(filePath)) ){
                String line;
                while( (line = reader.readLine()) != null ){
                    System.out.println(line);
                }
            System.out.println("That file does exist!");
        }catch(FileNotFoundException e){
            System.out.println("Could not locate file");
        }catch(IOException e){
            System.out.println("Something went wrong!");
        }


    }
}

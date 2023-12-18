package Java_09.ushtrime;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Files {
    private static final String FILE_URL = "src/Java_09/ushtrime/log_file.txt";
    public static void main(String[] args) {
        File file = new File(FILE_URL);
        if(!file.exists()){
            try{
                file.createNewFile();
            }catch (IOException e){
                System.out.println("Ka ndodhur nje gabim: " + e);
            }
        }

        FileWriter writer = null;
        try {
            writer = new FileWriter(file, true);
            writer.write("This is a file text 2!");
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}

class FileManager {
    private String file;

    public FileManager(String file){
        this.file = file;
    }

}

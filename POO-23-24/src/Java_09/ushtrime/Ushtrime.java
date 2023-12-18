package Java_09.ushtrime;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ushtrime {
    public static void main(String[] args) {
        File file = new File("ushtrimet.txt");
        if(file.exists()){
            System.out.println("File exists!");
        }else{
            System.out.println("File doesn't exists!");
            try{
                file.createNewFile();
                System.out.println("New file was created!");
            }catch (IOException ioe){

            }
        }

        System.out.println("File has read access:" + file.canRead());
        System.out.println("File has write access:" + file.canWrite());
        System.out.println("File has run access:" + file.canExecute());
        System.out.println("Length of file:" + file.length());

        try {
            FileWriter fileWriter = new FileWriter(file, true);
            fileWriter.write("Test");
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try{
            Scanner fileReader = new Scanner(file);
            while(fileReader.hasNextLine()){
                System.out.println(fileReader.nextLine());
            }
            fileReader.close();
        }catch (Exception e){

        }
    }
}

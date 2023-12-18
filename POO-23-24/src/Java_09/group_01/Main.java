package Java_09.group_01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        File file = new File("ushtrimet_grupi_1.txt");
        if(file.exists()){
            System.out.println("File exists!");
        }else{
            try{
                file.createNewFile();
                System.out.println("File created!");
            }catch (IOException ioe){
                System.out.println("File failed to create!" + ioe.getMessage());
            }
        }
        System.out.println("Has read access: " + file.canRead());
        System.out.println("Has write access: " + file.canWrite());
        System.out.println("Has execute access: " + file.canExecute());

        System.out.println("File length: " + file.length());

        // FileWriter - per me shkru ne fajll
        // Scanner - per me lexu prej nje fajll

        try{
            FileWriter writer = new FileWriter(file, true);
            writer.write("Po shkruajm ne fajll!!!\n");
            writer.close();
        }catch (IOException ioe){
            System.out.println("Ka ndodhur nje gabim gjate shkrimit ne fajll!");
        }

        try{
            Scanner scanner = new Scanner(file);
            scanner.useDelimiter(";");
            while(scanner.hasNextLine()){
                System.out.println(scanner.next());
            }
            scanner.close();
        }catch (FileNotFoundException f){
            System.out.println("Fajll-i nuk eksiston");
        }

    }
}

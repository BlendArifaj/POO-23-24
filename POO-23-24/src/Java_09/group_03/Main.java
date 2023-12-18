package Java_09.group_03;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        File file = new File("ushtrimet_grupi_3.txt");
        if(file.exists()){
           System.out.println("File exists!");
        }else{
            try{
                file.createNewFile();
                System.out.println("File created!");
            }catch (IOException ioe){
                System.out.println("File failed!" + ioe.getMessage());
            }
        }

        System.out.println("Can read: " + file.canRead());
        System.out.println("Can write: " + file.canWrite());
        System.out.println("Can execute: " + file.canExecute());

        System.out.println("File size: " + file.length());

//        file.delete();
//        FileWriter - per shkrim
//        Scanner - per lexim
        try{
            FileWriter fileWriter = new FileWriter(file, true);
            fileWriter.write("Ushtrimet\n");
            fileWriter.flush();
            fileWriter.close();
            System.out.println("Shkrimi ne fajll me sukses!");
        }catch (IOException ioe){
            System.out.println("Shkrimi ne fajll deshtoj!" + ioe.getMessage());
        }

        try{
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
        }catch (FileNotFoundException fileNotFoundException){
            System.out.println("Fajlli nuk egziston");
        }


    }
}


class Studenti {
    int id;
    String emri;

    public void ruajNeFajll(){
        try{
            FileWriter fw = new FileWriter("file_name.txt", true);
            fw.write(this.id+"\\"+this.emri + "\n");
            fw.flush();
        }catch (Exception e){

        }
    }
}
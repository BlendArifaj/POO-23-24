package Java_09.group_03;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Te krijohet klasa Studenti (id, emri, mbiemri, nota mesatare) e cila ka funksionet
 *  -   ruajNeFajll dhe
 *  -   lexoNgaFajlli
 */
public class Detyra02 {
    public static void main(String[] args){
        Student student = new Student(
            2, "Filan Fisteku", 7.5f
        );
        student.ruajNeFajll();

        ArrayList<Student> students = Student.lexoNgaFajlli();
        for(Student s : students){
            System.out.println(s.toText());
        }
    }
}

class Student{
    private int id;
    private String emri;
    private float notaMesatare;

    private static final String FILE_NAME = "studentet.txt";

    public Student(int id, String emri, float notaMesatare){
        this.id = id;
        this.emri = emri;
        this.notaMesatare = notaMesatare;
    }

    public String toText(){
        return String.format(
                "%d;%s;%f\n", this.id, this.emri, this.notaMesatare
        );
    }
    private static Student toObject(String text){
        String[] params = text.split(";");
        int id = Integer.parseInt(params[0]);
        String emri = params[1];
        float notaMesatare = Float.parseFloat(params[2]);

        return new Student(id, emri, notaMesatare);
    }
    public void ruajNeFajll(){
        try{
            FileWriter fw = new FileWriter(FILE_NAME, true);
            fw.write(this.toText());
            fw.close();
            System.out.println("Permbajtja e studentit u ruajt me sukses!");
        }catch (Exception e){
            System.out.println("Deshtoj ruajtja e studentit!");
        }
    }

    public static ArrayList<Student> lexoNgaFajlli(){
        ArrayList<Student> studentet = new ArrayList<>();
        try{
            File file = new File(FILE_NAME);
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()){
                studentet.add(
                        toObject(scanner.nextLine())
                );
            }
        }catch (Exception e){

        }
        return studentet;
    }

}
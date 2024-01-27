package Java_09.group_01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/*
    Te krijohet nje gabim i personalizuar (NotaGabim) - e cila kur te shkaktohet e ruan mesazhin e gabimit
    ne fajllin 'nota_gabim_logs.txt'.

    * Te krijohet klasa Studenti e cila ka funksionet - ruajNeFajll dhe lexoNgaFajlli
 */
public class Detyra1 {
    public static void main(String[] args){
        Studenti student1 = new Studenti(2, "Fisteku Filan", 6.7f);
        //student1.ruajNeFajll("studentet.txt");
        ArrayList<Studenti> studentet = Studenti.lexoStudentNgaFajlli("studentet.txt");
        for(Studenti s : studentet){
            System.out.print(s.toText());
        }
    }
}

class Studenti {
    private int id;
    private String emri;
    private float notaMesatare;

    public Studenti(int id, String emri, float notaMesatare){
        this.id = id;
        this.emri = emri;
        this.notaMesatare = notaMesatare;
    }

    public String toText(){
        return this.id + ";" + this.emri + ";" + this.notaMesatare + "\n";
    }

    private static Studenti fromText(String studentText){
        String[] vars = studentText.split(";");
        int id = Integer.parseInt(vars[0]);
        String emri = vars[1];
        float notaMesatare = Float.parseFloat(vars[2]);
        return new Studenti(id, emri, notaMesatare);
    }
    public void ruajNeFajll(String filename){
        try{
            FileWriter fileWriter = new FileWriter(filename, true);
            fileWriter.write(this.toText());
            fileWriter.close();
        }catch (IOException ioe){
            System.out.println("Deshtoj ruajtja e studentit ne fajll!");
        }
    }

    public static ArrayList<Studenti> lexoStudentNgaFajlli(String filename){
        ArrayList<Studenti> studentet = new ArrayList<>();
        try{
            File file = new File(filename);
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()){
                // 1;Filan Fisteku;7.6 => ['1', 'Filan Fisteku', '7.6']
                //"komerciale-123-321-500"
//                String[] vars = scanner.nextLine().split("-");
//                vars[1];
//                vars[2];
//                vars[3]
//

                String studentText = scanner.nextLine();
                studentet.add(Studenti.fromText(studentText));
            }
        }catch (Exception e){
            System.out.println("Ka deshtuar leximi!" + e.getMessage());
        }
        return studentet;
    }
}
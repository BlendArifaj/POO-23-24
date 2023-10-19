package Java_02.group_01;

public class Detyra_01 {
//    Te krijohet klasa Studenti e cila ka vecorite:
//    - id, emri, mbiemri dhe notat (varg i numrave)
//    dhe sjelljet/metodat:
//    - printoTeDhenat - printon te dhenat ne ekran
//    - notenMesatare - kalkulon dhe shtyp
//                              noten mesatare
//    Inicializimi i anetareve te klases duhet te
//    behet permes konstruktorit.

//    Pjesa-2:
//    Te programi main: te krijohen dy instanca te
//    klases Student si dhe te thirren metodat e
//    deklaruara.

//      Pjesa-3:
//    Te krijohen sjelljet:
//    - shtoNoten(int nota) - e cila e shton nje note te re te studenti
//    - numeroNotat(int nota) - e cila na tregon se sa here nota eshte e paraqitur
//    ne liste

    public static void main(String[] arguments){
        int[] notat = {6,7,8,9,10};
        Student studentA = new Student(
          "1230",
          "Filan",
          "Fisteku",
                notat
        );
        Student studentB = new Student(
                "1240",
                "Filan",
                "Fisteku",
                new int[]{10, 10, 10, 10}
        );

        studentA.printoTeDhenat();
        System.out.println("Nota 10, tek studenti 1: " + studentA.numeroNotat(10));

        studentB.shtoNoten(9);
        studentB.printoTeDhenat();
        System.out.println("Nota 10, tek studenti 2: " + studentB.numeroNotat(10));
    }
}


class Student {
    String id;
    String emri;
    String mbiemri;
    int[] notat;

    Student(
            String id,
            String emri,
            String mbiemri,
            int[] notat
    )
    {
        this.id = id;
        this.emri = emri;
        this.mbiemri = mbiemri;
        this.notat = notat;
    }

    double notaMesatare(){
        double sum = 0;
        for(int nota : this.notat){
            sum += nota;
        }
        return sum / this.notat.length;
    }

    void printoTeDhenat(){
        System.out.println("Id: " + this.id);
        System.out.println("Emri: " + this.emri);
        System.out.println("Mbiemri: " + this.mbiemri);
        System.out.println("Nota mesatare: " + this.notaMesatare());
    }

    void shtoNoten(int nota){
        int [] newNotat = new int[this.notat.length + 1];
        for(int i = 0; i < this.notat.length; i++){
            newNotat[i] = this.notat[i];
        }
        newNotat[newNotat.length - 1] = nota;
        this.notat = newNotat;
    }
    int numeroNotat(int nota){
        int sum = 0;
        for(int n : this.notat){
            if(n == nota) {
                sum++;
            }
        }
        return sum;
    }

}

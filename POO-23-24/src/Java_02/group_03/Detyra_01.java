package Java_02.group_03;

//   Te krijohet klasa Studenti e cila ka vecorite:
//    - id, emri, mbiemri dhe notat (varg i numrave)
//   dhe sjelljet/metodat:
//    - notenMesatare - kalkulon noten mesatare
//    - printoTeDhenat - printon te dhenat ne ekran:
//                         id, emri, mbiemri, nota mesatare
//   Inicializimi i anetareve te klases duhet te behet permes
//   konstruktorit.

//    Pjesa-2:
//    Te krijohen dy objekte ne programin kryesor main
//    dhe te perdoren metodat e klases

//      Pjesa-3:
//      Te shtohen sjelljet/metodat ne klasen Studenti:
//      shtoNoten(nota) - qe e shton noten ne listen e notave
//      numeroNoten(nota) - qe na tregon sa here eshte paraqitur
//                          nota ne varg
//      notaMax() - qe na tregon se cila note eshte paraqitur
//                  me se shpeshti ne liste
public class Detyra_01 {
    public static void main(String[] args){
        int[] notat = {7,6,8,9,10};
        Studenti studentA = new Studenti(
                1,"Filan", "Fisteku", notat
        );
        Studenti studentB = new Studenti(
                2, "Fistek", "Filani", notat
        );
        studentA.shtoNoten(8);
        studentA.shtoNoten(9);
        System.out.println("Nota Max: " + studentA.notaMax());
        studentA.shtypDetajet();
        studentB.shtypDetajet();
    }
}

class Studenti {
//    id, emri, mbiemri, notat
    int id;
    String emri;
    String mbiemri;
    int[] notat;

    Studenti(int id, String emri, String mbiemri, int[] notat){
        this.id = id;
        this.emri = emri;
        this.mbiemri = mbiemri;
        this.notat = notat;
    }

    double notaMesatare(){
        if(this.notat.length == 0){
            return 0.0;
        }

        double shuma = 0.0;

        for(int nota : this.notat){
            shuma += nota;
        }
        return shuma / this.notat.length;
    }

    void shtypDetajet(){
//        id, emri, mbiemri, nota mesatare
        System.out.println("Id: " + this.id);
        System.out.println("Emri: " + this.emri);
        System.out.println("Mbiemri: " + this.mbiemri);
        System.out.println("Nota mesatare: " + this.notaMesatare());
    }

    void shtoNoten(int nota){
        int[] varguIRi = new int[this.notat.length + 1];
        for(int i = 0; i < this.notat.length; i++){
            varguIRi[i] = this.notat[i];
        }
        varguIRi[varguIRi.length - 1] = nota;
        this.notat = varguIRi;
    }

    int numeroNoten(int nota){
        int count = 0;
        for(int i = 0; i < this.notat.length; i++){
            if(this.notat[i] == nota)
                count++;
        }
        return count;
    }

    int notaMax(){
//
        int count5 = this.numeroNoten(5);
        int count6 = this.numeroNoten(6);
//        ...
        int count10 = this.numeroNoten(10);
//        [count5, count6, ..., count10];

        int[] notatCount = new int[6];
        for (int i = 0; i < notatCount.length; i++){
            notatCount[i] = this.numeroNoten(i + 5);
        }
        int tmpMax = notatCount[0];
        int notaMax = 5;
        for(int i = 1; i < notatCount.length; i++){
            if(notatCount[i] > tmpMax){
                tmpMax = notatCount[i];
                notaMax = i + 5;
            }
        }
        return notaMax;
    }
}
















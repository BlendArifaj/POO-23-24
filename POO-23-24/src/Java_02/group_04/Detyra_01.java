package Java_02.group_04;

//  Pjesa-1:
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

//      notaMode() - qe na tregon se cila note eshte paraqitur
//                  me se shpeshti ne liste
public class Detyra_01 {
    public static void main(String[] args){
        Studenti studentA = new Studenti(
                1, "Filan", "Fisteku", new int[]{10, 9, 5, 6}
        );
        int [] notat = {9, 8, 8, 10, 6};
        Studenti studentB = new Studenti(
                2, "Filan", "Fisteku", notat
        );
        studentA.shtoNoten(10);
        studentB.shtoNoten(8);

        System.out.println("Numero noten: " + studentA.numeroNoten(10));
        System.out.println("Numero noten: " + studentB.numeroNoten(8));

        studentA.shtypDetajet();
        studentB.shtypDetajet();
    }
}

class Studenti{
//    id, emri, mbiemri dhe notat
    int id;
    String emri;
    String mbiemri;
    int [] notat;

    Studenti(int id, String emri, String mbiemri, int[] notat) {
        this.id = id;
        this.emri = emri;
        this.mbiemri = mbiemri;
        this.notat = notat;
    }

    double notaMesatare(){
        double shuma = 0.0;
        for(int nota: this.notat){
            shuma += nota;
        }
        return shuma / this.notat.length;
    }

    void shtypDetajet(){
        System.out.printf("Id: %d \n", this.id);
        System.out.printf("Emri: %s \n", this.emri);
        System.out.println("Mbiemri: " + this.mbiemri);
        System.out.printf("Nota mesatate:  %.2f \n", this.notaMesatare());
    }

    void shtoNoten(int nota){
        int [] newNotat = new int[this.notat.length + 1];
        for(int i = 0; i < this.notat.length ; i++){
            newNotat[i] = this.notat[i];
        }
        newNotat[newNotat.length - 1] = nota;
        this.notat = newNotat;
    }

    int numeroNoten(int nota){
        int count = 0;
        for(int n : this.notat){
            if(n == nota){
                count++;
            }
        }
        return count;
    }


}














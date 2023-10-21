package Java_02.group_02;
//   Te krijohet klasa Studenti e cila ka vecorite:
//    - id, emri, mbiemri dhe notat (varg i numrave)
//   dhe sjelljet/metodat:
//    - notenMesatare - kalkulon noten mesatare
//    - printoTeDhenat - printon te dhenat ne ekran / id, emri, mbiemri, nota mesatare
//   Inicializimi i anetareve te klases duhet te behet permes konstruktorit.

//    Pjesa-2:
//    Te krijohen dy objekte ne programin kryesor main dhe te perdoren metodat e klases

//    Pjesa-3:
//    Te shtohet metoda: shtoNoten(nota) - qe e shton nje note ne listen e notave te studentit
//    Te shtohet metoda: numeroNotat(nota) - qe na tregon sa here eshte paraqitur nota ne liste
//

public class Detyra_01 {
    public static void main(String[] args){
        int[] notat = {6,7,8,9,10};
        Studenti filan = new Studenti(1, "Filan", "Fisteku", notat);
        filan.shtoNoten(9);
        System.out.println("Nota per studentin e pare: " + filan.notaMax());
//        filan.numeroNotat(10);

        Studenti studentB = new Studenti(2, "Student", "B", new int[]{7,8,9,9,9,10});

        filan.printoTeDhenat();
        studentB.printoTeDhenat();

    }
}

class Studenti {
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

    void printoTeDhenat(){
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
        varguIRi[this.notat.length] = nota;
        //varguIRi[varguIRi.length - 1] = nota;
        this.notat = varguIRi;
    }

    int numroNotat(int nota){
        int count = 0;
        for(int n : this.notat){
            if(n == nota){
                count++;
            }
        }
        return count;
    }

    int notaMax(){
//        [6, 7 ,8 ,9 ,10, 9] => 9
//        [6, 7 ,8 ,9 ,10, 6] => 6
        int[] tmp = new int[6]; // [2 0, 0, 0, 0, 0]
        for(int n : this.notat){
            tmp[n - 5]++;
        }

        int max = tmp[0];
        int notaEParaqiturMeShume = 5;
        for(int i = 0; i < tmp.length; i++){
            if(tmp[i] > max){
                max = tmp[i];
                notaEParaqiturMeShume = i + 5;
            }

        }
        return notaEParaqiturMeShume;
    }

}




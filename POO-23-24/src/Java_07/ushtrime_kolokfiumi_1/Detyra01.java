package Java_07.ushtrime_kolokfiumi_1;

import java.util.ArrayList;

public class Detyra01 {
    public static void main(String[] args){
        Provimi provimi1 = new ProvimPerfunduar("Lenda 1", 3, 90);
        ProvimPaPerfunduar provimi2 = new ProvimPaPerfunduar("Lenda 2", 4, 5);
        ProvimPerfunduar provimi3 = new ProvimPerfunduar("Lenda 3", 1, 80);
        Provimi provimi4 = new ProvimPaPerfunduar("Lenda 4", 3, 2);
        Provimi provimi5 = new ProvimPerfunduar("Lenda 5", 2, 45);

        Studenti studenti = Studenti.getInstance(1, "Filan Fisteku");

        studenti.shtoProvim(provimi1);
        studenti.shtoProvim(provimi2);
        studenti.shtoProvim(provimi3);
        studenti.shtoProvim(provimi4);
        studenti.shtoProvim(provimi5);

        studenti.shtypDetajet();
    }
}

class Provimi{
    private String lenda;
    private int semestri;
    public Provimi(String lenda, int semestri){
        this.lenda = lenda;
        this.semestri = semestri;
    }
    public String getLenda(){
        return this.lenda;
    }
    public int getSemestri(){
        return this.semestri;
    }

    public void shtypDetajet(){
        System.out.println("Lenda: " + this.lenda);
        System.out.println("Semestri: " + this.semestri);
    }
}

class ProvimPerfunduar extends Provimi{
    private int piket;

    public ProvimPerfunduar(String lenda, int semestri, int piket){
        super(lenda, semestri);
        this.piket = piket;
    }

    public int getNota(){
        return LlogariteNoten.getNota(this.piket);
    }

    public boolean kaluar(){
        return this.getNota() > 5;
    }

    public void setPiket(int piket){
        this.piket = piket;
    }

    public int getPiket(){
        return this.piket;
    }

    @Override
    public void shtypDetajet(){
        super.shtypDetajet();
        System.out.println("Piket: " + this.piket);
        System.out.println("Nota: " + this.getNota());
    }
}

class ProvimPaPerfunduar extends Provimi{
    private int numriParaqitjeve;

    public ProvimPaPerfunduar(String lenda, int semestri, int numriParaqitjeve){
        super(lenda, semestri);
        this.numriParaqitjeve = numriParaqitjeve;
    }
    public void setNumriParaqitjeve(int numriParaqitjeve){
        this.numriParaqitjeve = numriParaqitjeve;
    }
    public int getNumriParaqitjeve(){
        return this.numriParaqitjeve;
    }
    @Override
    public void shtypDetajet(){
        super.shtypDetajet();
        System.out.println("Numri i paraqitjeve: " + this.numriParaqitjeve);
    }
}

class Studenti {
    private int id;
    private String emri;
    private ArrayList<Provimi> provimet;

    private Studenti(int id, String emri){
        this.id = id;
        this.emri = emri;
        this.provimet = new ArrayList<Provimi>();
    }

    public static Studenti getInstance(int id, String emri){
        return new Studenti(id, emri);
    }

    public void shtoProvim(Provimi provimi){
        this.provimet.add(provimi);
    }

    public void provimetEArdhshme(){
        for(int i = 0; i < this.provimet.size(); i++){
            if(this.provimet.get(i) instanceof ProvimPaPerfunduar){
                System.out.println("Provimi: " + this.provimet.get(i).getLenda());
            }
        }
    }

    public double notaMesatare(){
        int count = 0;
        double sum = 0.0;
        for(int i = 0; i < this.provimet.size(); i++){
            if(this.provimet.get(i) instanceof ProvimPerfunduar){
                ProvimPerfunduar provimi = (ProvimPerfunduar) this.provimet.get(i);
                if(provimi.kaluar()){
                    count++;
                    sum += provimi.getNota();
                }

            }
        }

        return sum / count;
    }

    public void shtypDetajet(){
        System.out.println("Id: " + this.id);
        System.out.println("Emri: " + this.emri);
        System.out.println("Nota mesatare: " + this.notaMesatare());
        for(Provimi provimi : this.provimet){
            provimi.shtypDetajet();
            System.out.println("------------------");
        }
        System.out.println("Provimet e ardhshme: ");
        this.provimetEArdhshme();
    }
}


class LlogariteNoten{
    public static int getNota(int piket){
        if(piket < 50){
            return 5;
        }
        if(piket < 60){
            return 6;
        }
        if(piket < 70){
            return 7;
        }
        if(piket < 80){
            return 8;
        }
        if(piket < 90){
            return 9;
        }
        return 10;
    }
    private LlogariteNoten(){

    }
}

package Java_10.group_03;

public class KlasaAbstrakte {
    public static void main(String[] args){
        Stafi stafi1 = new Profesor(1, "Profesor 1", "Prof.");
        StafiAkademik stafi2 = new Profesor(2, "Profesor 2", "Prof. Dr.");
        Profesor stafi3 = new Profesor(3, "Profesor 3", "Prof. Assoc.");

        System.out.println("staf1 instanceof Stafi: " + (stafi1 instanceof Stafi));
        System.out.println("staf1 instanceof StafiAkademik: " + (stafi1 instanceof StafiAkademik));
        System.out.println("staf1 instanceof Profesor: " + (stafi1 instanceof Profesor));

        stafi1.shtypDetajet();
    }
}

abstract class Stafi {
    private int id;
    private String emri;

    public Stafi(int id, String emri){
        this.id = id;
        this.emri = emri;
    }

    abstract void shtypDetajet();

    void shtypNumrin(){
        System.out.println("5");
    }
}

abstract class StafiAkademik extends Stafi {
    private String titulli;
    public StafiAkademik(int id, String emri, String titulli){
        super(id, emri);
        this.titulli = titulli;
    }
//
//    void shtypDetajet(){
//
//    }
}

class Profesor extends StafiAkademik{
    public Profesor(int id, String emri, String titulli){
        super(id, emri, titulli);
    }

    @Override
    void shtypDetajet(){

    }

}




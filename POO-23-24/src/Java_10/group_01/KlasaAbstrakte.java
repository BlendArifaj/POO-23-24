package Java_10.group_01;

public class KlasaAbstrakte {
    public static void main(String[] args){
        Stafi instance1 = new Profesor(1, "Profesor1", "Dr.");
        StafiAkademik instance2 = new Profesor(2, "Profesor2", "Prof. Dr.");
        Profesor instance3 = new Profesor(3, "Profesor3", "Prof.");

        System.out.println("Instance3 instanceof Stafi: " + (instance3 instanceof Stafi));
        System.out.println("Instance3 instanceof Stafi: " + (instance3 instanceof StafiAkademik));
        System.out.println("Instance3 instanceof Stafi: " + (instance3 instanceof Profesor));

    }
}


abstract class Stafi{
    private int id;
    private String emri;

    public Stafi(int id, String emri){
        this.id = id;
        this.emri = emri;
    }
    abstract void orariPunes();

    void shtypDetajet(){
        System.out.println("Klasa abstrakte Stafi!");
    }
}

abstract class StafiAkademik extends Stafi{
    private String titulli;

    public StafiAkademik(int id, String emri, String titulli){
        super(id, emri);
        this.titulli = titulli;
    }
}

class Profesor extends StafiAkademik{

    public Profesor(int id, String emri, String titulli){
        super(id, emri, titulli);
    }

    @Override
    void orariPunes() {
        System.out.println("Fleksibil!");
    }
}


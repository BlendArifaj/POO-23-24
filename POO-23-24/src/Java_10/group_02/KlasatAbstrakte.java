package Java_10.group_02;

public class KlasatAbstrakte {
    public static void main(String[] args){
        Stafi stafi1 = new Profesori(1, "Profesor 1", "Prof.");
        StafiAkademik stafi2 = new Profesori(2, "Profesor 2", "Dr.");
        Profesori stafi3 = new Profesori(3, "Profesor 3", "Prof. Ass.");

        System.out.println("stafi1 instanceof StafiAkademik: " + (stafi1 instanceof StafiAkademik));
        System.out.println("stafi1 instanceof Stafi: " + (stafi1 instanceof Stafi));
        System.out.println("stafi1 instanceof Profesori: " + (stafi1 instanceof Profesori));

    }
}
// Salla
//                         Item
//      PE,                              PjE
// Loptop, Monitor, WiFi            Banka, Karrika,

abstract class Stafi{
    private int id;
    private String emri;

    public Stafi(int id, String emri){
        this.id = id;
        this.emri = emri;
    }

    abstract void shtypDetajet();

    int getNumri(){
        return 1;
    }
}

abstract class StafiAkademik extends Stafi{
    private String titulli;

    public StafiAkademik(int id, String emri, String titulli){
        super(id, emri);
        this.titulli = titulli;
    }


    abstract String lenda();
}

//                  Stafi
//         StafiAkademik
//   Profesori
class Profesori extends StafiAkademik{


    public Profesori(int id, String emri, String titulli){
        super(id, emri, titulli);
    }

    @Override
    void shtypDetajet(){
        System.out.println("Profesori");
    }

    @Override
    String lenda(){
        return "Lenda 1";
    }

}










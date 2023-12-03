package Java_06.group_01;

public class Trashegimia {
    public static void main(String [] args){
//        Studenti studenti = new Studenti();
//        studenti.getPiket();
//        studenti.getPiket(10);
    }
}

class Person{
    private int uid; // => uid
    protected String emri;
    String mbiemri = "Test";

    protected Person(int uid, String emri, String mbiemri){
        this.uid = uid;
        this.emri = emri;
        this.mbiemri = mbiemri;
    }

    public int getPiket(){
        return 0;
    }
}
// super
class Studenti extends Person{
    String mbiemri = "Test2";
    double notaMesatare;
    public Studenti(int uid, String emri, String mbiemri, double notaMesatare){
        super(uid, emri, mbiemri);
        this.notaMesatare = notaMesatare;
    }

    public int getPiket(int notaMesatare){
        return 10;
    }

    @Override
    public int getPiket(){
        return super.getPiket() + 10;
    }

}
class StafiAkademik{

    // ...
}

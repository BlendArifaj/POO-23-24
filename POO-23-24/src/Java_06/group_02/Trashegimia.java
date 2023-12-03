package Java_06.group_02;

public class Trashegimia {
}

// Protected
class Person extends Object{
    private int id;
    protected String emri;
    String mbiemri;
//    ....
    public Person(int id, String emri, String mbiemri){
        this.id = id;
        this.emri = emri;
        this.mbiemri = mbiemri;
    }
    public int calculateScore(){
        return 0;
    }
}
class Studenti extends Person {
    double notaMesatare;

    public Studenti(int id, String emri, String mbiemri, double notaMesatare){
        super(id, emri, mbiemri);
        this.notaMesatare = notaMesatare;
//         ...
    }

    @Override
    public int calculateScore(){
        return 10;
    }

    public int calculateScore(int numri){ // 10
        return numri + calculateScore(); // 20
//        return numri + super.calculateScore(); // 10
    }
}



//class Employee extends Person{
//
//}

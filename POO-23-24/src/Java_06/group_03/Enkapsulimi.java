package Java_06.group_03;

// Modifikatoret e qasjes:
// private
// protected
// public
// default

// getters & setters

public class Enkapsulimi {
    public static void main(String[] args){
//        Studenti studenti = new Studenti(1, "Student");
        Studenti studenti = Studenti.getInstance(1, "Student");
        studenti.setEmri("Filan");
        System.out.println("Id: " + studenti.getId());
        System.out.println("Emri: " + studenti.getEmri());

//        StaticClass st = new StaticClass();
//        StaticClass.ID
//        Math math = new Math();

    }
}

class StaticClass {
    static int ID = 5;

    private StaticClass(){

    }
}

class Studenti {
    private int id;
    private String emri;

    private Studenti(int id, String emri){
        this.id = id;
        this.emri = emri;
    }

    public static Studenti getInstance(int id, String emri){
        if(id == 0){
            return null;
        }
        return new Studenti(id, emri);
    }

    public void setEmri(String emri){
        this.emri = emri;
    }

    public int getId(){
        return this.id;
    }
    public String getEmri(){
        return this.emri;
    }
}


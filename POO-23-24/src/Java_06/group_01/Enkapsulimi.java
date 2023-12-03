package Java_06.group_01;

// Modifikatoret e qasjes:
// - private
// - protected
// - public
// - default
public class Enkapsulimi {
    public static void main(String[] args){
        Student student1 = Student.getInstance(1, "Test", "Test"); // new Student();
        student1.emri = "Filan";
        student1.getId();

//        StaticClass instance1 = new StaticClass();
//        StaticClass.NUM;
    }
}

class StaticClass {
    static int NUM = 5;

    private StaticClass(){

    }
}

class Student {
    private int id;
    protected String emri;
    public String mbiemri;
    // ...
    private Student(int id, String emri, String mbiemri){
        this.id = id;
        this.emri = emri;
        this.mbiemri = mbiemri;
    }

    static Student getInstance(int id, String emri, String mbiemri){
        if(id == 0){
            return null;
        }

        return new Student(id, emri, mbiemri);
    }

    public int getId(){
        return this.id;
    }

    // ...
    public void aplikoPerBurse(){

    }
}
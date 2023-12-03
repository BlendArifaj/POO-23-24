package Java_06.group_03;

public class Trashegimia {
    public static void main(String[] args){
        Person person1 = new Person("Filan", "Fisteku");
        person1 = new Student(1, "Filan", "Fisteku");
        person1 = new StudentVititPare(1, "Filan", "Fisteku");

        Student student1 = new Student(2, "Filan", "Fisteku");
//        student1 = new Person("Filan", "Fisteku");
    }
}

class Person{
    protected String emri;
    String mbiemri;
    protected Person(String emri, String mbiemri){
        this.emri = emri;
        this.mbiemri = mbiemri;
    }
    public void shtypDetajet(){
        System.out.println("Detajet e klases Person!");
    }
//    ...
}

class Student extends Person {

    private int id;

    public Student(int id, String emri, String mbiemri){
        super(emri, mbiemri);
        this.id = id;
    }
    public void setEmri(String emri){
        this.emri = emri;
    }

    public void test(){
        super.shtypDetajet();
        shtypDetajet();
        shtypDetajet(5);
    }

    @Override
    public void shtypDetajet(){
        System.out.println("Detajet e klases Student");
    }


    public void shtypDetajet(int numri){
        System.out.println("Detajet e klases Student, numri: " + numri);
    }


}

class StudentVititPare extends Student{

    public StudentVititPare(int id, String emri, String mbiemri) {
        super(id, emri, mbiemri);
    }
}
//class StudentVititDyte extends Student, Person {
//
//}
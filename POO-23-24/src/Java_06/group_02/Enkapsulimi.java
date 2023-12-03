package Java_06.group_02;

// Modifikatoret e qasjes:
// - private
// - protected
// - public
// - default
public class Enkapsulimi {
    public static void main(String[] args){
//        Student studenti = new Student(1);
        Student studenti = Student.getInstance(1);
        studenti.getId();
//        studenti.id = 5;
        StaticClass.shtypDetajet();

    }
}

class StaticClass{
    static void shtypDetajet(){

    }
    private StaticClass(){}
}

class Student{
    private int id;
    public String emri;
    private Student(int id){
        this.id = id;
    }
//    ...

    public static Student getInstance(int id){
        if(id < 0){
            return null;
        }
        return new Student(5);
    }

    public int getId(){
        return this.id;
    }

}

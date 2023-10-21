package Java_02.group_02;

public class KlasatDheObjektet {
    public static void main(String[] args){
        Student studentA = new Student(1, "Filan");
        studentA.printoTeDhenat();

        Student studentB = new Student(2, "Filan");
        studentB.printoTeDhenat();
    }
}

class Student{
//    vecorite dhe sjelljet
//    variable dhe metoda
    int id;
    String emri;

    Student(int id, String emri){
//        mos te kete logjike
//        te caktohen vlerat e anetareve te klases
        this.id = id;
        this.emri = emri;
    }

    void printoTeDhenat(){
        System.out.println("Id: " + this.id);
        System.out.println("Emri: " + this.emri);
    }
    String getEmri(){
        return this.emri;
    }
}

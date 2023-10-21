package Java_02.group_03;

public class KlasatDheObjektet {
    public static void main(String[] arguments){
        Student studentA = new Student(1, "Filan");
        studentA.printoTeDhenat();

        Student studentB = new Student(2, "Filan");
    }
}

class Student {
//    vecorite dhe sjellje
//    variabla dhe metoda
    int id;
    String emri;

    Student(int id, String emri){
       this.id = id;
       this.emri = emri;
    }

    void printoTeDhenat(){
//        logic ...
        System.out.println("Id: " + this.id);
        System.out.println("Emri: " + this.emri);
    }

    String getEmri(){
        return this.emri;
    }
}
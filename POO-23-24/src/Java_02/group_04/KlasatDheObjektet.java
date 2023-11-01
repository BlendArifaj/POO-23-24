package Java_02.group_04;

public class KlasatDheObjektet {
    public static void main(String[] args){
        int numri = 5;
        Student studentA = new Student(5, "Filan");
        Student studentB = new Student(6, "Fisteku");

        studentA.shtypTeDhenat();
        studentB.shtypTeDhenat();


    }
}

class Student {
//    vecorite dhe sjelljet e klases
//    variablat dhe metodat e klases
    int id;
    String emri;

    Student(int id, String emri){
//      id = 5;
//      emri = "Test";
//      System.out.println("Test");
        this.id = id;
        this.emri = emri;
    }

    void shtypTeDhenat(){
        System.out.println("Id: " + this.id);
        System.out.println("Emri: " + this.emri);
    }
    String getEmri(){
//        logic ...
        return this.emri;
    }

}

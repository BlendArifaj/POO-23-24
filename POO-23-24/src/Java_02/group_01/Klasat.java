package Java_02.group_01;

public class Klasat {
    public static void main(String[] args){
//        studentA - instance/objekt e/i klases
       Studenti studentA = new Studenti(
               "student-a-id", "Student A"
       );
       studentA.printoTeDhenat();

       Studenti studentB = new Studenti(
               "id", "student"
       );
       studentB.printoTeDhenat();
       studentB.id = "student-b-id";
       studentB.emri = "Student B";
       studentB.printoTeDhenat();

    }
}

class Studenti {
//    Anetaret e klases:
//    variablat dhe metodat (vecorite dhe sjelljet)
    String id;
    String emri;

    Studenti(String id, String emri){
        this.id = id;
        this.emri = emri;
    }

    String getEmri(){
        return emri;
    }

    void printoTeDhenat(){
//        System.out.printf("Id: %s, %d", id);
        System.out.println("Id: " + id);
        System.out.println("Emri: " + emri);
    }
}
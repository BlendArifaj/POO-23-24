package Java_06.group_03;

//                  Person
//          Student         StafAkademik
//  StudentVitit1               Profesor

public class Polimorfizmi {
    public static void main(String[] args){
        ClassA objA = new ClassA();
        System.out.println("Id: " + objA.id);

        objA = new ClassB();
        objA.shtypDetajet();
        System.out.println("Id: " + objA.id);

    }
}

class ClassA{
    public int id = 5;
    public void shtypDetajet(){
        System.out.println("ClassA!");
    }

    public void shtypDetajet(int numri){
        System.out.println("ClassA!");
    }
}

class ClassB extends ClassA{
    public int id = 6;
    public void shtypDetajet(){
        this.id = 6;
        System.out.println("ClassB!");
    }
}
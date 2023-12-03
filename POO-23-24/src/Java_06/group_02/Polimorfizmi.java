package Java_06.group_02;

//          A
//       B      C
//                 D
public class Polimorfizmi {
    public static void main(String[] args){
        ClassA classA = new ClassA();
        classA.shtypDetajet();
        System.out.println("Numri: " + classA.numri);
        classA = new ClassB();
        classA.shtypDetajet();
        System.out.println("Numri: " + classA.numri);

        classA.shtypDetajet();

        classA = new ClassD();
        classA.shtypDetajet();


        ClassB classB = new ClassB();
//        classB = new ClassA();
//        classB = new ClassC();
    }
}

class ClassA{
    int numri = 5;
    public void shtypDetajet(){
        System.out.println("Class A");
    }
}

class ClassB extends ClassA{
    int numri = 6;
    public void shtypDetajet(){
        System.out.println("Class B");
    }
}

class ClassC extends ClassA{
    int numri = 7;
    public void shtypDetajet(){
        System.out.println("Class C");
    }
}

class ClassD extends ClassC{
    int numri = 8;
    public void shtypDetajet(){
        System.out.println("Class D");
    }
}

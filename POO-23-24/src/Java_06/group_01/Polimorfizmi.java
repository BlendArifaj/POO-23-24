package Java_06.group_01;

public class Polimorfizmi {
    public static void main(String[] args){
//        A -> B -> C
        ClassA instanceA = new ClassA();
        instanceA = new ClassB();
        instanceA = new ClassC();

        ClassB instanceB = new ClassB();
        instanceB = new ClassC();
//        instanceB = new ClassA();

    }
}


class ClassA{
    int numri = 5;

    public void shtypDetajet(){
        System.out.println("ClassA");
    }
}
class ClassB extends ClassA{
    int numri = 6;
    public void shtypDetajet(){
        System.out.println("ClassB");
    }
}
class ClassC extends ClassB{
    int numri = 7;
    public void shtypDetajet(){
        System.out.println("ClassC");
    }
}

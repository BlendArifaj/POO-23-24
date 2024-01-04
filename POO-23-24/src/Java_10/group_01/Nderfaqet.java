package Java_10.group_01;

public class Nderfaqet {
    public static void main(String[] args){
        Class1 instance1 = new Class1();
        Interface1 instance2 = new Class1();
        Class1 instance3 = new Class2();

        System.out.println("Instace1 instanceof Interface1: " + (instance1 instanceof Interface1));
        System.out.println("Instace1 instanceof Interface2: " + (instance1 instanceof Interface2));

        boolean can1 = ((Access) instance3).can();

        if(instance3 instanceof Access){
            boolean can = ((Access) instance3).can();
            if(can){
//                do something...
            }
        }

    }
}

interface Access{
    boolean can();
}

interface Interface1{
    int numri = 10;
    void method1(int param1, String param2);
    String method2();
    int method3();
}

interface Interface2{}


class Class1 implements Interface1, Interface2{

    @Override
    public void method1(int param1, String param2) {

    }

    @Override
    public String method2() {
        return null;
    }

    @Override
    public int method3() {
        return this.numri;
    }


}

class Class2 extends Class1{

}

class Class3 extends Class1 implements Access{
    @Override
    public boolean can() {
        return true;
    }
}

class Class4 implements Cloneable, Comparable<Class4>{

    @Override
    public int compareTo(Class4 instance){
        return 1;
    }

    @Override
    public Class4 clone() throws CloneNotSupportedException {
        return new Class4();
    }
}

interface DynamicInterface<T>{
    void shtypDetajet(T object);
}

class ClassA implements DynamicInterface<Class4>{
    public void shtypDetajet(Class4 object){

    }
}
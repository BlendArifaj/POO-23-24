package Java_10.group_02;

public class Nderfaqet {
    public static void main(String[] args){
        Interface1 instance1 = new Class1();
        Interface2 interface2 = new Class1();

        System.out.println("instance1 instanceof Interface1: " + (instance1 instanceof Interface1));
        System.out.println("instance1 instanceof Interface2: " + (instance1 instanceof Interface2));
        System.out.println("instance1 instanceof Class1: " + (instance1 instanceof Class1));

    }
}

interface Interface2{

}

interface Interface1{
    int numri = 5;
    void shtypDetajet();
}

class Class1 implements Interface1, Interface2{

    @Override
    public void shtypDetajet(){
        int test = this.numri;
    }
}

class Class2 implements Cloneable, Comparable<Class2>{

    public Class2 clone(){
        try{
            return (Class2) super.clone();
        }catch (CloneNotSupportedException e){
            return null;
        }
//        return (Class2) super.clone();
    }

    public int compareTo(Class2 instance){
//        return this.notaMesatare - instance.notaMesatare;
        return 0;
    }
}


interface DynamicInterface<T>{
    int compareToV1(T instance);
    int compareToV2(String instance);
}

class Class3 implements DynamicInterface<Class1>{

    @Override
    public int compareToV1(Class1 instance) {
        return 0;
    }

    @Override
    public int compareToV2(String instance) {
        return 0;
    }
}

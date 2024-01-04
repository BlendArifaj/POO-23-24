package Java_10.group_03;

public class Nderfaqet {
    public static void main(String[] args){
        Interface1 var1 = new Class1();
        Interface2 var2 = new Class1();

        if(var1 instanceof Interface2){

        }
        test(var1);
    }

    public static void test(Interface1 obj){
        obj.shtypDetajet();
    }
}

interface Interface1{
    // Vlera konstante
    int NUMRI = 5;
    void shtypDetajet();
}

interface Interface2{

}

class Class1 implements Interface1, Interface2{
    public void shtypDetajet(){
        System.out.println(Interface1.NUMRI);
        System.out.println(this.NUMRI);
    }
}

// Cloneable, Comperable
class Class2 implements Cloneable, Comparable<Class2>{

    public int compareTo(Class2 instanceToCompare){
        return 0;
    }

    @Override
    public Class2 clone(){
        return new Class2();
    }

}

interface DynamicInterface<T>{
    void shtypDetajet(T o);
}

class Class3 implements DynamicInterface<Class3>{

    public void shtypDetajet(Class3 instance){

    }
}
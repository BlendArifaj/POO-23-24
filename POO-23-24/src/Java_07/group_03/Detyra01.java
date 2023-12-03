package Java_07.group_03;

import java.util.ArrayList;

public class Detyra01 {
    public static void main(String[] args){
        ArrayList<String> listaEmrave = new ArrayList<>();
//        shto anetare ne list
        listaEmrave.add("Emri 1");
        listaEmrave.add(1, "Emri 2");
        listaEmrave.addFirst("Emri 3");
        listaEmrave.addLast("Emri 4");
//        largo anetare nga lista
        listaEmrave.remove(0);
        listaEmrave.remove("Emri 4");
//        lexo anetare nga lista
        listaEmrave.get(0); // listaEmrave[0]
        listaEmrave.getFirst();
        listaEmrave.getLast();
//
        listaEmrave.size();
        for(int i = 0; i< listaEmrave.size(); i++){
            System.out.println(listaEmrave.get(i));
        }
        listaEmrave.indexOf("Emri 3");

//        ClassA[] arrayA = new ClassA[2];
//        arrayA[0] = new ClassA();
//        arrayA[1] = new ClassB();
//
        ArrayList<ClassA> listA = new ArrayList<>();
        listA.add(new ClassA());
        listA.add(new ClassB());
        for(int i = 0; i < listA.size(); i++){
            if(listA.get(i) instanceof ClassB){
                ClassB element = (ClassB) listA.get(i);
                System.out.println("ClassB Instance");
            }
        }

        ArrayList<ClassB> listB = new ArrayList<>();
//        listB.add(new ClassA());
        listB.add(new ClassB());
    }
}

class ClassA{

}
class ClassB extends ClassA{

}













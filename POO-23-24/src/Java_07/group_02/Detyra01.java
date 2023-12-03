package Java_07.group_02;

import java.util.ArrayList;

public class Detyra01 {
    public static void main(String[] a){
        ArrayList<String> emrat = new ArrayList<>();
        emrat.add("Emri 1");
        emrat.add(1, "Emri 2");
        emrat.addLast("Emri 3");
        emrat.addFirst("Emri 4");

        emrat.remove("Emri 4");
        emrat.remove(0);

        emrat.get(0);

        emrat.size();
        for(int i = 0; i < emrat.size(); i++){
//            emrat.indexOf("Emri 4");
            System.out.println(emrat.get(i));
        }

        ArrayList<ClassA> listA = new ArrayList<>();
        listA.add(new ClassA());
        listA.add(new ClassB());
        for(int i = 0; i < listA.size(); i++){
            if(listA.get(i) instanceof ClassB){

            }
        }

        ArrayList<ClassB> listB = new ArrayList<>();
//        listB.add(new ClassA());
        listB.add(new ClassB());

        ArrayList<Provimi> provimet = new ArrayList<>();
        provimet.add(new ProvimPaPerfunduar());
        provimet.add(new ProvimPerfunduar());
        for(int i = 0; i < provimet.size(); i++){
            if(provimet.get(i) instanceof ProvimPaPerfunduar){
                    //
            }
            if(provimet.get(i) instanceof ProvimPerfunduar){

            }
        }

    }
}

class ClassA{

}
class ClassB extends ClassA{

}

class Provimi {
    int semestri;
    String lenda;
}

class ProvimPerfunduar extends Provimi{
    int piket;
}

class ProvimPaPerfunduar extends Provimi{
    int numriParaqitjeve;
}
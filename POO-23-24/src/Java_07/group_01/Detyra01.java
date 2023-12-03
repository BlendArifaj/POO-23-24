package Java_07.group_01;

import java.util.ArrayList;


public class Detyra01 {
    public static void main(String[] args){
        ArrayList<Provimi> provimet = new ArrayList<>();
        provimet.add(new ProvimPerfunduar());
        provimet.add(new ProvimPerfunduar());
        provimet.add(new ProvimPaPerfunduar());
        provimet.add(new ProvimPaPerfunduar());

        for(int i =0; i<provimet.size(); i++){
            if(provimet.get(i) instanceof ProvimPerfunduar){
                System.out.println("Provim i perfunduar");
            }
        }

    }
}
class Studenti{
    ArrayList<Provimi> provimet;
}


class Provimi{
    String lenda;
    String semestri;
}
class ProvimPerfunduar extends Provimi{
    int piket;
}
class ProvimPaPerfunduar extends Provimi{
    int numriParaqitjeve;
}

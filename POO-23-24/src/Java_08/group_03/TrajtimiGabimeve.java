package Java_08.group_03;

import java.io.IOException;
import java.util.Scanner;

public class TrajtimiGabimeve {
    public static void main(String[] args){

        try{
            profesori();
        }catch (NotaException ne){
            System.out.println(ne.getMessage());
        }

        System.out.println("Perfundoj programi!");
    }

    public static void profesori() throws NotaException{
        vendosNoten(4);
    }

    public static int vendosNoten(int nota) throws NotaException{
        if(nota < 5 || nota > 10){
            throw new NotaException(nota);
        }
        return nota;
    }
}

package Java_08.group_01;

import java.io.File;
import java.io.IOException;

public class TrajtimiGabimeve {
    public static void main(String[] args) throws Exception {
        int numri1 = 100;
        int numri2 = 0;

        try{
            if(numri2 == 0){
                throw new NullPointerException("Ka ndodh nje gabim!");
            }
            System.out.println("Heresi ne mes te numrave: 100 / 0 = " + (100 / 0));
        }
        catch (NullPointerException e){
            e.printStackTrace();
            String message = e.getMessage();

            System.out.println("Ka ndodhur nje gabim!");
        }finally {
            System.out.println("Finally executed!");
        }
//        catch (IOException ioe){
//
//        }


        try{
            vendoseNote(4);
        }catch (NotaException ne){
            System.out.println("Eshte kapur nje gabim i tipit: NotaException");
        }



        System.out.println("Programi perfundoj ekzekutimin!");
    }


    public static int vendoseNote(int nota) throws NotaException {
        if(nota < 5 || nota > 10){
            throw new NotaException(nota);
        }
        return nota;
    }

}

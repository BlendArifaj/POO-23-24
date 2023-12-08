package Java_08.group_02;

import java.io.IOException;

public class TrajtimiGabimeve {
    public static void main(String[] args) throws Exception{
//        int[] numrat = new int[]{1, 2, 3, 4};
//        try{
//            throw new Exception("Gabim i shkaktuar nga perdoruesi! Nota nuk eshte ne rregull!");
//        }
//        catch (Exception ae){
//            ae.printStackTrace();
//            System.out.println(ae.getMessage());
//        }finally {
//            System.out.println("Finally executed!");
//        }

//        catch (IndexOutOfBoundsException iofe){
//            System.out.println("IndexOutOfBoundsException happened!");
//        }

        // ... catch(){}
        profesori();
        System.out.println("Perfundoj programi!");
    }

    public static void profesori() throws Exception{
        vendosNoten(4);
    }

    public static int vendosNoten(int nota) throws NotaException {
        if(nota < 5 || nota > 10){
            throw new NotaException(nota);
        }
        return nota;
    }
}

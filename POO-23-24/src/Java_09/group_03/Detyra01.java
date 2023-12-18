package Java_09.group_03;

import java.io.FileWriter;
import java.io.IOException;

/*
Te krijohet klasa NotaException (Gabim i personalizuar) ashtu qe kur te shkaktohet ky gabim - permbajtja e
gabimit te ruhet ne fajllin 'nota_exception_logs.txt'.

Ne programin main - te perdoret klasa NotaException
 */
public class Detyra01 {
    public static void main(String[] args){
        try{

            throw new NotaException("Nota nuk eshte valide!");
        }catch (NotaException ne){

        }
    }
}

class NotaException extends Exception{
    private final String FILE_NAME = "nota_exception_logs.txt";

    public NotaException(String message){
        super(message);
        this.ruajGabiminNeFajll();
    }

    private void ruajGabiminNeFajll(){
        try{
            FileWriter fw = new FileWriter(FILE_NAME, true);
            fw.write(this.getMessage() + "\n");
            fw.close();
        }catch (IOException ioe){
            System.out.println("Deshtoj ruajtja!");
        }
    }
}
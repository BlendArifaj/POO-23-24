package Java_08.group_02;

public class NotaException extends Exception{
    public NotaException(int nota){
        super("Nota nuk eshte valide: " + nota);
        this.ruajNeFile();
    }

    private void ruajNeFile(){
        System.out.println("Gabimi u ruajt ne file!");
    }
}

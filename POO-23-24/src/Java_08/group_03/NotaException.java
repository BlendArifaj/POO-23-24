package Java_08.group_03;

public class NotaException extends Exception {
    public NotaException(int nota){
        super("Nota nuk eshte valide: " + nota);
        this.ruajNeFajll();
    }

    private void ruajNeFajll(){
//        ....
    }
}

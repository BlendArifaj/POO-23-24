package Java_08.group_01;

public class NotaException extends Exception {
    public NotaException(int nota){
        super("Nota nuk eshte valide: " + nota);
        ruajGabiminNeFajll();
    }

    private void ruajGabiminNeFajll(){
        this.getStackTrace();
        this.printStackTrace();
//        ruan gabimin ne fajll
    }
}

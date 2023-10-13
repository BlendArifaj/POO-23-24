package Java_01.group_03;

public class Detyra_01 {
    void ruaj(){
        if(1 == 1){
            return;
        }
//        logic
    }

    static int llogaritNoten(int piket){
        if(1 ==1){
            return 5;
        }

        return 10;
    }
    public static void main(String[] args){
//        Cout << "Hello World!";
        System.out.print("Hello World!");

//        int, double, float, boolean, char
//        String
        int numri = 10;
        numri = 12;
        double nota;
        boolean isCorrect = true; // false
        char c = 'a';
        String emri = "Filan";

        int [] vargu = new int[5];
        vargu[0] = 5;
        vargu[1] = 1;

        System.out.println("Vargu: " + vargu);

        int [][] matrix = new int[5][5];
        matrix[0][0] = 5;
        matrix[0][1] = 4;

//      for, while, do-while, switch, foreach
        for(int i = 0; i < 10 ; i++){
            System.out.print(" " + i);
        }

        while(true){
            break;
        }
        do{
            break;
        }while(true);

        for(int anetari : vargu){

        }

        switch (numri){
            case 1:
//                logic
                break;
            case 2:
//                logic
                break;
            default:
//                logic
        }

//        if, if-else, else
//        if(kushti){
//
//        }else if(kushti2){
//
//        }else if(kushti3){
//
//        }else{
//
//        }

//        referencat dhe pointeret

        int nota2 = llogaritNoten(100);

    }

}

package Java_01.group_02;

public class Detyra_02 {
//    Eshte i deklaruar vargu me anetaret: 1, 2, 3, 4.
//    Te krijohet metoda e cila na mundeson te shtojme anetare te ri ne varg.
//    Perdorimi: shtoAnetareNeVarg(vargu, 5, 2)
//    Output: [1, 2, 5, 3, 4]

    public static void main(String[] args){
        int [] vargu = {1, 2, 3, 4};
        vargu = shtoAnetarNeVarg(vargu, 5, 2);
        for(int i = 0; i < vargu.length ; i++){
            System.out.print(" " + vargu[i]);
        }
//        1, 2, 3, 4, 5
    }

    static int[] shtoAnetarNeVarg(int[] vargu, int anetari, int index){

        int[] varguIRi = new int[vargu.length + 1];
        int j = 0;
        for(int i = 0; i < vargu.length; i++){
            if(i == index){
                varguIRi[i] = anetari;
//                j += 1;
                j++;
            }
            varguIRi[i + j] = vargu[i];
        }
        return varguIRi;
    }

    static int [] largoAnetarNgaVargu(int[] vargu, int anetari){
        int[] varguIRi = new int[vargu.length - 1];
        int j = 0;
        for(int i = 0; i < vargu.length; i++){
            if(vargu[i] == anetari){
                j -= 1;
                continue;
            }
            varguIRi[i + j] = vargu[i];
        }
        return varguIRi;
    }
}

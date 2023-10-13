package Java_01.group_03;

public class Detyra_02 {
    //    Eshte i deklaruar vargu me anetaret: 1, 2, 3, 4.
    //    Te krijohet metoda e cila na mundeson te shtojme anetare te ri ne varg.
    //    Perdorimi: shtoAnetarNeVarg(vargu, 5)
    //    Output: [1, 2, 3, 4, 5]
    public static void main(String[] args) {
        int [] vargu = {1, 2, 3, 4, 3, 3, 3};
//        vargu = shtoAnetarNeVarg(vargu, 5, 1);

        vargu = largoAnetarNgaVargu(vargu, 3);
        for(int anetar : vargu){
            System.out.print(" " + anetar);
        }
//        1, 2, 5, 3, 4
    }

    static int[] shtoAnetarNeVarg(int[] vargu, int anetari, int index){
        int [] varguIRi = new int[vargu.length + 1];
        int shift = 0;
        for(int i = 0; i < vargu.length ; i++){
            if(i == index){
                varguIRi[index] = anetari;
                shift++;
            }
            varguIRi[i + shift] = vargu[i];
        }
        return varguIRi;
    }

    static int[] largoAnetarNgaVargu(int[] vargu, int anetari){
        int newLength = 0;
        for(int i = 0; i < vargu.length; i++){
            if(vargu[i] != anetari){
                newLength++;
            }
        }
        int[] varguIRi = new int[newLength];
        int j = 0;
        for(int i = 0; i < vargu.length; i++){
            if(vargu[i] == anetari){
                j--;
                continue;
            }
            varguIRi[i + j] = vargu[i];
        }
        return varguIRi;
    }

}

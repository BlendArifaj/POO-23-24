package Java_01.group_04;

public class Detyra_02 {
    //    Eshte i deklaruar vargu me anetaret: 1, 2, 3, 4.
    //    Te krijohet metoda e cila na mundeson te shtojme anetare te ri ne varg.
    //    Perdorimi: shtoAnetarNeVarg(vargu, 5)
    //    Output: [1, 2, 3, 4, 5]
    public static void main(String[] args ){
        int[] vargu = {5 , 5, 2 , 2 ,3 ,4 ,3 ,6 ,2, 2, 2};

        vargu = largoAnetarNgaVargu(vargu, 5);
        for(int i : vargu){
            System.out.print(" " + i);
        }
    }

    static int[] shtoAnetarNeVarg(int[] vargu, int anetari, int index){
        int[] varguIRi = new int[vargu.length + 1];
        int j = 0;
        for(int i = 0; i < vargu.length ; i++){
            if(i == index){
                varguIRi[i] = anetari;
                j++;
            }
            varguIRi[i + j] = vargu[i];
        }
        return varguIRi;
    }

    static int[] largoAnetarNgaVargu(int[] vargu, int anetar){
        int count = 0;
        for(int i : vargu){
            if(i == anetar) count++;
        }

        int[] varguIRi = new int[vargu.length - count];
        int j = 0;
        for(int i = 0; i < vargu.length; i++){
            if(vargu[i] == anetar){
                j++;
                continue;
            }
            varguIRi[i-j] = vargu[i];
        }
        return varguIRi;
    }

}

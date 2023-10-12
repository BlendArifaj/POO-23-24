package Java_01;

public class Detyra_02 {
// Eshte i deklaruar vargu me anetaret [1,2,3,4]
// Te krijohet funksioni i cili e shton nje anetare te ri ne varg
// int[] vargu = {1, 2, 3, 4};
// vargu = shtoAnetareNeVarg(5);
// vargu = {1, 2, 3, 4, 5};
    public static void main(String[] args){
        int[] vargu = {1, 2, 3, 4};
        vargu = shtoAnetarNeVarg(vargu,5, 10);
        for(int numri : vargu){
            System.out.print(numri + " ");
        }
    }
    
    static int[] shtoAnetarNeVarg(int[] vargu, int anetari, int index){
        int[] varguIRi = new int[vargu.length + 1];
        int j = 0;
        for(int i = 0; i < vargu.length; i++){
            if(i == index){
                j++;
                varguIRi[index] = anetari;
            }
            varguIRi[i + j] = vargu[i];

        }
        return varguIRi;
    }
}

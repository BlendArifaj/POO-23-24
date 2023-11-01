package Java_03.group_01;

import java.util.Scanner;

// Te krijohet programi ne Java i cili i mundeson perdoruesit ne menyre
// interaktive ta kontrolloje nese nje fjale eshte polindrom
// psh: noon => Fjala eshte polindrom
// psh: test => Fjala nuk eshte polindrom
public class Detyra_01 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Miresevini ne programin e pare ne Java!");
        System.out.println("---------------");
        Polindrom polindrom = new Polindrom();
        while (true){
            System.out.print("Shtypni fjalen: ");
            String fjala = scanner.next();
            if(polindrom.isPolindrom(fjala)){
                System.out.println("Fjala e dhene eshte polindrom!");
            }else{
                System.out.println("Fjala e dhene nuk eshte polindrom!");
            }
        }
//        scanner.close();
    }
}

class Polindrom{
    boolean isPolindrom(String fjala){
//        Fjala
        String reversedFjala = this.reverseString(fjala);
        return reversedFjala.equals(fjala);
    }
    String reverseString(String text){
        char[] vargu = text.toCharArray();
        char[] returnArray = new char[vargu.length];
        for(int i = vargu.length - 1; i >= 0; i--){
            returnArray[vargu.length - 1 - i] = vargu[i];
        }
        return new String(returnArray);
    }
}

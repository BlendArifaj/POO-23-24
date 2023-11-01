package Java_03.group_02;

// Te krijohet programi ne Java i cili i mundeson perdoruesit ne menyre
// interaktive ta kontrolloje nese nje fjale eshte polindrom
// psh: noon => Fjala eshte polindrom
// psh: test => Fjala nuk eshte polindrom

import java.util.Scanner;

public class Detyra_01 {
    public static void main(String[] args){
        Polindrom polindrom = new Polindrom();
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.print("Shtyp fjalen: ");
            String fjala = scanner.next();
            if(fjala.equals("exit")) {
                break;
            }
            if(polindrom.checkPolindrom(fjala)){
                System.out.println("Fjala eshte polindrom!");
            }else{
                System.out.println("Fjala nuk eshte polindrom!");
            }
        }

        scanner.close();
    }
}

class Polindrom{

    boolean checkPolindrom(String fjala){
        int j = fjala.length() - 1;
        for(int i = 0; i < fjala.length() / 2; i++){
            if(fjala.charAt(i) != fjala.charAt(j)){
                return false;
            }
            j--;
        }
        return true;
    }

}
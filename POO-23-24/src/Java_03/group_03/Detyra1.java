package Java_03.group_03;

import java.util.Scanner;

public class Detyra1 {
    public static void main(String[] args){
        Polindrom polindrom = new Polindrom();
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.print("Shtyp fjalen: ");
            String fjala = scanner.next();
            if(fjala.equals("exit")){
                break;
            }

            if(polindrom.checkPolindrom(fjala)){
                System.out.println("Fjala eshte polindrom");
            }else{
                System.out.println("Fjala nuk eshte polindrom!");
            }
        }
    }
}

class Polindrom {

    boolean checkPolindrom(String fjala){
        int i = 0;
        int j = fjala.length() - 1;
        while(i < j){
            if(fjala.charAt(i) != fjala.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

}





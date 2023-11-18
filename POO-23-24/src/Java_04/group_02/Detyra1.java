package Java_04.group_02;

import java.util.Scanner;

public class Detyra1 {
    public static void main(String[] args){
        Loja.fillo();
    }
}

class Loja{
    static void fillo(){
        System.out.println("Loja filloj! Gjejeni numrin e kerkuar!");
        int numriIKerkuar = (int)(100 * Math.random());
        int numriMundesive = 3 + (int)(7 * Math.random());
//        5
        Scanner sc = new Scanner(System.in);
        System.out.printf("Ju keni: %d mundesi!\n", numriMundesive);

        while(numriMundesive > 0){
            System.out.print("Shtyp numrin: ");
            int numri = sc.nextInt();
            if(numri == numriIKerkuar){
                System.out.println("Urime keni gjetur numrin!");
                return;
            }
            if(numri > numriIKerkuar){
                System.out.println("Numri i shtypur eshte me i madh se numri i kerkuar!");
                numriMundesive--;
                System.out.printf("Ju kane mbetur edhe %d mundesi\n", numriMundesive);
            }else{
                System.out.println("Numri i shtypur eshte me i vogel se numri i kerkuar!");
                numriMundesive--;
                System.out.printf("Ju kane mbetur edhe %d mundesi\n", numriMundesive);
            }
        }

        System.out.printf("Ju nuk e keni gjetur numrin e kerkuar (%d)!\n", numriIKerkuar);
    }
}




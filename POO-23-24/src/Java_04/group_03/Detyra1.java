package Java_04.group_03;

import java.util.Scanner;

public class Detyra1 {
    public static void main(String[] args){
        Loja.fillo();
    }
}

class Loja{
    static void fillo(){
        System.out.println("Loja filloj! Qellojeni numrin!");
//        0 - 100
        int numriKerkuar = (int)(100 * Math.random());
//        3 - 10
        int mundesite = 3 + (int)(7 * Math.random());
        System.out.printf("Ju keni %d mundesi \n", mundesite);
        Scanner scanner = new Scanner(System.in);

        while(mundesite > 0){
            System.out.print("Shtypni nje numer: ");
            int numriPerdoruesit = scanner.nextInt();
            if(numriPerdoruesit == numriKerkuar){
                System.out.println("Urime e keni gjetur numrin e kerkuar!");
                scanner.close();
                return;
            } else if(numriPerdoruesit > numriKerkuar){
                System.out.println("Numri i kerkuar eshte me i vogel se numri i shtypur!");
                mundesite--;
                System.out.printf("Ju keni edhe %d mundesi\n", mundesite);
            }else{
                System.out.println("Numri i kerkuar eshte me i madh se numri i shtypur!");
                mundesite--;
                System.out.printf("Ju keni edhe %d mundesi\n", mundesite);
            }
        }
        System.out.println("Ju nuk e keni gjetur numrin: " + numriKerkuar);
        scanner.close();
    }









}
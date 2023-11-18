package Java_04.group_04;

import java.util.Scanner;

public class Detyra1 {
    public static void main(String[] args){
        Loja.start();
    }
}

class Loja{
    static void start(){
        System.out.println("Loja ka filluar! Gjejeni numrin e kerkuar!");
        int numriKerkuar = (int) (Math.random() * 100);
        int mundesite = (int)(Math.random() * 7) + 3;
        System.out.printf("Ju keni %d mundesi! \n",mundesite);
        Scanner scanner = new Scanner(System.in);
        while(mundesite > 0){
            System.out.print("Shtyp nje numer: ");
            int numri = scanner.nextInt();
            if(numri == numriKerkuar) {
                System.out.println("Urime e keni gjetur numrin e kerkuar!");
                scanner.close();
                return;
            }else if(numri > numriKerkuar){
                System.out.println("Numri qe keni shtyr eshte me i madh se numri i kerkuar!");
                mundesite--;
                System.out.printf("Ju keni edhe %d mundesi!\n", mundesite);
            }else{
                System.out.println("Numri qe keni shtypur eshte me i vogel se numri i kerkuar!");
                mundesite--;
                System.out.printf("Ju keni edhe %d mundesi!\n", mundesite);
            }
        }

        System.out.println("Ju nuk e keni gjetur numrin e kerkuar: " + numriKerkuar);
        scanner.close();
    }
}

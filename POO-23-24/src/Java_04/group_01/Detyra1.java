package Java_04.group_01;

import java.util.Scanner;

//Qello numrin!
//Kerkesat: programi duhet te jete interaktiv dhe te krijoj lojen "Qello Numrin"
//Perdoruesi duhet te tentoj qe gjeje numrin qe programi jon e krijon.
//Nese numri qe perdoruesi e shtyp eshte numri i kerkuar => atehere
// - Shtypet mesazhi: "Urime keni gjetur numrin"
// Nese numri nuk eshte i sakte, shtypen mesazhet:
// "Numri i dhene eshte me i vogel se numri i kerkuar"
// ose "Numri i dhene eshte me i madh se numri i kerkuar"
// Duhet te definohet numri i mundesive te perdoruesit dhe
// te dokumentohet cdo tentim ne cilen mundesi eshte bere!
public class Detyra1 {
    public static void main(String[] args){
        Loja.fillo();
    }
}


class Loja{
    static int numriMundesive = 2 + (int)(Math.random() * 5);

    static void fillo(){
        int numri = (int) (Math.random() * 100);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Loja filloj! Gjejeni se cili numer po kerkohet!");
        System.out.printf("Ju keni %d mundesi \n", numriMundesive);

        while(numriMundesive > 0){
            System.out.print("Shkruni numrin: ");
            int numriPerdoruesit = scanner.nextInt();

            if(numriPerdoruesit == numri){
                System.out.println("Ju keni gjetur numrin e kerkuar!");
                return;
            }else if(numriPerdoruesit > numri){
                System.out.println("Numri qe keni shtypur eshte me i madh se numri i kerkuar!");
                numriMundesive--;
                System.out.printf("Ju keni edhe %d mundesi\n", numriMundesive);
            }else{
                System.out.println("Numri qe keni shtypur eshte me i vogel se numri i kerkuar");
                numriMundesive--;
                System.out.printf("Ju keni edhe %d mundesi\n", numriMundesive);
            }
        }

        System.out.printf("Numri i kerkuar (%d) nuk eshte gjetur!\n", numri);

        scanner.close();

    }
}


package Java_03.group_01;

import java.util.Scanner;

public class KlasaScanner {
    public static void main(String[] args){
//        cin >> emri;
//        Scanner
//        scanner.next();
//        scanner.nextInt();
//        scanner.nextLine();
//        scanner.nextDouble();
        Scanner scanner = new Scanner(System.in);
//        how to solve nextLine problem in Java!
        System.out.print("Adresa: ");
        String adresa = scanner.nextLine();
        System.out.print("Shtypni emrin: ");
        String emri = scanner.next();
        System.out.print("Mosha juaj: ");
        int mosha = scanner.nextInt();

        System.out.println("Te dhenat e personit:");
        System.out.println("Emri: " + emri);
        System.out.println("Mosha: " + mosha);
        System.out.println("Adresa: " + adresa);

        System.out.println("Shtyp fjalen: ");
        scanner.next();
        System.out.println("Fjala e shtypur eshte polindrom!");

    }
}

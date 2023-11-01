package Java_03.group_02;

import java.util.Scanner;

public class KlasaScanner {
//    cin >> variabla;
//    Scanner
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
//        nextInt();
//        next();
//        nextDouble();
//        nextBoolean();
//        nextLine();

//        System.out.print("Shtypni nje numer: ");
//        int numri = scanner.nextInt();
//        System.out.print("Shkruani emrin: ");
//        String emri = scanner.next();
//        System.out.print("Shkruni moshen:");
//        int mosha = scanner.nextInt();
//        System.out.print("Nota mesatare:");
//        double notaMesatare = scanner.nextDouble();
//        Studenti studenti = new Studenti(emri, mosha, notaMesatare);
//        System.out.println("Numri qe keni shtypur: " + numri);
//        System.out.println("Emri: " + emri);
//        System.out.println("Mosha: " + mosha);
//        System.out.println("Nota Mesatare: " + notaMesatare);

        System.out.print("Vendos tekst: ");

        while (scanner.hasNext()){
            System.out.println(scanner.next());
        }

    }
}


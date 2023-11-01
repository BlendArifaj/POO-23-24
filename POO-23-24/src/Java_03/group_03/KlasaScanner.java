package Java_03.group_03;

import java.util.Scanner;

public class KlasaScanner {
//    cin >> emri;
//    Scanner
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
//        next(), nextInt(), nextDouble(), nextBoolean(), ...
        System.out.print("Shtyp emrin: ");
        String emri = scanner.nextLine();

        System.out.print("Shtyp mbiemrin: ");
        String mbiemri = scanner.nextLine();

        System.out.print("Mosha: ");
        int mosha = scanner.nextInt();

        System.out.println("Emri qe keni shtypur: " + emri);
        System.out.println("Mbiemri qe keni shtypur: " + mbiemri);
        System.out.println("Mosha: " + mosha);

        while(scanner.hasNext()){
            System.out.println(scanner.next());
        }

        scanner.close();
    }
}

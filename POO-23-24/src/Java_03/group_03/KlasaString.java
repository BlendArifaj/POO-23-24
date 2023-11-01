package Java_03.group_03;

public class KlasaString {
    public static void main(String[] args){
        String emri = "Filan";
        emri = "Fisteku";
        emri = new String("Fisteku");
        String mbiemri = "Fisteku";

        if(emri == mbiemri){
            System.out.println("Emri dhe mbiemri kane adrese te njejte memorike!");
        }else{
            System.out.println("Emri dhe mbiemri nuk kane adrese te njtejte memorike!");
        }

        if(emri.equals(mbiemri)){
            System.out.println("Emri dhe mbiemri kane permbajtje te njejte!");
        }else{
            System.out.println("Emri dhe mbiemri nuk kane permbajtje te njejte!");
        }

        char[] chars = new char[]{'F', 'j', 'a', 'l', 'a'};

        String fjala = new String(chars); // Fjala

        char[] fjalaNeKaraktere = fjala.toCharArray(); // {'F', 'j', ... }

        fjala.length();
        //fjalaNeKaraktere[1];
        fjala.charAt(0); // fjala[0]

        fjala.toLowerCase();
        fjala.toUpperCase();
    }
}

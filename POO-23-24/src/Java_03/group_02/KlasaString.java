package Java_03.group_02;

public class KlasaString {
    public static void main(String[] args){
        String emri = "Filan";
        emri = "Fisteku";
        emri = "Filan";
        emri = new String("Fisteku");
        String mbiemri = "Fisteku";

        if(emri == mbiemri){
            System.out.println("Emri dhe mbiemri kane adrese te njejte memorike!");
        }else{
            System.out.println("Emri dhe mbiemri nuk kane adrese te njejte memorike!");
        }

        if(emri.equals(mbiemri)){

        }

        char[] chars = new char[]{'F', 'i', 'l', 'a', 'n'};
        String string = new String(chars);
//        chars = string.toCharArray();
//        string.charAt(0);
//        string[0] => string.charAt(0)
//        string.toLowerCase();
//        string.toUpperCase();
//        string.trim();


    }
}

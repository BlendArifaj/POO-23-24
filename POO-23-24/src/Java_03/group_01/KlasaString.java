package Java_03.group_01;

public class KlasaString {
    public static void main(String[] args){
//        String emri = "Test";
        String emri2 = "Test";
        String emri3 = "Test";
        String emri = new String("Test");
        emri.equals(emri2);
        emri2.equals(emri);

        if(emri3 == emri2){
            System.out.println("Tekstet jane te njejta!");
        }else{
            System.out.println("Tekstet nuk jane te njejta!");
        }

        System.out.println("Emri: " + emri);

//        length
        System.out.println("String length:" +
                emri.length()
        );
        // "Filan" => ['F', 'i', 'l', 'a', 'n']
        System.out.println("CharAt[0]: " + emri.charAt(0));
        char[] vargu = emri.toCharArray();
    }
}

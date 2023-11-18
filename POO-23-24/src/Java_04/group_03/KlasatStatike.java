package Java_04.group_03;

public class KlasatStatike {
   public static void main(String[] args){
       ClassA instance1 = new ClassA();
       System.out.println("Numri i objekteve: " + instance1.numriObjekteve);
       System.out.println("Numri i objekteve: " + ClassA.numriObjekteve);

//       ClassA.numriObjekteve;

       ClassA instance2 = new ClassA();
       System.out.println("Numri i objekteve: " + instance2.numriObjekteve);

       ClassA instance3 = new ClassA();
       System.out.println("Numri i objekteve: " + instance3.numriObjekteve);
       System.out.println("Numri i objekteve: " + instance1.numriObjekteve);

//       Math math1 = new Math();
       Math.min(5, 3);
       Math.max(5, 3);
       Math.sin(90);
       Math.cos(90);

       Math.random();
       for(int i = 0; i < 10; i++){
           int numri = (int) (100 * Math.random());
//           3 - 8
           int numri2 = 3 + (int) (6 * Math.random());

           System.out.println("Vlera e rastesishme: " + numri);
           System.out.println("Vlera e rastesishme2: " + numri2);
       }
   }
}

class ClassA{
    static int numriObjekteve = 0;

    ClassA(){
        numriObjekteve++;
    }

    static void printoTeDhenatStatik(){
//        this
        System.out.println(ClassA.numriObjekteve);
//        printoTeDhenat(); - nuk lejohet
    }

    void printoTeDhenat(){
        ClassA.printoTeDhenatStatik();

    }

}

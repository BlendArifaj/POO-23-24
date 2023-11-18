package Java_04.group_04;

public class KlasaStatike {
    public static void main(String[] args){
        ClassA instance1 = new ClassA(1);
        System.out.println("Numri i objekteve: " + ClassA.numriIObjekteve);
        ClassA instance2 = new ClassA(2);
        System.out.println("Numri i objekteve: " + ClassA.numriIObjekteve);
        ClassA instance3 = new ClassA(3);
        System.out.println("Numri i objekteve: " + ClassA.numriIObjekteve);


        Math.min(5, 9);
        Math.max(5, 9);
        Math.sin(90);
        Math.cos(90);

//        Math.PI
//        Math.E

        Math.random();
        for(int i = 0; i < 10; i++){
            int numri = (int) (Math.random() * 5) + 3;
            System.out.println(numri);
        }
    }
}

class ClassA{
    int id;
    static int numriIObjekteve = 0;
    ClassA(int id){
        this.id = id;
        ClassA.numriIObjekteve++;
    }

    void shtypTeDhenat(){
        System.out.println(ClassA.numriIObjekteve);
        ClassA.shtypTeDhenatStatik();
    }

    static void shtypTeDhenatStatik(){
        int id = 5;
        String emri = "Test";

//        System.out.println(this.id);
        System.out.println(ClassA.numriIObjekteve);
//        this.shtypTeDhenat();
    }
}
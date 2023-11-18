package Java_04.group_01;

// Math

public class KlasatStatike {
    public static void main(String[] args){
        ClassA instance1 = new ClassA();
        ClassA.shtypDetajet();
        ClassA instance2 = new ClassA();
        ClassA.shtypDetajet();
        ClassA instance3 = new ClassA();
        ClassA.shtypDetajet();

        System.out.println("Max: " + Math.max(10, Math.max(20, 30)));
//        Math.min()
        for(int i=0; i< 10; i++){
            int rand = (int) (100 * Math.random());
            System.out.println("Random: " + rand);
        }
    }
}

class ClassA{
    static int numriIObjekteve = 0;

    ClassA(){
        numriIObjekteve++;
    }
    int getNumri(){
        shtypDetajet();
        return 5;
    }
    static void shtypDetajet(){
//        System.out.println("Numri: " + this.getNumri());
        System.out.println("Numri i objekteve: " + numriIObjekteve);
    }
}
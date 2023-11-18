package Java_04.group_02;

public class KlasatStatike {
    public static void main(String[] args){
        ClassA instance1 = new ClassA();
        System.out.println("Numri i objekteve: " + ClassA.numriIObjekteve);
        ClassA.shtypDetajet();

        ClassA instance2 = new ClassA();
        System.out.println("Numri i objekteve: " + ClassA.numriIObjekteve);
        ClassA.shtypDetajet();

        ClassA instance3 = new ClassA();
        System.out.println("Numri i objekteve: " + ClassA.numriIObjekteve);
        ClassA.shtypDetajet();

//        Math
        Math.max(10, 20);
        Math.min(10, 20);
        Math.abs(-10);
        Math.sin(90);
        Math.cos(0);
        Math.random();

        for(int i = 0; i < 10; i++){
            int randomNumber = 3 + (int) (5 * Math.random());
            System.out.println("Numri i rastesishem: " + randomNumber);
        }
    }
}

class ClassA {
    static int numriIObjekteve = 0;
    int mosha;
    ClassA(){
        numriIObjekteve++;
    }

    static void shtypDetajet(){
        System.out.println("Numri i objekteve: " + ClassA.numriIObjekteve);
//        System.out.println("Mosha: " + this.mosha);
    }

    void test(){
        int numri = ClassA.numriIObjekteve;
        ClassA.shtypDetajet();
    }

}

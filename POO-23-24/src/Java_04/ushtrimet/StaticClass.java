package Java_04.ushtrimet;

public class StaticClass {
    public static void main(String[] args){
        Test t1 = new Test();
        System.out.println("Created Objects: " + Test.createdObjects);
        Test t2 = new Test();
        System.out.println("Created Objects: " + Test.createdObjects);
        Test t3 = new Test();
        System.out.println("Created Objects: " + Test.createdObjects);

        int nextRandomInteger = (int)( Math.random() * 100);
        System.out.println(nextRandomInteger);
    }
}


class Test {
    static int createdObjects = 0;

    Test(){
        createdObjects++;
    }

    int getCreatedObjects(){
        return createdObjects;
    }
}
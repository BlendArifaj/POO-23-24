package Java_09.ushtrime;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Method to write object data to a file
    public void saveToFile(String fileName) {
        try {
            FileWriter fileWriter = new FileWriter(fileName, true);

            String dataToWrite = String.format("%s,%d\n", this.name, this.age);
            fileWriter.write(dataToWrite);
            System.out.println("Object data written to " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to read object data from a file
    public static Person loadFromFile(String fileName) {
        try{
            Scanner scanner = new Scanner(new File(fileName));
            if (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    String name = parts[0];
                    int age = Integer.parseInt(parts[1]);

                    return new Person(name, age);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static ArrayList<Person> loadObjectsFromFile(String fileName) {
        ArrayList<Person> readObjects = new ArrayList<>();
        try{
            Scanner scanner = new Scanner(new File(fileName));
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    String name = parts[0];
                    int age = Integer.parseInt(parts[1]);

                    readObjects.add(new Person(name, age));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return readObjects;
    }

    public static void main(String[] args) {
        // Creating and saving a Person object to a file
        Person person = new Person("John Doe", 30);
//        File file = new File("personData.txt");
//        file.exists();
//        file.createNewFile();
//        file.canWrite();
//        file.canRead();
//        file.length();
        person.saveToFile("personData.txt");
        person.saveToFile("personData.txt");

        // Loading a Person object from the file
        ArrayList<Person> loadedPersons = Person.loadObjectsFromFile("personData.txt");

        for(Person p: loadedPersons){
            System.out.println("Loaded Person: Name - " + p.getName() + ", Age - " + p.getAge());

        }
    }
}

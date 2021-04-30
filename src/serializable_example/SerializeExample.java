package serializable_example;

import java.io.*;

public class SerializeExample {

    public static void main(String[] args) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.dat"))) {
            Person p = new Person("Sam", 33, 178, true) ;
            oos.writeObject(p) ;
        } catch (IOException e) {
            e.getMessage();
        }
    }
}

class Person implements Serializable {

    private String name ;
    private  int age ;
    private transient double height ;
    private transient boolean married ;


    Person(String n, int a, int h, boolean m) {
        name = n ;
        age = a ;
        height = h ;
        married = m ;
    }

    @SuppressWarnings(value = "unused")
    String getName() {
        return name;
    }

    @SuppressWarnings(value = "unused")
    int getAge() {
        return age;
    }

    @SuppressWarnings(value = "unused")
    double getHeight() {
        return height;
    }

    @SuppressWarnings(value = "unused")
    boolean isMarried() {
        return married;
    }
}
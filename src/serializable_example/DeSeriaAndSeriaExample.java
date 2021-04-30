package serializable_example;

import java.io.*;
import java.util.ArrayList;

public class DeSeriaAndSeriaExample {

    public static void main(String[] args) {

        String filename = "people.dat" ;

        ArrayList<Person> people = new ArrayList<>() ;
        people.add(new Person ("Tom", 30, 175, false)) ;
        people.add(new Person ("Sam", 33, 178, true)) ;

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(people);
            System.out.println("File has been written");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Читаем

        ArrayList<Person> readPeople = new ArrayList<>() ;

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            readPeople = (ArrayList<Person>) ois.readObject() ;
        }  catch (Exception e) {
            e.printStackTrace();
        }
        for (Person p: readPeople) {
            System.out.printf("Name: %s \tAge: %d \n", p.getName(), p.getAge());
        }
    }
}

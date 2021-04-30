package interface_example;

import java.util.ArrayList;

public class ExampleList {

    public static void main(String[] args) {
        ArrayList<ExampleInterface> list = new ArrayList<>() ;
        ExampleInterfaceClass ex1 = new ExampleInterfaceClass() ;
        ExampleInterfaceClass ex2 = new ExampleInterfaceClass() ;

        list.add(ex1) ;
        list.add(ex2) ;

        System.out.println(list.size());
    }
}

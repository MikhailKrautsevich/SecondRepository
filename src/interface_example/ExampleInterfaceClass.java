package interface_example;

public class ExampleInterfaceClass implements ExampleInterface {
    @Override
    public void toDoSmth() {
        System.out.println("I did smth");
    }

    @Override
    public void toDoSmthAnother() {
        System.out.println("I did smth else");
    }
}

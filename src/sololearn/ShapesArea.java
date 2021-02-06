package sololearn;

@SuppressWarnings("unused")
abstract class Shape {
    int width ;
    abstract void area() ;
}

class Square extends Shape{
    Square(int width){
        this.width = width ;
    }

    @Override
    void area() {
        System.out.println(width*width);
    }
}

class Circle extends Shape{
    Circle(int width) {
        this.width = width ;
    }

    @Override
    void area() {
        System.out.println(Math.PI*width*width);
    }
}

public class ShapesArea {

    public static void main(String[] args) {
        int x = 5 ;
        int y = 2;

        Square a = new Square(x) ;
        Circle b = new Circle(y) ;

        a.area();
        b.area();
    }

}

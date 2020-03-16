package Ekkel_s_Tasks.Chapter_07.Task_16;

class Frog extends Amphibian {

       public void swim (){
           System.out.println("Frog swims");
       }
       public void walk (){
           System.out.println("Frog walks");
       }
       private void jump() {
           System.out.println("Frog jumps");
       }

    public static void main(String[] args) {
        Frog freddy = new Frog() ;
        freddy.jump();
        freddy.swim();
        freddy.walk();

        System.out.println("Now I use freddy as Amphibian only");

        ((Amphibian) freddy).swim();
        ((Amphibian) freddy).walk();
    }
}




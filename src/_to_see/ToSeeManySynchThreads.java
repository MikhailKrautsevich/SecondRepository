package _to_see;

public class ToSeeManySynchThreads {

    public static void main(String[] args) throws InterruptedException {

        StringBuffer text = new StringBuffer() ;

        CountClass c1 = new CountClass(text , 200) ;
        CountClass c2 = new CountClass(text , 100) ;
        c1.start();
        c2.start();
        c1.join();
        c2.join();

        System.out.println("Result: " + text);
    }

}

package _to_see;

public class ToSeeManyThreads {



    public static void main(String[] args) {

        NewThread t1 = new NewThread() ;
        NewThread t2 = new NewThread() ;

        t1.start();
        t2.start();
    }
}

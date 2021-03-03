package _to_see;

public class CountClass extends Thread {
    private final StringBuffer text ;
    private int countTo ;
    CountClass (StringBuffer s , int c) {
        text = s ;
        countTo = c ;
    }
    @Override
    public void run() {
        synchronized (text) {
            text.append(this.getName() + "\n") ;
            int sum = 0 ;
            for (int i = 1; i <= countTo ; i++) {
                sum += i ;
                text.append("Next value = " + i + "; ") ;
            }
            text.append("\nsum=" + sum + "\n") ;
        }
    }
}

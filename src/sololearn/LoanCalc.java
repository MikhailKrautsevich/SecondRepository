package sololearn;

public class LoanCalc {

    public static void main(String[] args) {

        int loanAll = 20_000 ;
        int wasAlreadyPaid = 0 ;

        String s = "Month # %d , was paid = %d , coin = %b, to pay this month = %d, loan = %d" ;

        System.out.println("LC: Start");

        for (int i = 0; i < 6; i++) {
            boolean coinWithProblem = false ;
            int problem = 0 ;
            if ((loanAll - wasAlreadyPaid)%10 != 0) {
                coinWithProblem = true ;
                problem = 1 ;
            }

            int toPayThisMonth = (loanAll - wasAlreadyPaid)/10 + problem;
            wasAlreadyPaid = wasAlreadyPaid + toPayThisMonth ;

            int loan = loanAll - wasAlreadyPaid ;

            String s1 = String.format(s, i+1, wasAlreadyPaid, coinWithProblem, toPayThisMonth, loan) ;

            System.out.println(s1);
        }
    }
}

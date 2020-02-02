package Ekkel_s_Tasks.Chapter_05;

import java.util.Arrays;
import java.util.TreeSet;

public class VampireSeeker_Ver_02 {

    public static void main(String[] args) {
        TreeSet<Integer> vampires = new TreeSet<>();
        for (int i =10; i<100 ; i++)
        {
            for (int j= 10; j<100; j++) {
                int may_be = i*j ;
                if (van_helsing (i, j, may_be)) {vampires.add(may_be) ; }
            }
        }
        System.out.println(vampires);

    }

    private static boolean  van_helsing (int mul_1, int mul_2, int m_vampire) {
        boolean proved = false ;
        int [] multis = makeArray((makeString(mul_1 , mul_2))) ;
        int [] vampArray = makeArray(makeString(m_vampire)) ;
        if (Arrays.equals(multis, vampArray)) proved = true ;
        String myString = mul_1 + " x " + mul_2 + " "+ proved + " " + m_vampire ;
        if (proved) System.out.println(myString);
        return proved ;
    }

    private static int[] makeArray (String myString) {
        char [] numberCharArray = myString.toCharArray() ;
        int [] numberArray = new int [numberCharArray.length] ;
        for (int i = 0; i < numberCharArray.length; i++) {
            numberArray [i] = Integer.parseInt(numberCharArray[i]+ "");
        }
        Arrays.sort(numberArray);
        return numberArray ;
    }

    private static String makeString (int number1, int number2) {
        return (number1) + Integer.toString(number2) ; }

    private static String makeString (int number) {
        return Integer.toString(number) ;
    }
}


package sololearn;

public class TextReverser {
    public static void main(String[] args) {
        String example = "Example text" ;
        char[] array = example.toCharArray() ;

        int length = array.length ;
        System.out.println(length);

        char[] reversed = new char[length] ;

        String s = "#%d => %c " ;

        for (int i = 0; i <= length - 1; i++) {
            reversed[i] = array[length - 1 - i] ;
            String s1 = String.format(s, i, reversed[i]) ;
            System.out.println(s1);
        }

        System.out.println(reversed);
    }
}

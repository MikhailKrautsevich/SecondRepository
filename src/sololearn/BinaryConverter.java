package sololearn;


public class BinaryConverter {
    public static void main(String[] args) {
        int x = 18 ;

        String converted = convertToBinary(x) ;
        System.out.println(converted);
    }

    private static String convertToBinary(int x) {
        String converted = "" ;
        int x1 = x;
        int i = 1;
        int z;
        String example = "Iteration %d : x1 = %d, остаток = %d, результат = %s";
        while (x1 >= 2) {
            z = x1%2 ;
            x1 = x1/2;
            converted = z + converted ;
            System.out.println(String.format(example, i, x1, z, converted));
            i++ ;
        }
        if (x1 != 0) {
            converted = '1' + converted ;
        }
        return converted ;
    }
}

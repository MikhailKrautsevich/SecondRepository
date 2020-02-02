package Ekkel_s_Tasks.Chapter_05;

import java.util.HashSet;
// import java.util.Iterator;
import java.util.TreeSet;

public class VampireSeeker {

    public static void main(String[] args) {

        HashSet <Integer> vampires = new HashSet<>() ;

        for (int i = 1000; i < 10000 ; i++ )
        {if (IsVampire(i))
            vampires.add(i) ;
        }

        TreeSet<Integer> sortedVampires = new TreeSet<>(vampires);

//      Iterator iterator = vampires.iterator();
//      while (iterator.hasNext()) sortedVampires.add((Integer) iterator.next()) ;

        System.out.println("Найденные вампиры ");
        System.out.print(vampires);
        System.out.println();
        System.out.println("Сортированные вампиры ");
        System.out.print(sortedVampires);
    }

    private static boolean IsVampire(int i) {

        boolean steak = false ;
        int number = i ;
        int ones = number % 10 ;
        number = (number - ones)/10 ;
        int dozens = number % 10 ;
        number = (number - dozens) /10 ;
        int hundreds = number % 10 ;
        number = (number - hundreds) /10 ;
        int thousands = number % 10 ;

        if ((thousands*10 + hundreds)*(dozens*10 + ones) == i) steak = true ;
        if ((thousands*10 + hundreds)*(ones*10 + dozens) == i) steak = true ;
        if ((thousands*10 + dozens)*(hundreds*10 + ones) == i) steak = true ;
        if ((thousands*10 + dozens)*(ones*10 + hundreds) == i) steak = true ;
        if ((thousands*10 + ones)*(dozens*10 + hundreds) == i) steak = true ;
        if ((thousands*10 + ones)*(dozens*10 + hundreds) == i) steak = true ;

        if ((hundreds*10 + thousands)*(dozens*10 + ones) == i) steak = true ;
        if ((hundreds*10 + thousands)*(ones*10 + dozens) == i) steak = true ;
        if ((hundreds*10 + dozens)*(thousands*10 + ones) == i) steak = true ;
        if ((hundreds*10 + dozens)*(ones*10 + thousands) == i) steak = true ;
        if ((hundreds*10 + ones)*(thousands*10 + dozens) == i) steak = true ;
        if ((hundreds*10 + ones)*(dozens*10 + thousands) == i) steak = true ;

        if ((dozens*10 + hundreds)*(ones*10 + thousands) == i) steak = true ;

        if ((ones*10 + hundreds)*(dozens*10 + thousands) == i) steak = true ;

        return steak ;
    }
}

package _to_see;

import java.util.Locale;

public class ToSeeLocale {
    public static void main(String[] args) {
        Locale myLocale = Locale.getDefault() ;
        System.out.println(myLocale.getLanguage());
        System.out.println(myLocale.getDisplayLanguage());
        System.out.println(myLocale.getDisplayCountry());
        System.out.println(myLocale.getDisplayName());

        final Locale [] locales = Locale.getAvailableLocales() ;
        System.out.println(locales.length);

        for (int i = 0; i < locales.length ; i++ ) {
            System.out.println(i + " " + locales[i] +  " = " + locales[i].getDisplayName());
        }
    }
}

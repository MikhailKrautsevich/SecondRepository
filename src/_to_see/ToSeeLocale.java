package _to_see;

import java.util.Locale;

public class ToSeeLocale {
    public static void main(String[] args) {
        Locale myLocale = Locale.getDefault() ;
        System.out.println(myLocale.getLanguage());
        System.out.println(myLocale.getDisplayLanguage());
        System.out.println(myLocale.getDisplayCountry());
        System.out.println(myLocale.getDisplayName());

        Locale [] locales = Locale.getAvailableLocales() ;
        System.out.println(locales.length);

        for (int i = 0; i < 160 ; i++) {
            System.out.println(i + " " + locales[i] +  " = " + locales[i].getDisplayName());
        }
    }
}

import java.util.Scanner;
import java.util.Locale;

public class TagDrei {
    public static void main(String[] args) {
        // Für Eingabe mit Punkt vor Nachkommastellen (anstelle von Komma)
        System.out.println(Locale.getDefault());
        Locale.setDefault(new Locale("en", "EN"));
        System.out.println(Locale.getDefault());


        String s1 = String.valueOf(true);
        System.out.println(s1);
        System.out.printf("%n");
        System.out.println();
    }
}

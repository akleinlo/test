import java.util.Arrays;
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
        System.out.println();

        // Arrays
        // ----------------------------------------------------------------------------
        // ----------------------------------  7  -------------------------------------
        // ----------------------------------------------------------------------------

        // Aufgaben Java Basics – Arrays und Schleifen
        // ----- Level 1: Easy ----
        int[] zahlen = {1, 2, 3, 4, 5};
        for (int i = 0; i < zahlen.length; i++) {
            System.out.println(zahlen[i]);
        }
        System.out.println();

        String[] namen = {"Hans", "Franz", "Wilfried", "Wotan"};
        for (String name:namen) {
            System.out.println(name);
        }

        int[] zahlenQuadrat = {2, 3, 6, 8};
        for (int i = 0; i<zahlenQuadrat.length; i++) {
            int output = zahlenQuadrat[i] * zahlenQuadrat[i];
            System.out.println(output);
        }
        System.out.println();

        // or like this:
        for (int zahl: zahlenQuadrat) {
            int ouput = zahl * zahl;
            System.out.println(ouput);
        }

        // or like this, numbers in one row:
        for (int i = 0; i < zahlenQuadrat.length; i++) {
            int output = zahlenQuadrat[i] * zahlenQuadrat[i];
            if (i < zahlenQuadrat.length -1) {
                System.out.print(output + ", ");
            }
            else {
                System.out.println(output);
            }
        }

        // ----- Level 2: Medium ----
        int[] numbers2 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < numbers2.length; i++ ) {
            if (numbers2[i] % 2 == 0 && i < numbers2.length -1) {
                System.out.print(numbers2[i] + ", ");
            }
            else if (numbers2[i] % 2 == 0) {
                System.out.println(numbers2[i]);
            }
        }
        System.out.println();

        for (int number2:numbers2) {
            if (number2%2!=0) continue;
            else {
                System.out.println(number2);
            }
        }
        System.out.println();

        int[] ganzeZahlen = {23, 342, 22, 12, 9, 6, 45, 47, 3, 4};
        int sum = 0;
        for (int i = 0; i < ganzeZahlen.length; i++) {
            sum += ganzeZahlen[i];
            if (i < ganzeZahlen.length - 1) {
                System.out.println("Die Zwischensumme ist: " + sum);
            }
            else {
                System.out.println("Die Endsumme ist: " + sum);
            }
        }

        // the same with for-each
        int sum2 = 0;
        for (int zahl: ganzeZahlen) {
            sum2 += zahl;
        }
        System.out.println("The sum is: " + sum2);

        // String with names of cities
        String[] cities = {"Berlin", "Hamburg", "Vienna", "Santa Cruz", "Venice"};
        for (int i = 0; i < cities.length; i++) {
            System.out.println("Index " + i + ": " + cities[i]);
        }
        System.out.println();

        // Finding min. and max.
        int[] wholeNumbers = {1, 3, 9, 32, -4, 3, 4, -12, 44};
        int smallestNum = wholeNumbers[0];
        int largestNum = wholeNumbers[0];
        for (int num:wholeNumbers) {
            if (num<smallestNum) {
                smallestNum = num;
            }
            if (num>largestNum) {
                largestNum = num;
            }
        }
        System.out.println(smallestNum);
        System.out.println(largestNum);

        // ----- Level 3: Bonus ----
        // Double values
        int[] moreNumbers = {3, 5, 4, 2, 19, 3, 4};
        for (int i = 0; i < moreNumbers.length; i++) {
            moreNumbers[i] *= 2;
            if (i < moreNumbers.length -1) {
                System.out.print(moreNumbers[i] + ", ");
            }
            else {
                System.out.println(moreNumbers[i]);
            }
        }

        // combining two arrays --> all possible combinations
        String[] vornamen = {"Hans", "Antonia", "Ute", "Dina"};
        String[] nachnamen = {"Barzegar", "Hanke", "Nouri", "Motebassem"};
        for (int i = 0; i < vornamen.length; i++) {
            for (int j = 0; j < vornamen.length; j++) {
                System.out.println(vornamen[i] + " " + nachnamen[j]);
            }
        }
        System.out.println();

        // combining two arrays --> 1 vorname + 1 nachname
        for (int i = 0; i < vornamen.length; i++) {
            System.out.println(vornamen[i] + " " + nachnamen[i]);
        }

        // process user input
        Scanner scan = new Scanner(System.in);
        int[] userInputNumbers = new int[5];

        System.out.println("Gib 5 Ganzzahlen ein: ");
        for (int i = 0; i < userInputNumbers.length; i++) {
            System.out.println("Zahl " + (i+1) + ": ");
            userInputNumbers[i] = scan.nextInt();
        }

        for (int input:userInputNumbers) {
            System.out.println(input);
        }









    }
}

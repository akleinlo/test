import java.util.Scanner; // Import the Scanner class
import java.util.Locale;

public class TagEins { // Hauptklasse, Name muss mit Dateinamen übereinstimmen

    public static void main(String[] args) {
        // ----------------------------------------------------------------------------
        // ----------------------------------  1  -------------------------------------
        // ----------------------------------------------------------------------------
/*
        // Aufgaben Java Basics – Main Method Exercises
        // ----- Level 1: Easy -----
        System.out.println("Hello World once again!");
        System.out.println("Hello Universe!");
        System.out.println("Hello Boot Camp!");

        // ----- Level 2: Medium -----
        // Variablen verwenden
        String name = "Adrian";
        System.out.println("Hello " + name + "!");

        // Rechnen in der Konsole
        int a = 5;
        int b = 6;
        int sum = a + b;
        System.out.println(a + "+" + b + "=" + sum);

        // ----- Level 3: Tough -----
        // Benutzer-Eingabe verarbeiten
        Scanner scan = new Scanner(System.in); // Scanner für Eingaben
        System.out.println("Enter your name: ");

        String userName = scan.nextLine();  // Benutzer tippt etwas ein
        System.out.println("Hello " + userName + "!");
        System.out.println();

        // Ausgabe formatieren: Tabelle mit Namen und Alter ausgeben,
        // gleichmäßige Abstände.
        // Formatierung mit System.out.printf() (ähnlich wie in C).
        // Bsp. System.out.printf("%-15s %-5s%n", "Name", Age")
        // %-15s --> String, linksbündig, 15 Zeichen breit
        // %-5d --> Integer, linksbündig, 5 Zeichen breit (d = Decimal Integer)
        // %n --> Neue Zeile

        System.out.printf("%-15s %-5s%n", "Name", "Alter"); //Tabellenkopf
        System.out.printf("%-15s %-5d%n", "Adrian", 37);
        System.out.printf("%-15s %-5d%n", "Franz", 99);
        System.out.println();

        // Mini-Challenge: erstes eigenes Programm
        // NB: Scanner (scan) wurde oben schon definiert.
        // Name
        System.out.println("Enter your name: ");
        String name2 = scan.nextLine();

        // Alter
        System.out.println("Enter your age: ");
        int age = scan.nextInt();
        scan.nextLine(); // Rest der Zeile weglesen, damit nextLine später klappt

        // Lieblingsspruch
        System.out.println("Enter your Lieblingsspruch: ");
        String spruch = scan.nextLine();

        // Rechenaufgabe
        System.out.println("Enter an integer: ");
        int int1 = scan.nextInt();

        System.out.println("Enter another integer: ");
        int int2 = scan.nextInt();

        int sum2 = int1 + int2;

        //Ausgabe
        System.out.println();
        System.out.println("Hallo " + name2 + ". You are " + age + " years old.");
        System.out.println("Dein Lieblingsspruch ist: " + spruch);
        System.out.println("Rechenaufgabe: " + int1 + "+" + int2 + "=" + sum2);


        // ----------------------------------------------------------------------------
        // ----------------------------------  2  -------------------------------------
        // ----------------------------------------------------------------------------

        // Aufgaben Datentypen: Mixed Date Types Exercises
        // ----- Level 1: Easy -----
        byte myAge = 37;
        System.out.println("Mein Alter ist " + myAge + " Jahre.");

        float koerperGroesse = 1.8346F;
        System.out.println("Ich bin " + koerperGroesse + "m groß.");

        char ersterBuchstabe = 'A';
        System.out.println("Mein Name beginnt mit einem " + ersterBuchstabe + ".");

        String myName = "Adrian Kleinlosen";
        System.out.println("Mein vollständiger Name lautet " + myName + ".");

        // ----- Level 2: Medium -----
        String vorname = "Adrian";
        int alter = 37;
        double groesse = 1.83423576423;
        System.out.println("Ich heiße " + vorname + ", bin " + alter + " Jahre alt und " + groesse + "m groß.");

        // if-else-Abfrage
        Scanner scan2 = new Scanner(System.in); // Scanner für Eingaben
        scan2.useLocale(Locale.US); // Punkt statt Komma für Dezimalzahlen
        System.out.println("Bitte gib Dein Alter ein: ");
        int age2 = scan2.nextInt();

        if (age2 >= 18) {
            System.out.println("Du bist erwachsen.");
        }
        else {
            System.out.println("Du bist noch nicht erwachsen.");
        }

        // oder so:
        boolean isAdult;
        System.out.println("Bitte gib Dein Alter ein: ");
        int age3 = scan2.nextInt();
        scan2.nextLine();
        if (age3 >= 18 ) {
            isAdult = true;
            System.out.println("Du bist erwachsen.");
        }
        else {
            isAdult = false;
            System.out.println("Du bist noch nicht erwachsen.");
        }

        // Rechnen mit Zahlen
        System.out.println("Gib eine erste Nachkommazahl ein: ");
        double zahl1 = scan2.nextDouble();
        scan2.nextLine();
        System.out.println("Gib eine zweite Nachkommazahl ein: ");
        double zahl2 = scan2.nextDouble();
        scan2.nextLine();

        double sum2 = zahl1 + zahl2;
        double diff = zahl1 - zahl2;
        double prod = zahl1 * zahl2;
        double quot = zahl1 / zahl2;

        System.out.println("Die Summe ist: " + sum2 + "; die Differenz ist: " + diff
                            + "; das Produkt ist: " + prod + "; der Quotient ist: " + quot);

        // String-Methoden nutzen
        String satzMeinerWahl = "Das ist ein Satz meiner Wahl.";
        int satzLength = satzMeinerWahl.length();
        char ersterBuchstabeSatz = satzMeinerWahl.charAt(0);
        String satzGross = satzMeinerWahl.toUpperCase();

        //Ausgabe
        System.out.println();
        System.out.println("Anzahl Zeichen im Satz: " + satzLength);
        System.out.println("Der erste Buchstabe ist ein " + ersterBuchstabeSatz + ".");
        System.out.println("Und nun alles groß: " + satzGross);

*/
        // ----- Level 3: Tough -----
        // Datentypen mischen
        Scanner scan2 = new Scanner(System.in);
        scan2.useLocale(Locale.US); // Punkt statt Komma für Dezimalzahlen

        System.out.println("Deinen Namen bitte: ");
        String name3 = scan2.nextLine();
        System.out.println("Bitte gib dein Alter an: ");
        int alter2 = scan2.nextInt();
        System.out.println("Bitte gib deinen Lieblingsbuchstaben ein: ");
        char lieblingsBuchstabe = scan2.next().charAt(0); // NB: nextChar existiert nicht
        System.out.println("Hallo " + name3 + ", dein Lieblingsbuchstabe ist " + lieblingsBuchstabe
                            + " und du bist " + alter2 + " Jahre alt.");
        System.out.println();

        // Rechnen und Vergleichen
        System.out.println("Gib eine erste Zahl ein (Double oder Int): ");
        double ersteZahl = scan2.nextDouble();
        System.out.println("Gib eine zweite Zahl ein (Double oder Int): ");
        double zweiteZahl = scan2.nextDouble();
        double sum = ersteZahl + zweiteZahl;
        if (sum > 10) {
            System.out.println("Die Summe der beiden Zahlen ist " + sum
                                + " und daher größer als 10.");
        }
        else {
            System.out.println("Die Summe der beiden Zahlen ist " + sum
                                + " und daher kleiner als 10.");
        }
        //System.out.println();
        System.out.printf("%n");

        // Zeichen prüfen
        System.out.println("Gib einen Buchstaben ein: ");
        char vokalJaNein = scan2.next().charAt(0);
        if (vokalJaNein == 'a' || vokalJaNein == 'e' || vokalJaNein == 'i'
            || vokalJaNein == 'o' || vokalJaNein == 'u' || vokalJaNein == 'A'
            || vokalJaNein == 'E' || vokalJaNein == 'I' || vokalJaNein == 'O'
            || vokalJaNein == 'U') {
            System.out.println("Du hast einen Vokal eingegeben.");
        }
        else {
            System.out.println("Du hast keinen Vokal eingegeben.");
        }
        System.out.printf("%n");

        // Oder so (eleganter):
        System.out.println("Gib einen Buchstaben ein: ");
        char c = scan2.next().charAt(0);

        String vokale = "aeiouAEIOU";

        // -1 heißt: indexOf(char) sucht in einem String nach dem angegebenen Zeichen.
        // Falls das Zeichen gefunden wird, liefert sie den Index (0 für das erste Zeichen usw.).
        // Falls nicht, gibt sie -1 zurück.
        if (vokale.indexOf(c) != -1) {
            System.out.println("Du hast einen Vokal eingegeben.");
        }
        else {
            System.out.println("Du hast keinen Vokal eingegeben.");
        }
        System.out.printf("%n");

        // Mini-Programm:
        // 1. Zwei Ganzzahlen und eine Kommazahl einlesen.
        // 2. Eine Rechnung ausführen.
        // 3. Ergebnis als Text in vollständigem Satz ausgeben.
        // 4. Prüfen, ob Ergebnis positiv ist und Info ausgeben.

        int numberOne = 2;
        int numberTwo = 3;
        double numberThree = 4.1;
        double result = (numberOne*numberTwo)/numberThree;
        System.out.println("Das Ergebnis von (" + numberOne + "*"
                            + numberTwo + ")/" + numberThree
                            + "=" + result);




    }

}

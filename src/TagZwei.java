import java.util.Scanner; // Import the Scanner class
import java.util.Locale;

public class TagZwei {
    public static void main(String[] args) {

        // System.out.println("Guten Morgen!");

        // Für Eingabe mit Punkt vor Nachommastellen (anstelle von Komma)
        System.out.println(Locale.getDefault());
        Locale.setDefault(new Locale("en", "EN"));
        System.out.println(Locale.getDefault());
/*

        Scanner scan = new Scanner(System.in);
        //scan.useLocale(Locale.US); // Punkt statt Komma für Dezimalzahlen

        System.out.println("Gib ein Double ein: ");
        double zahl = scan.nextDouble();
        System.out.println(zahl);


        // ----------------------------------------------------------------------------
        // ----------------------------------  3  -------------------------------------
        // ----------------------------------------------------------------------------

        // Aufgaben Java Basics – Operatoren
        // ----- Level 1: Easy -----
        int a = 5;
        int b = 6;
        int sum = a+b;
        System.out.println("a=" + a + ", b= " + b + ", a+b=" + sum);
        System.out.printf("%n");

        boolean equals = a == b;
        if (equals = true) {
            System.out.println("a und b sind gleich");
        }
        else {
            System.out.println("a und b sind ungleich");
        }

        Scanner scan = new Scanner(System.in);
        System.out.println("Gib eine Zahl ein: ");
        double zahl = scan.nextDouble();

        boolean isTrue = zahl > 0 && zahl < 100;
        if (isTrue) {
            System.out.println("Zahl ist größer als 0 und kleiner als 100.");
        }
        else {
            System.out.println("Zahl ist entweder kleiner als 0 oder größer als 100.");
        }

        // ----- Level 2: Medium -----
        int c = 40;
        int d = 9;
        int e = c % d;
        System.out.println("Modulo von " + c + " und " + d + " ist " + e);

        if (e == 0) {
            System.out.println("Modulo = 0");
        }
        else {
            System.out.println("Modulo != 0");
        }

        // Zusätzlich && nutzen
        if (e == 0 && c > 0) {
            System.out.println("Modulo ist 0 und Ausgangszahl ist positiv.");
        }
        else {
            System.out.println("Entweder ist Modulo ungleich 0 oder Ausgangszahl ist negativ " +
                                "oder Modulo ist ungleich 0 und Ausgangszahl ist negativ.");
        }

        // Preisberechnung mit Bedingung
        System.out.println("Preis eingeben: ");
        double preis = scan.nextDouble();
        boolean rabatt = true;
        if (rabatt) {
            preis *= 0.9;
            System.out.println("Neuer Preis nach Rabatt: " + preis);
        }
        else {
            System.out.println("Preis bleibt gleich: " + preis);
        }

        System.out.printf("%n");
        System.out.println("Gib eine ganze Zahl ein: ");
        int f = scan.nextInt();
        boolean geradeUndGroesserAls50 = (f % 2 == 0) || f > 50;
        System.out.println(geradeUndGroesserAls50);
        System.out.println();

        // ----- Level 3: Bonus -----
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gib eine ganze Zahl ein.");
        int number = scanner.nextInt();
        if (number >= 10 && number <= 20) {
            System.out.println("Treffer!");
        }
        else {
            System.out.println("Kein Treffer!");
        }

        int a2 = 20;
        int b2 = 19;
        int c2 = 21;

        if (a2 > b2 && a2 <= c2 || c2 < 0) {
            System.out.println("Jup!");
        }

        // Mini-Programm
        System.out.println("Dein Alter: ");
        int age = scanner.nextInt();
        System.out.println("Mitglied (true/false): ");
        boolean mitglied = scanner.nextBoolean();
        String msg = (age >= 18 && mitglied) ? "Zutritt gewährt!" : "Zutritt verweigert";
        System.out.println(msg);

*/


        // ----------------------------------------------------------------------------
        // ----------------------------------  4  -------------------------------------
        // ----------------------------------------------------------------------------

        // Aufgaben Java Basics – If-Else-Statements
        // ----- Level 1: Easy -----
        Scanner scan = new Scanner(System.in);

        int age = 22;
        if (age >= 18) {
            System.out.println("volljährig");
        }

        boolean isRaining = true;
        if (isRaining) {
            System.out.println("Nimm einen Regenschirm!");
        }
        else {
            System.out.println("Kein Regenschirm nötig.");
        }

        String city = "Hamburg";
        if (city == "Berlin") {
            System.out.println("Hauptstadt.");
        }
        else {
            System.out.println("Kleiner, aber schöner.");
        }

        // ----- Level 2: Medium -----
        System.out.println("Score: ");
        int score = scan.nextInt();
        boolean hasTicket = true;
        if (hasTicket && score >= 50) {
            System.out.println("Du darfst eintreten.");
        }
        else {
            System.out.println("Draußen bleiben.");
        }

        System.out.println("Gib eine Temperatur an: ");
        int temperature = scan.nextInt();
        if (temperature >= 30) {
            System.out.println("Heiß.");
        }
        else if (temperature >= 20) {
            System.out.println("Warm.");
        }
        else if (temperature >= 10) {
            System.out.println("Kühl.");
        }
        else {
            System.out.println("Kalt.");
        }

        // Ternary-Operator
        System.out.println("Gib eine Zahl ein: ");
        int number = scan.nextInt();
        //int number = 21;
        String parity = (number % 2 == 0) ? "Gerade" : "Ungerade";
        System.out.println(parity);

        // ----- Level 3: Bonus -----
        Scanner scanBonus = new Scanner(System.in);
        System.out.println("Gib einen Namen ein: ");
        String nameBonus = scanBonus.nextLine();
        if (nameBonus == null || nameBonus.isEmpty()) {
            System.out.println("Ungültiger Name!");
        }
        else {
            System.out.println("Hallo, " + nameBonus + "!");
        }

        double x = 0.1 + 0.2;
        double epsilon = 1e-13;
        System.out.println("epsilon = " + epsilon);
        if (Math.abs(x-0.3) < epsilon) {
            System.out.println("Nahe genug an 0.3");
        }

        // Switch:
        int result = 0;
        switch (result) {
            case 0: {
                System.out.println("Die Variable ist 0.");
                break;
            }
            case 1: {
                System.out.println("Die Variable ist 1.");
            }
        }

        //register("Hans", 17);

        helloWorld();
        String greeting = getGreeting();
        System.out.println(greeting);
        System.out.println(printName("Adrian"));
        System.out.println(add(3, 4));
        System.out.println(calculateArea(4, 5));
        checkPositive(4);
        System.out.println(isEven(3));
        String sum = printSumMessage(4, 5);
        System.out.println(sum);
        System.out.println(add(4, 5));
        System.out.println(subtract(9, 12));
        System.out.println(multiply(3, 444));
        System.out.println(divide(23478, 234423));

        System.out.println(myMethod("Hallo"));

    }

    // ----------------------------------------------------------------------------
    // ----------------------------------  5  -------------------------------------
    // ----------------------------------------------------------------------------

    // Aufgaben Java Basics – Methoden
    // ----- Level 1: Easy -----

    public static void helloWorld() {
        System.out.println("Hello World!");
    }

    public static String getGreeting () {
        return "Willkommen im Java-Kurs!";
    }

    public static String printName (String name) {
        return "Hallo " + name + "!";
    }

    // ----- Level 2: Medium -----
    public static int add(int a, int b) {
        return a + b;
    }

    public static double calculateArea (double width, double height) {
        return width * height;
    }

    public static void checkPositive (int a) {
        if (a < 0) {
            System.out.println("Negative Zahl.");
            return;
        }
        else {
            System.out.println("Positive Zahl");
        }
    }

    // ----- Level 3: Bonus -----
    public static boolean isEven (int a) {
        return a%2 == 0;
    }

    public static String printSumMessage (int a, int b) {
        int sum = add(a, b);
        return "Die Summe ist " + sum;
    }

    // Mini-Projekt: Taschenrechner (add [vgl. oben], subtract, multiply, divide)
    public static int subtract (int a, int b) {
        return a-b;
    }

    public static int multiply(int a, int b) {
        return a*b;
    }

    public static double divide(double a, double b) {
        return a/b;
    }

    public static String myMethod(String name) {
        String hallo = "Hallo ";
        int length = hallo.length();
        return hallo + length;
    }


    // -------------------- If-Else-Exercises (#4)  --------------------
    // Mehrstufige Prüfung
    // Methode register(String username, int age) schreiben, die:
    // -abbricht, wenn username null oder leer ist,
    // -abbricht, wenn age>18 ist,
    // -ansonsten: "Registrierung erfolgreich" ausgeben.

    public static void register(String username, int age) {
        if (username == null || username.isBlank()) {
            System.out.println("Programm bricht ab!");
            return;
        }
        else if (age > 18) {
            System.out.println("Programm bricht ab!");
            return;
        }
            System.out.println("Registrierung erfolgreich!");
    }

}

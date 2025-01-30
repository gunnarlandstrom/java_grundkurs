/**
 * Ex05_17 - PersonTest6
 *
 * Ett klass som testar klassen Person6 och dess metod toString.
 *
 * @author Robert Jonsson 
 */
public class PersonTest6 {
    public static void main(String[] args) {
        // Skapar olika objekt av klassen Person6
        Person6 p1 = new Person6("Kalle", "Karlsson", 30, "kalle@karlsson.se");
        Person6 p2 = new Person6("Stina", "Svensson", 25);
        Person6 p3 = new Person6();

        // Provar olika sätt att använda toString

        // 1. Anropar toString på objektet p2 och lagrar den 
        // sträng som returneras i variablen name.
        String name = p2.toString();
        System.out.println(name);
        

        // 2. Anropar toString på objektet p1 och skriver ut den sträng som returneras
        System.out.println(p1.toString());

        // 3. Används enbart objektreferensen, i t.ex. en System.out.println,
        // är det toString som anropas. Detta gäller för alla objekt.
        System.out.println(p1);

        // 4. Eftersom det är toString som anropas när enbart objekt används
        // är det strängaddition som utförs nedan.
        System.out.println(p3 + " " + p1);
    }
}
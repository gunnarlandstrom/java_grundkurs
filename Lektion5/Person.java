/**
 * Ex05_01 - Person
 *
 * En enkel klass som representerar en person med namn
 * och ålder. Metoder finns for att både sätta och hämta
 * värden samt för att skriva ut information om personen.
 *
 * @author Robert Jonsson
 * @version 3.0
 */
public class Person {
    private String name;  // Personens namn
    private int age;      // Personens ålder

    // Konstroktorer
    public Person(String name, int age) {
        this.name   = name;
        this.age  = age;
    }

    public Person() {
      this("unknown", -1);
    }

    // Metoder for att sätta värden
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Metoder som returnerar värden
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    //Sriver ut information om personen på skärmen
    public void print() {
        System.out.println("Name\t" + name);
        System.out.println("Age\t" + age);
    }

    // Överskuggar metoden toString och returnerar namnet på personen
    @Override
    public String toString() {
        return name;
    }
}
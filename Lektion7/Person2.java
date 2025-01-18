/**
 * Ex07_10 - Person2
 *
 * En enkel klass som representerar en person med namn
 * och ålder. Metoder finns för att både sätta och hämta
 * värden samt för att skriva ut information om personen.
 *
 * Klassen implementerat gränssnittet Combarable för att
 * kunna jämföra två personer med varandra. Detta kan t.ex 
 * vara användbart för att sortera Person-objekt.
 *
 * @author Robert Jonsson
 */
public class Person2 implements Comparable {
    private String name;  // Personens namn
    private int age;      // Personens ålder

    // Konstroktorer
    public Person2(String name, int age) {
        this.name   = name;
        this.age  = age;
    }

    public Person2() {
      this("unknown", -1);
    }

    // Metoder för att sätta värden
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

    // Överskuggar metoden toString och returnerar namnet och ålder på personen
    @Override
    public String toString() {
        return name + " (" + age + ")";
    }

  // Metoden Comparable jämför aktuellt Person-objekt (this)
  // med det objekt som skickas som parameter till metoden.
  // Vi väljer att göra jämförelsen efter personens ålder. Metoden
  // returnerar -1, 0 eller 1 beroende på om detta objekts
  // ålder är mindre än, lika eller större än det andra
  // objektets ålder.
  @Override
  public int compareTo(Object other) {
    // Börjar med att konvertera från Object till Person
    Person2 otherPerson = (Person2)other;

    // Gör nu jämförelsen
    if (this.age < otherPerson.age) {
      return -1;
    }
    else if (this.age == otherPerson.age) {
      return 0;
    }
    else {
      return 1;
    }
    
    // Observer att denna metod inte är riktigt komplett.
    // Vi bör givetvis kontrollera så att bl.a Object o 
    // verkligen går att konvertera till ett Person-objekt.
    // if (other instanceof Person2)
  }
}
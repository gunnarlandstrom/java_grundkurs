/**
 * Ex05_09 - Employee1
 *
 * Denna klass representerar en anställd vid ett företag. 
 * Klassen utökar klassen Person med instansvariabeln företag, 
 * samt metoder för att sätta/hämta detta värde. Metoden print
 * överskuggasföratt skriva ut även företaget.
 */
public class Employee1 extends Person {
    // Instansvariabler
    private String company;
    
    // Konstruktor
    public Employee1(String name, int age, String company) {
        // Anropar superklassens konstruktor för att initiera namn och ålder på den anställde
        super(name, age);

        // Eftersom company tillhör denna klass initieras den här
        this.company = company;
    }

    // Sätter nytt företag
    public void setCompany(String company) {
        this.company = company;
    }

    // Returnerar värdet på instansvariabeln company
    public String getCompany() {
        return company;
    }

    // Metod for att sparka den anställde
    public void layOff() {
        company = "unknown";
    }

    // Överskuggar metoden print så att instansvariablerna även
    // i denna klass skrivs ut på skärmen
    public void print() {
        // Anropar först superklassens print-metod
        super.print();
        
        // Skriver därefter ut insantsvariabeln i denna klass
        System.out.println("Company\t" + company);
    }

    // Överskuggar toString för att returnera en strängrepresentation
    // av en anställd. Vi bestämmer att den ska bestå av namn och vilket 
    // företag personen jobbar på (eller unemployed om company är lika
    // med "unknown".
    @Override
    public String toString() {
        // Vi måste anropa getName för att namnet på barnet
        // Använder villkorsoperatorn för attavgöra om namnet på 
        // företaget eller unemployed ska skrivasut.
        String employed = company.equals("unknown") ? "unemployed" : company;
        return String.format("%s (%s)", getName(), employed);
    } 
}
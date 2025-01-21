/**
 * Ex05_05 - Child1
 *
 * Denna klass representerar ett barn och utökar (ärver från)
 * klassen Person. Klassen utökas med instansvariabelel för veckopeng,
 * samt metoder for att sätta/ändra/öka detta.
 *
 * @author Robert Jonsson
 */

package lektioner.Lektion5;

public class Child1 extends Person {
    // Instansvariabler
    private int weeklyAllowance;

    // Konstruktor
    public Child1(String name, int age, int weeklyAllowance) {
        // Anropar superklassens konstruktor för att initiera namn och ålder på personen
        super(name, age);

        // Eftersom veckopengen tillhör denna klass initieras den här
        this.weeklyAllowance = weeklyAllowance;
    }

    // Metod for att sätta ny veckopeng
    public void setWeeklyAllowance(int weeklyAllowance) {
        this.weeklyAllowance = weeklyAllowance;
    }

    // Returnerar veckopengen
    public int getWeeklyAllowance() {
        return weeklyAllowance;
    }

    // Metod för att öka veckopengen
    public void increaseWeeklyAllowance(int increase) {
        weeklyAllowance += increase;
    }

    // Överskuggar toString för att returnera en strängrepresentation
    // av ett barn. Vi bestämmer att den ska bestå av namn och veckopeng
    @Override
    public String toString() {
        // Vi måste anropa getName för att namnet på barnet
        return String.format("%s (%d kr)", getName(), weeklyAllowance);
    }
}
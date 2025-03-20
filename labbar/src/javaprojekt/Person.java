package javaprojekt;

public class Person extends Address {
    
private String personFirstName;
private String personLastName;
private String userName;
private int personHeight;
private static int amountOfPersons = -1;
@SuppressWarnings("unused")
private Address newAddress;


// Constructors
public Person(){
    @SuppressWarnings("unused")
    Address newAdress = new Address();
    amountOfPersons++;
}
public Person(String userName, String firstName, String lastName, int height, Address address){
    this.userName = userName;
    this.personFirstName = firstName;
    this.personLastName = lastName;
    this.personHeight = height;
    this.newAddress = address;
    amountOfPersons++;
}


// Setters
public void setUserName(String input){
    this.userName = input;
}

public void setFirstName(String input){

    this.personFirstName = input;
}

public void setLastName(String input){
    this.personLastName = input;
}

public void setHeight(int input){
    this.personHeight = input;
}

public void setAmountOfPersons(int input){
    amountOfPersons += input;

}

// Getters
public String getUserName(){
    return userName;
}

public String getFirstName(){
    return personFirstName;
}
public String getLastName(){
    return personLastName;
}
public int getHeight(){
    return personHeight;
}
public int getAmountOfPersons(){
    return amountOfPersons;
}


public void printPerson(){
    double tempHeight = Double.valueOf(getHeight());
    double k = (tempHeight/100);
    String height = String.format("%.2f", k);
    String name = getFirstName() + " " + getLastName();
    name = String.format("%-30.30s", name);

    System.out.print(" " + getUserName()+ "   " + name + " " + height);
}


}

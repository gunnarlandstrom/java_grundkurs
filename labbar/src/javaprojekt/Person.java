package javaprojekt;

public class Person extends Address {
    
private String personFirstName;
private String personLastName;
private int personHeight;
private static int amountOfPersons = 0;
private Address newAddress;


// Constructors
public Person(){
    Address newAdress = new Address();
    amountOfPersons++;
}
public Person(String firstName, String lastName, int height, Address address){
    this.personFirstName = firstName;
    this.personLastName = lastName;
    this.personHeight = height;
    this.newAddress = address;
    amountOfPersons++;
}


// Setters

public void setFirstName(String input){

    this.personFirstName = input;
}

public void setLastName(String input){
    this.personLastName = input;
}

public void setHeight(int input){
    this.personHeight = input;
}

// Getters
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

// Printer
public void printPerson(){

    System.out.println("First name: " + getFirstName());
    System.out.println("Last name : " + getLastName());
    System.out.println("Height : " + getHeight());
    System.out.println(newAddress.printAdressObject());
    System.out.println("");

}


}

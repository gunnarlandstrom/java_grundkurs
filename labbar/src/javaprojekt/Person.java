package javaprojekt;

public class Person extends Address {
    
private String personFirstName;
private String personLastName;
private int personHeight;
private static int amountOfPersons;

// Constructors
public Person(){
    Address newAdress = new Address();
    amountOfPersons++;
}
public Person(String firstName, String lastName, int height, String address, String zipcode, String residence){
    Address newAdress = new Address(address, zipcode, residence);
    this.personFirstName = firstName;
    this.personLastName = lastName;
    this.personHeight = height;
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


}

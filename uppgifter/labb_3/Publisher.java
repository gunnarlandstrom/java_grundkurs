package labb_3;

/**
 * Filnamn: PublisherTest2.java
 * @author Gunnar Landström
 * @version 1.0
 * Datum: 2025-01-30
 *
 * Description:
 * Declares the class Publisher and the desired methods.
 */

public class Publisher {

    // Variables
    protected String publisherName;
    protected String publisherPhoneNumber;
    private static int publisherAmount;

    // Constructors.
    public Publisher() {
        publisherAmount++;
    }

    public Publisher(String inputName, String inputNumber) {
        publisherAmount++;
        this.publisherName = inputName;
        this.publisherPhoneNumber = inputNumber;
    }


    // Set and get for publisher name.
    public void setPublisherName(String input) {
        this.publisherName = input;
    }

    public String getPublisherName() {
        return publisherName;
    }

    // Set and get for publisher number.
    public void setPublisherPhoneNumber(String input) {
        this.publisherPhoneNumber = input;
    }

    public String getPublisherPhoneNumber() {
        return publisherPhoneNumber;
    }

    // Getter for amount of publisher objects.
    public static int getAmountOfCreatedPublishers() {
        return publisherAmount;
    }

    // Outputs requested publisher.
    public void printPublisher() {
        System.out.println("Publisher's name: " + publisherName);
        System.out.println("Publisher's phone-number: " + publisherPhoneNumber);
        System.out.println("Amount of publishers: " + publisherAmount + "\n");
    }

    public String toString(){

        return getPublisherName() + " "+ getPublisherPhoneNumber() + "\n";
    }
}

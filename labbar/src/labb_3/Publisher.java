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
    private String publisherName;
    private String publisherPhoneNumber;
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


    
    /** 
     * @param input
     */
    // Set and get for publisher name.
    public void setPublisherName(String input) {
        this.publisherName = input;
    }

    
    /** 
     * @return String
     */
    public String getPublisherName() {
        return publisherName;
    }

    
    /** 
     * @param input
     */
    // Set and get for publisher number.
    public void setPublisherPhoneNumber(String input) {
        this.publisherPhoneNumber = input;
    }

    
    /** 
     * @return String
     */
    public String getPublisherPhoneNumber() {
        return publisherPhoneNumber;
    }

    
    /** 
     * @return int
     */
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

    
    /** 
     * @return String
     */
    @Override
    public String toString(){

        return getPublisherName() + " "+ getPublisherPhoneNumber() + "\n";
    }
}

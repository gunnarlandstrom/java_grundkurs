package javaprojekt;

public class Address {
    
    private String homeAddress;
    private String zipCode;
    private String placeOfResidence;

    // Constructors
    public Address(){

    }

    public Address(String inputAddress, String inputZipCode, String inputResidence){
        this.homeAddress = inputAddress;
        this.zipCode = inputZipCode;
        this.placeOfResidence = inputResidence;
    }

    // Setters
    public void setHomeAddress(String input){
        this.homeAddress = input;
    }
    public void setZipCode(String input){
        this.zipCode = input;
    }
    public void setPlaceOfResidence(String input){
        this.placeOfResidence = input;
    }

    // Getters

    public String getHomeAddress(){
        return homeAddress;
    }
    public String getZipCode(){
        return zipCode;
    }
    public String getPlaceOfResidence(){
        return placeOfResidence;
    }

    public String printAdressObject(){

        return "Address: " + homeAddress + "\n" + "Zipcode: " + zipCode + "\n" + "Residence: " + placeOfResidence;
    }


}

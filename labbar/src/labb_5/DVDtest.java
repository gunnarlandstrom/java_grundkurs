package labb_5;

public class DVDtest extends DVD {

    public static void main(String[] args){

        
        DVD dvd1 = new DVD("Kalle Kongo", 327, 13, new Publisher());
        
        dvd1.getDvdLength();
    }

}

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ERyder bike1 = new ERyder(
            101,          
            85,         
            true,       
            120.5,        
            "Genshin Impact",   
            "123-456-7890"
        );
        ERyder bike2 = new ERyder(
            102,          
            60,           
            true,         
            80.2,       
            "Shimokita", 
            "114-514-1919-810"
        );
        bike1.printRideDetails(15); 
        bike2.printRideDetails(30);
        String sent1 = "I was very satisfied with the service.";
        String sent2 = "The e-Bike is quite comfortable to ride.";
        String sent3 = "The battery life of the e-Bike is impressive.";
        String sent4 = "The customer support was helpful and responsive.";
        String sent5 = "I would recommend this e-Bike to my friends and family.";
        Feedback userFeedback = new Feedback("wozhen", "fule", "antabaka@9999.com");
        userFeedback.analyseFeedback(false, sent1, sent2, sent3, sent4, sent5);
        System.out.println("\n" + userFeedback);
    }
}


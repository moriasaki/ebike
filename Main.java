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
        System.out.println("\nNote: calculateFare() is private - cannot call directly!");
    }
}

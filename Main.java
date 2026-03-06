public class Main {
    public static void main(String[] args) {
        ERyder bike1 = new ERyder();
        System.out.println("Bike 1 (Default Constructor):");
        bike1.printBikeDetails();
        ERyder bike2 = new ERyder(101, 85, true, 120.5);
        System.out.println("Bike 2 (Parameterized Constructor):");
        bike2.ride(); 
        bike2.printBikeDetails(); 
    }
}
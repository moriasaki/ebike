public class ERyder {
    int bikeID;
    int batteryLevel;
    boolean isAvailable;
    double kmDriven;
    public ERyder() {}
    public ERyder(int bikeID, int batteryLevel, boolean isAvailable, double kmDriven) {
        this.bikeID = bikeID;
        this.setBatteryLevel(batteryLevel); 
        this.isAvailable = isAvailable;
        this.kmDriven = kmDriven;
    }
    public void ride() {
        if (batteryLevel > 0 && isAvailable) {
            System.out.println("Bike " + bikeID + " is available");
        } else {
            System.out.println("Bike " + bikeID + " is not available");
        }
    }
    public void printBikeDetails() {
        System.out.println("Bike ID: " + bikeID);
        System.out.println("Battery: " + batteryLevel + "%");
        System.out.println("Available: " + isAvailable);
        System.out.println("Total KM: " + kmDriven);
        System.out.println("-------------------"); 
    }
    public void setBatteryLevel(int batteryLevel) {
        if (batteryLevel >= 0 && batteryLevel <= 100) {
            this.batteryLevel = batteryLevel;
        } else {
            this.batteryLevel = 0; 
        }
    }
    public int getBikeID() { return bikeID; }
    public int getBatteryLevel() { return batteryLevel; }
    public boolean isAvailable() { return isAvailable; }
    public double getKmDriven() { return kmDriven; }
    public void setBikeID(int bikeID) { this.bikeID = bikeID; }
    public void setAvailable(boolean isAvailable) { this.isAvailable = isAvailable; }
    public void setKmDriven(double kmDriven) { this.kmDriven = kmDriven; }
}

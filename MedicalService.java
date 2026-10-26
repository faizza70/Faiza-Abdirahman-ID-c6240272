public abstract class MedicalService {
    protected String serviceId;
    protected String serviceName;
    protected double baseCost;

    public MedicalService(String serviceId, String serviceName, double baseCost) {
        this.serviceId = serviceId;
        this.serviceName = serviceName;
        this.baseCost = baseCost;
    }

    // Abstract method (no body)
    public abstract double calculateTotalCost();

    // Concrete method
    public void displayServiceInfo() {
        System.out.println("Service ID: " + serviceId);
        System.out.println("Service: " + serviceName);
        System.out.printf("Total Cost: $%.2f\n", calculateTotalCost());
        System.out.println();
    }
}
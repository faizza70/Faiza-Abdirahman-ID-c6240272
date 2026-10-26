public class Ultrasound extends MedicalService {
    private double additionalFee;

    public Ultrasound(String serviceId, String serviceName, double baseCost, double additionalFee) {
        super(serviceId, serviceName, baseCost);
        this.additionalFee = additionalFee;
    }

    @Override
    public double calculateTotalCost() {
        return baseCost + additionalFee;
    }
}
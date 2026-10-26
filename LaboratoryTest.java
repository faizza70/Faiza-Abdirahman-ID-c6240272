public class LaboratoryTest extends MedicalService {
    private double testCharge;

    public LaboratoryTest(String serviceId, String serviceName, double baseCost, double testCharge) {
        super(serviceId, serviceName, baseCost);
        this.testCharge = testCharge;
    }

    @Override
    public double calculateTotalCost() {
        return baseCost + testCharge;
    }
}
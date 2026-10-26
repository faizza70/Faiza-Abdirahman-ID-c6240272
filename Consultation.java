public class Consultation extends MedicalService {
    private double doctorFee;

    public Consultation(String serviceId, String serviceName, double baseCost, double doctorFee) {
        super(serviceId, serviceName, baseCost);
        this.doctorFee = doctorFee;
    }

    @Override
    public double calculateTotalCost() {
        return baseCost + doctorFee;
    }
}
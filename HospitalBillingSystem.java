public class HospitalBillingSystem {
    public static void main(String[] args) {
        MedicalService[] services = new MedicalService[3];
        services[0] = new Consultation("S001", "Consultation", 15.0, 10.0);
        services[1] = new LaboratoryTest("S002", "Laboratory Test", 10.0, 8.0);
        services[2] = new Ultrasound("S003", "Ultrasound", 25.0, 15.0);

        System.out.println("===== HOSPITAL BILLING SYSTEM =====\n");

        double totalHospitalBill = 0.0;

        for (int i = 0; i < services.length; i++) {
            services[i].displayServiceInfo();
            totalHospitalBill += services[i].calculateTotalCost();
        }

        System.out.println("------------------------------");
        System.out.printf("Total Hospital Bill: $%.2f\n", totalHospitalBill);
    }
}
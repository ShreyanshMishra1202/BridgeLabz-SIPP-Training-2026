abstract class Patient {
    private int patientId;
    private String name;
    private int age;

    public Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract double calculateBill();

    public void displayPatientDetails() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class InPatient extends Patient {
    private double roomCharges;
    private double treatmentCharges;

    public InPatient(int patientId, String name, int age,
                     double roomCharges, double treatmentCharges) {
        super(patientId, name, age);
        this.roomCharges = roomCharges;
        this.treatmentCharges = treatmentCharges;
    }

    @Override
    public double calculateBill() {
        return roomCharges + treatmentCharges;
    }
}

class OutPatient extends Patient {
    private double consultationFees;
    private double treatmentCharges;

    public OutPatient(int patientId, String name, int age,
                      double consultationFees, double treatmentCharges) {
        super(patientId, name, age);
        this.consultationFees = consultationFees;
        this.treatmentCharges = treatmentCharges;
    }

    @Override
    public double calculateBill() {
        return consultationFees + treatmentCharges;
    }
}

public class HospitalPatientManagementSystem {
    public static void main(String[] args) {

        InPatient inPatient =
                new InPatient(101, "Amit", 22, 5000, 3000);

        OutPatient outPatient =
                new OutPatient(102, "Rahul", 25, 500, 1500);

        System.out.println("InPatient Details:");
        inPatient.displayPatientDetails();
        System.out.println("Bill Amount: " + inPatient.calculateBill());

        System.out.println();

        System.out.println("OutPatient Details:");
        outPatient.displayPatientDetails();
        System.out.println("Bill Amount: " + outPatient.calculateBill());
    }
}

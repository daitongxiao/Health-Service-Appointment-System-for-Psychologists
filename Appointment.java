/**
 * Represents an appointment made by a patient.
 * Demonstrates composition and polymorphism.
 */
public class Appointment {
    private String patientName;
    private String patientPhone;
    private String timeSlot;
    private HealthProfessional doctor;

    // Default constructor
    public Appointment() {
        this.patientName = "Unknown";
        this.patientPhone = "Unknown";
        this.timeSlot = "Unknown";
        this.doctor = null;
    }

    // Constructor with parameters
    public Appointment(String patientName, String patientPhone, String timeSlot, HealthProfessional doctor) {
        this.patientName = patientName;
        this.patientPhone = patientPhone;
        this.timeSlot = timeSlot;
        this.doctor = doctor;
    }

    // Getters
    public String getPatientName() {
        return patientName;
    }

    public String getPatientPhone() {
        return patientPhone;
    }

    public String getTimeSlot() {
        return timeSlot;
    }

    public HealthProfessional getDoctor() {
        return doctor;
    }

    // Print appointment details
    public void printAppointmentDetails() {
        System.out.println("Patient Name: " + patientName);
        System.out.println("Phone: " + patientPhone);
        System.out.println("Time Slot: " + timeSlot);
        System.out.print("Doctor Details:\n");
        doctor.printDetails();
    }
}

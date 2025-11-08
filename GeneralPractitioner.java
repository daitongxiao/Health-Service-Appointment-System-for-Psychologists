/**
 * Represents a general practitioner.
 * Inherits from HealthProfessional.
 */
public class GeneralPractitioner extends HealthProfessional {
    private String specialty;

    // Default constructor
    public GeneralPractitioner() {
        super();
        this.specialty = "General Medicine";
    }

    // Constructor with parameters
    public GeneralPractitioner(int id, String name, String specialty) {
        super(id, name);
        this.specialty = specialty;
    }

    // Getters and setters
    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    // Override printDetails method
    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Specialty: " + specialty);
    }
}

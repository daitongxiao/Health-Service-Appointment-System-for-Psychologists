/**
 * Represents a psychologist.
 * Demonstrates inheritance and method overriding.
 */
public class Psychologist extends HealthProfessional {
    private String therapeuticApproach;

    // Default constructor
    public Psychologist() {
        super();
        this.therapeuticApproach = "Cognitive Behavioral Therapy";
    }

    // Constructor with parameters
    public Psychologist(int id, String name, String therapeuticApproach) {
        super(id, name);
        this.therapeuticApproach = therapeuticApproach;
    }

    // Getters and setters
    public String getTherapeuticApproach() {
        return therapeuticApproach;
    }

    public void setTherapeuticApproach(String therapeuticApproach) {
        this.therapeuticApproach = therapeuticApproach;
    }

    // Override printDetails method
    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Therapeutic Approach: " + therapeuticApproach);
    }
}

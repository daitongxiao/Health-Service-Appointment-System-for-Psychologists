/**
 * Base class for all health professionals.
 * Demonstrates encapsulation and inheritance.
 */
public class HealthProfessional {
    private int id;
    private String name;

    // Default constructor
    public HealthProfessional() {
        this.id = 0;
        this.name = "Unknown";
    }

    // Constructor with parameters
    public HealthProfessional(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Method to print details (can be overridden)
    public void printDetails() {
        System.out.println("Health Professional ID: " + id);
        System.out.println("Name: " + name);
    }
}

/**
 * Demonstrates Part 3 & Part 5 of the assessment.
 * Shows object creation, inheritance, polymorphism, and collection management.
 */
public class Main {
    public static void main(String[] args) {
        // ============================
        // Part 3 – Using classes and objects
        // ============================

        System.out.println("=== Part 3: Creating Health Professionals ===");
        GeneralPractitioner gp1 = new GeneralPractitioner(101, "Dr. Smith", "Family Medicine");
        Psychologist psy1 = new Psychologist(201, "Dr. Emily", "Cognitive Behavioral Therapy");

        gp1.printDetails();
        System.out.println("------------------------------");
        psy1.printDetails();
        System.out.println("==============================\n");

        // ============================
        // Part 5 – Collection of appointments
        // ============================
        System.out.println("=== Part 5: Managing Appointments ===");
        AppointmentSystem system = new AppointmentSystem();

        // Create appointments
        Appointment a1 = new Appointment("Alice", "111111111", "09:00", gp1);
        Appointment a2 = new Appointment("Bob", "222222222", "10:30", psy1);
        Appointment a3 = new Appointment("Carol", "333333333", "11:15", gp1);
        Appointment invalid = new Appointment("", "", "13:00", null); // invalid appointment test

        system.createAppointment(a1);
        system.createAppointment(a2);
        system.createAppointment(a3);
        system.createAppointment(invalid); // test validation

        System.out.println("\n--- Existing Appointments ---");
        system.printExistingAppointments();

        System.out.println("\n--- Cancel Appointment ---");
        system.cancelAppointment("222222222"); // cancel Bob's appointment

        System.out.println("\n--- Updated Appointments ---");
        system.printExistingAppointments();
    }
}

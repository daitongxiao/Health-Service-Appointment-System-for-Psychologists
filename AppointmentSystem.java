import java.util.ArrayList;

/**
 * Manages all appointment operations.
 * Demonstrates collection use and data validation.
 */
public class AppointmentSystem {
    private ArrayList<Appointment> appointments;

    public AppointmentSystem() {
        this.appointments = new ArrayList<>();
    }

    /**
     * Create and add an appointment with validation.
     */
    public void createAppointment(Appointment appointment) {
        if (appointment == null || appointment.getPatientName().isEmpty() || 
            appointment.getPatientPhone().isEmpty() || appointment.getDoctor() == null) {
            System.out.println("❌ Invalid appointment data. Appointment not created.");
            return;
        }
        appointments.add(appointment);
        System.out.println("✅ Appointment successfully created for " + appointment.getPatientName());
    }

    /**
     * Print all existing appointments.
     */
    public void printExistingAppointments() {
        if (appointments.isEmpty()) {
            System.out.println("⚠️ No existing appointments.");
        } else {
            System.out.println("📋 Existing Appointments:");
            for (Appointment app : appointments) {
                app.printAppointmentDetails();
                System.out.println("------------------------------");
            }
        }
    }

    /**
     * Cancel appointment by patient's phone number.
     */
    public void cancelAppointment(String patientPhone) {
        boolean found = false;
        for (int i = 0; i < appointments.size(); i++) {
            if (appointments.get(i).getPatientPhone().equals(patientPhone)) {
                appointments.remove(i);
                System.out.println("🗑️ Appointment cancelled for phone: " + patientPhone);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("❌ No appointment found for phone: " + patientPhone);
        }
    }
}

package collections;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.Objects;

class Appointment implements Comparable<Appointment> {
    private String patientName;
    private LocalDateTime dateTime;

    public Appointment(String patientName, LocalDateTime dateTime) {
        this.patientName = patientName;
        this.dateTime = dateTime;
    }

    public String getPatientName() {
        return patientName;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

   
    public int compareTo(Appointment other) {
        return this.dateTime.compareTo(other.dateTime);
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Appointment)) return false;
        Appointment other = (Appointment) obj;
        return Objects.equals(patientName, other.patientName) &&
               Objects.equals(dateTime, other.dateTime);
    }

    public int hashCode() {
        return Objects.hash(patientName, dateTime);
    }

    public void display() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        System.out.println("Patient: " + patientName + ", Appointment: " + dateTime.format(formatter));
    }
}

public class AppointmentManager {
    public static void main(String[] args) {
        TreeSet<Appointment> appointments = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");

        while (true) {
            System.out.println("\n--- Appointment Manager ---");
            System.out.println("1. Add Appointment");
            System.out.println("2. Show All Appointments");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter patient name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter appointment date and time (dd-MM-yyyy HH:mm): ");
                    String dateTimeInput = scanner.nextLine();

                    try {
                        LocalDateTime dateTime = LocalDateTime.parse(dateTimeInput, formatter);
                        Appointment newAppointment = new Appointment(name, dateTime);
                        if (appointments.add(newAppointment)) {
                            System.out.println("Appointment added successfully.");
                        } else {
                            System.out.println("Duplicate appointment! Not added.");
                        }
                    } catch (Exception e) {
                        System.out.println("Invalid date/time format.");
                    }
                    break;

                case 2:
                    if (appointments.isEmpty()) {
                        System.out.println("No appointments scheduled.");
                    } else {
                        System.out.println("Scheduled Appointments (Chronological):");
                        for (Appointment appt : appointments) {
                            appt.display();
                        }
                    }
                    break;

                case 3:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
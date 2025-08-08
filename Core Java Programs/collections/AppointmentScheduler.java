package collections;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import java.util.TreeMap;

public class AppointmentScheduler {
    public static void main(String[] args) {
        TreeMap<LocalTime, String> appointments = new TreeMap<>();

        appointments.put(LocalTime.of(9, 0), "Sana");        
        appointments.put(LocalTime.of(13, 0), "Suma");       
        appointments.put(LocalTime.of(10, 30), "Sai");       
        appointments.put(LocalTime.of(11, 0), "Sam"); 
        
        System.out.println("All Appointments (Ascending Order):");
        printAppointments(appointments);

        appointments.remove(LocalTime.of(10, 30));
        System.out.println("\nAfter removing 10:30 AM appointment:");
        printAppointments(appointments);

        String patient = appointments.remove(LocalTime.of(11, 0));
        appointments.put(LocalTime.of(11, 30), patient);
        System.out.println("\nAfter rescheduling Sam to 11:30 AM:");
        printAppointments(appointments);

        LocalTime nextTime = appointments.firstKey();
        System.out.println("\nNext Appointment:");
        System.out.println("Time: " + formatTime(nextTime) + ", Patient: " + appointments.get(nextTime));

        LocalTime lastTime = appointments.lastKey();
        System.out.println("\nLast Appointment:");
        System.out.println("Time: " + formatTime(lastTime) + ", Patient: " + appointments.get(lastTime));
    }
    
    private static void printAppointments(TreeMap<LocalTime, String> map) {
        for (Map.Entry<LocalTime, String> entry : map.entrySet()) {
            System.out.println("Time: " + formatTime(entry.getKey()) + ", Patient: " + entry.getValue());
        }
    }

    private static String formatTime(LocalTime time) {
        return time.format(DateTimeFormatter.ofPattern("hh:mm a"));
    }

   
}
package collections;

import java.util.HashMap;

class Patient3 {
    private int id;
    private String name;
    private String disease;

    public Patient3(int id, String name, String disease) {
        this.id = id;
        this.name = name;
        this.disease = disease;
    }

    
    public String toString() {
        return "Patient ID: " + id + ", Name: " + name + ", Disease: " + disease;
    }
}

public class HospitalMap {
    public static void main(String[] args) {
        HashMap<Integer, Patient3> patientMap = new HashMap<>();

        patientMap.put(101, new Patient3(101, "Bhargavi", "Fever"));
        patientMap.put(102, new Patient3(102, "Prasanna", "Cold"));
        patientMap.put(103, new Patient3(103, "Munny", "Headache"));

        System.out.println("\nGet Patient With ID 102:");
        System.out.println(patientMap.get(102));

        System.out.println("\nDoes Patient With ID 101 exist?");
        System.out.println(patientMap.containsKey(101)); 

        System.out.println("\nDoes Patient With ID 104 exist?");
        System.out.println(patientMap.containsKey(104)); 

        System.out.println("\nTotal Patients:");
        System.out.println(patientMap.size());

        System.out.println("\nUpdate Patient With ID 102:");
        patientMap.put(103, new Patient3(103, "Sai", "Pain"));
        System.out.println(patientMap.get(103));  

        System.out.println("\nIs the patient map empty?");
        System.out.println(patientMap.isEmpty()); 
        
        System.out.println("\nRemove patient");
        System.out.println(patientMap.remove(102));
        
        System.out.println("\nRetrive all patients:");
        System.out.println(patientMap.entrySet());
        
        System.out.println("\nClear all");
        patientMap.clear();

        }
}
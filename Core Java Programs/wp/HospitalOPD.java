package wp;

import java.util.ArrayList;
import java.util.Scanner;

class Patient {
    private String name;
    private int age;
    private String disease;

    public Patient(String name, int age, String disease) {
        this.name = name;
        this.age = age;
        this.disease = disease;
    }

    public String getName() {
        return name;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Disease: " + disease);
    }
}

public class HospitalOPD {
    public static void main(String[] args) {
    	
        ArrayList<Patient> patientList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Hospital OPD Menu ---");
            System.out.println("1. Add New Patient");
            System.out.println("2. View All Patients");
            System.out.println("3. Patient by Index");
            System.out.println("4. Update Patient Disease");
            System.out.println("5. Remove Patient by Index");
            System.out.println("6. Remove Patient by Name");
            System.out.println("7. Check if Patient Exists");
            System.out.println("8. Show Total Patients");
            System.out.println("9. Clear All Records");
            System.out.println("10. Check if List is Empty");
            System.out.println("11. Exit");
            System.out.print("Choose option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter disease: ");
                    String disease = scanner.nextLine();
                    patientList.add(new Patient(name, age, disease));
                    System.out.println("Patient added.");
                    break;

                case 2:
                    if (patientList.isEmpty()) {
                        System.out.println("No patients.");
                    } else {
                        for (int i = 0; i < patientList.size(); i++) {
                            System.out.println("\nPatient #" + (i + 1));
                            patientList.get(i).displayDetails();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter index: ");
                    int index = scanner.nextInt();
                    scanner.nextLine();
                    if (index >= 0 && index < patientList.size()) {
                        patientList.get(index).displayDetails();
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;

                case 4:
                    System.out.print("Enter name to update disease: ");
                    String searchName = scanner.nextLine();
                    boolean updated = false;
                    for (Patient p : patientList) {
                        if (p.getName().equalsIgnoreCase(searchName)) {
                            System.out.print("Enter new disease: ");
                            String newDisease = scanner.nextLine();
                            p.setDisease(newDisease);
                            System.out.println("Updated.");
                            updated = true;
                            break;
                        }
                    }
                    if (!updated) {
                        System.out.println("Patient not found.");
                    }
                    break;

                case 5:
                    System.out.print("Enter index to remove: ");
                    int removeIndex = scanner.nextInt();
                    scanner.nextLine();
                    if (removeIndex >= 0 && removeIndex < patientList.size()) {
                        patientList.remove(removeIndex);
                        System.out.println("Removed.");
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;

                case 6:
                    System.out.print("Enter name to remove: ");
                    String removeName = scanner.nextLine();
                    boolean removed = false;
                    for (int i = 0; i < patientList.size(); i++) {
                        if (patientList.get(i).getName().equalsIgnoreCase(removeName)) {
                            patientList.remove(i);
                            System.out.println("Removed.");
                            removed = true;
                            break;
                        }
                    }
                    if (!removed) {
                        System.out.println("Patient not found.");
                    }
                    break;

                case 7:
                    System.out.print("Enter name to check: ");
                    String checkName = scanner.nextLine();
                    boolean exists = false;
                    for (Patient p : patientList) {
                        if (p.getName().equalsIgnoreCase(checkName)) {
                            exists = true;
                            break;
                        }
                    }
                    if (exists) {
                        System.out.println("Patient exists.");
                    } else {
                        System.out.println("Patient not found.");
                    }
                    break;

                case 8:
                    System.out.println("Total patients: " + patientList.size());
                    break;

                case 9:
                    patientList.clear();
                    System.out.println("All records cleared.");
                    break;

                case 10:
                    if (patientList.isEmpty()) {
                        System.out.println("List is empty.");
                    } else {
                        System.out.println("List is not empty.");
                    }
                    break;

                case 11:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}

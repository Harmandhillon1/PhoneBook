// Harman Dhillon
// PhoneBook Assignment 2 CS145
// 11/01/24


import java.util.Scanner;

public class TestClass {
    public static void main(String[] args) {
        PhoneBookManager manager = new PhoneBookManager(); // Create an instance of PhoneBookManager
        Scanner scanner = new Scanner(System.in); // Create a scanner object for user input
        String choice;

        do {
            // Display the menu options for the user
            System.out.println("\nPhone Book Manager");
            System.out.println("1. Add Entry");
            System.out.println("2. Modify Entry");
            System.out.println("3. Delete Entry");
            System.out.println("4. Print Entries");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextLine(); // Read the user's choice

            // Switch case to handle user choices
            switch (choice) {
                case "1": // Add Entry
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine(); // Get the name from user
                    System.out.print("Enter address: ");
                    String address = scanner.nextLine(); // Get the address from user
                    System.out.print("Enter city: ");
                    String city = scanner.nextLine(); // Get the city from user
                    System.out.print("Enter phone number: ");
                    String phoneNumber = scanner.nextLine(); // Get the phone number from user
                    manager.addEntry(name, address, city, phoneNumber); // Add the entry to the phone book
                    break;
                case "2": // Modify Entry
                    System.out.print("Enter name of the entry to modify: ");
                    String modifyName = scanner.nextLine(); // Get the name of the entry to modify
                    System.out.print("Enter new address: ");
                    String newAddress = scanner.nextLine(); // Get the new address
                    System.out.print("Enter new city: ");
                    String newCity = scanner.nextLine(); // Get the new city
                    System.out.print("Enter new phone number: ");
                    String newPhoneNumber = scanner.nextLine(); // Get the new phone number
                    manager.modifyEntry(modifyName, newAddress, newCity, newPhoneNumber); // Modify the entry
                    break;
                case "3": // Delete Entry
                    System.out.print("Enter name of the entry to delete: ");
                    String deleteName = scanner.nextLine(); // Get the name of the entry to delete
                    manager.deleteEntry(deleteName); // Delete the entry from the phone book
                    break;
                case "4": // Print Entries
                    manager.printEntries(); // Print all entries in the phone book
                    break;
                case "5": // Exit
                    System.out.println("Goodbye!"); // exit
                    break;
                default: // Handle invalid choices
                    System.out.println("Invalid choice, please try again."); // Prompt for valid input
            }
        } while (!choice.equals("5")); // Repeat until the user chooses to exit

        scanner.close(); // Close the scanner resource
    }
}

// Harman Dhillon
// PhoneBook Assignment 2 CS145
// 11/01/24

import java.util.Scanner;

public class PhoneBookManager {
    private PhoneBookNode head; // Head node of the linked list for the phone book

    // Method to add a new entry to the phone book
    public void addEntry(String name, String address, String city, String phoneNumber) {
        PhoneBookNode newNode = new PhoneBookNode(name, address, city, phoneNumber); // Create a new node for the entry
        if (head == null) { // If the phone book is empty
            head = newNode; // Set the new node as the head
        } else {
            PhoneBookNode current = head; // Start at the head
            while (current.next != null) { 
                current = current.next;
            }
            current.next = newNode; // Add the new node at the end of the list
        }
        sortEntries(); // Sort entries after adding a new entry
    }

    // Method to sort entries in the phone book by name
    private void sortEntries() {
        if (head == null || head.next == null) return; // Return if the list is empty or has one node

        PhoneBookNode sorted = null; // Initialize sorted list

        while (head != null) {
            PhoneBookNode current = head; // Get the current node
            head = head.next; // Move head to the next node

            // Insert the current node into the sorted list
            if (sorted == null || sorted.name.compareTo(current.name) >= 0) {
                current.next = sorted; // Insert at the beginning of sorted
                sorted = current; // Update sorted to be the current node
            } else {
                PhoneBookNode temp = sorted; // Start from the sorted list
                // Find the appropriate position to insert
                while (temp.next != null && temp.next.name.compareTo(current.name) < 0) {
                    temp = temp.next;
                }
                current.next = temp.next; // Insert the current node
                temp.next = current; // Link previous node to the current
            }
        }
        head = sorted; // Update head to the sorted list
    }

    // Method to modify an existing entry
    public void modifyEntry(String name, String newAddress, String newCity, String newPhoneNumber) {
        PhoneBookNode current = head; // Start from the head
        while (current != null) { 
            if (current.name.equalsIgnoreCase(name)) { // Check if the current node matches the name
                // Update the entry details
                current.address = newAddress;
                current.city = newCity;
                current.phoneNumber = newPhoneNumber;
                return; // Exit after modifying
            }
            current = current.next; // Move to the next node
        }
        System.out.println("Entry not found."); // If no matching entry is found
    }

    // Method to delete an entry by name
    public void deleteEntry(String name) {
        if (head == null) return; // If the phone book is empty

        // Check if the head node is the one to delete
        if (head.name.equalsIgnoreCase(name)) {
            head = head.next; // Move head to the next node
            return; // Exit after delete
        }

        PhoneBookNode current = head; // Start from the head
        
        while (current.next != null) {
            if (current.next.name.equalsIgnoreCase(name)) { // Check if the next node matches the name
                current.next = current.next.next; // Bypass the node to delete it
                return; // Exit after delete
            }
            current = current.next; // Move to the next node
        }
        System.out.println("Entry not found."); // If no matching entry is found
    }

    // Method to print all entries in the phone book
    public void printEntries() {
        PhoneBookNode current = head; // Start from the head
        while (current != null) { 
            System.out.println(current); // Print the current node
            current = current.next; // Move to the next node
        }
    }
}

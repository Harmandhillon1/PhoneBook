// Harman Dhillon
// PhoneBook Assignment 2 CS145
// 11/01/24


public class PhoneBookNode {
    String name; // The name of the contact
    String address; // The address of the contact
    String city; // The city of the contact
    String phoneNumber; // The phone number of the contact
    PhoneBookNode next; // Reference to the next node in the linked list

    // Constructor to initialize a new PhoneBookNode with contact details
    public PhoneBookNode(String name, String address, String city, String phoneNumber) {
        this.name = name; // Assign the name
        this.address = address; // Assign the address
        this.city = city; // Assign the city
        this.phoneNumber = phoneNumber; // Assign the phone number
        this.next = null; // Initialize the next reference to null
    }

    // Override the toString method to provide a string representation of the PhoneBookNode
    @Override
    public String toString() {
        return "Name: " + name + ", Address: " + address + ", City: " + city + ", Phone: " + phoneNumber; // Format the output
    }
}

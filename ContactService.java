/* Matthew Keaton  
 * Date: 03/23/2025
 * Course: CS 320
 * Assignment: 3-2 Milestone Contact Service
 */

import java.util.Vector;

public class ContactService {
	
	// Create Vector to store and access data
	private Vector<Contact> contactList;
	
	// Constructor and initialize contactList
	public ContactService() {
		contactList = new Vector<>();
	}
	
	// Add new contactId
	public boolean addContact(Contact newContact) {
		//iterate through contactList
		for (int i = 0; i < contactList.size(); ++i) {
			Contact currentContact = contactList.get(i);
			String currentId = currentContact.getcontactId();
			String newId = newContact.getcontactId();
			
			// Condition for new and current Id 
			if (currentId == newId) {
				return false;
			}
		}
		// Add to vector contactList
		contactList.add(newContact);
		return true;		
	}
	
	// Delete a contact by contactId
	public boolean deleteContact(String contactId) {
		
		// Iterate through contactList
		for (int i = 0; i < contactList.size(); ++i) {
			Contact contact = contactList.get(i);
			String currentId = contact.getcontactId();
			
			
			// Condition for matching Id
			if (currentId == contactId) {
				contactList.remove(i); // Remove matching Id from contactList
				return true;
			}
		}
		return false;
	}
	
	// Update first name
	public boolean updateFirstName(String contactId, String newFirstName) {
		
		// Iterate through contactList
		for (int i = 0; i < contactList.size(); ++i) {
			Contact contact = contactList.get(i);
			String currentId = contact.getcontactId();
			
			// Condition if contact found
			if (currentId == contactId) {
				contact.setfirstName(newFirstName); // Update contact using setfirstname method
				return true;
			}
		}
		return false;
	}
	
	// Update last name
	public boolean updateLastName(String contactId, String newLastName) {
		
		// Iterate through contactList
		for (int i = 0; i < contactList.size(); ++i) {
			Contact contact = contactList.get(i);
			String currentId = contact.getcontactId();
			
			
			// Condition for contact found
			if (currentId == contactId) {
				contact.setlastName(newLastName);
				return true;
			}
		}
		return false;
	}
	
	// Update phone number
	public boolean updatePhoneNumber(String contactId, String newPhoneNumber) {
		
		// Iterate through contactList
		for (int i = 0; i < contactList.size(); ++i) {
			Contact contact = contactList.get(i);
			String currentId = contact.getcontactId();
			
			// Condition for contact found
			if (currentId == contactId) {
				contact.setphoneNumber(newPhoneNumber);
				return true;
			}
		}
		return false;
	}
	
	// Update home address
	public boolean updateHomeAddress(String contactId, String newHomeAddress) {
		
		// Iterate through contactList
		for (int i = 0; i < contactList.size(); ++i) {
			Contact contact = contactList.get(i);
			String currentId = contact.getcontactId();
			
			// Condition for contact found
			if (currentId == contactId) {
				contact.sethomeAddress(newHomeAddress);
				return true;
			}
		}
		return false;
	}
	
	// Get a contact by ID
	public Contact getContact(String contactId) {
		
		// Iterate through contactList
		for (int i = 0; i < contactList.size(); ++i) {
			Contact contact = contactList.get(i);
			String currentId = contact.getcontactId();
			
			// Condition for contact found
			if (currentId == contactId) {
				return contact;
			}
		}
		// If contact not found
		return null;
	}
	

}

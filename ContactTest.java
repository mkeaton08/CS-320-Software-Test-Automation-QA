/* Matthew Keaton  
 * Date: 03/23/2025
 * Course: CS 320
 * Assignment: 3-2 Milestone Contact Service
 */


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;



public class ContactTest {

	@Test
	public void testContact() {
		
		// Create a new contact that meets all requirements
		Contact contact = new Contact("555", "Matt","Keaton", "1234567890", "501 superior st");
		assertEquals("555", contact.getcontactId());
		assertEquals("Matt", contact.getfirstName());
		assertEquals("Keaton", contact.getlastName());
		assertEquals("1234567890", contact.getphoneNumber());
		assertEquals("501 superior st", contact.gethomeAddress());
	}
	
	@Test
	public void testcontactId() {
		// throw argument for incorrect contactId
		 assertThrows(IllegalArgumentException.class, () -> new Contact(null, "Matt", "Keaton", "1234567890", "501 superior st"));
	     assertThrows(IllegalArgumentException.class, () -> new Contact("12345678901", "Matt", "Keaton", "1234567890", "501 superior st"));
	    }

	    @Test
	    public void testPhoneNumber() {
	    	// test throw error with invalid phone number
	        assertThrows(IllegalArgumentException.class, () -> new Contact("555", "Matt", "Keaton", "12345678901", "501 superior st"));
	    }

	    @Test
	    public void testUpdateContactFields() {
	    	// create contact with valid data
	        Contact contact = new Contact("1234567890", "Matt", "Keaton", "1234567890", "501 superior st");
	        
	        // check setter with valid data
	        contact.setfirstName("John");
	        contact.setlastName("Smith");
	        contact.setphoneNumber("0987654321");
	        contact.sethomeAddress("east west street");

	        assertEquals("John", contact.getfirstName());
	        assertEquals("Smith", contact.getlastName());
	        assertEquals("0987654321", contact.getphoneNumber());
	        assertEquals("east west street", contact.gethomeAddress());
	    }
	

}

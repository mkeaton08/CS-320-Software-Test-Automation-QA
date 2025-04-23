/* Matthew Keaton  
 * Date: 03/23/2025
 * Course: CS 320
 * Assignment: 3-2 Milestone Contact Service
 */


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ContactServiceTest {
	// declare variables
	private ContactService service;
    private Contact contact;

    @BeforeEach
    public void setup() {
    	// create contact and add to the service
        service = new ContactService();
        contact = new Contact("001", "Matthew", "keaton", "0000000000", "501 superior st");
        service.addContact(contact);
    }

    @Test
    public void testAddDuplicateIdThrowsException() {
    	// check for exception for adding duplicate id
        Contact duplicate = new Contact("001", "Tom", "Hardy", "9998887777", "w hardy Rd");
        assertThrows(IllegalArgumentException.class, () -> {
            service.addContact(duplicate);
        });
    }

    @Test
    public void testDeleteContact() {
    	// test deleting a contact
        service.deleteContact("001");
        assertThrows(IllegalArgumentException.class, () -> {
            service.deleteContact("001");
        });
    }

    @Test
    public void testUpdateFields() {
    	// test with updating all fields 
        service.updateFirstName("001", "Matt");
        service.updateLastName("001", "Keaton");
        service.updatePhoneNumber("001", "5556667777");
        service.updateHomeAddress("001", "501 superior St");

        assertEquals("Matt", contact.getfirstName());
        assertEquals("keaton", contact.getlastName());
        assertEquals("5556667777", contact.getphoneNumber());
        assertEquals("501 superior St", contact.gethomeAddress());
    }

    @Test
    public void testUpdateNonExistentContactThrowsException() {
    	// test updating a non-existing contact
        assertThrows(IllegalArgumentException.class, () -> {
            service.updateFirstName("300", "Spartan");
        });
    }

}

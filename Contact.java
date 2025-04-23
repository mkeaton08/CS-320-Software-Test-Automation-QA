/* Matthew Keaton  
 * Date: 03/23/2025
 * Course: CS 320
 * Assignment: 3-2 Milestone Contact Service
 */


public class Contact {
	
	// Declare variables
	private final String contactId; // final ensures contact Id is not updatable
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String homeAddress;
	
	public Contact(String Id, String first, String last, String phone, String address) {
		
		// Validate fields are non-null and of proper length
		if (Id == null || Id.length() > 10) {
            throw new IllegalArgumentException("Contact ID shall not be null and no longer than 10 characters.");
        }
        if (first == null || first.length() > 10) {
            throw new IllegalArgumentException("First name shall not be null and no longer than 10 characters.");
        }
        if (last == null || last.length() > 10) {
            throw new IllegalArgumentException("Last name shall not be null and no longer than 10 characters.");
        }
        if (phone == null || !phone.matches("\\d{10}")) {
            throw new IllegalArgumentException("Phone number shall not be null and must be exactly 10 digits.");
        }
        if (address == null || address.length() > 30) {
            throw new IllegalArgumentException("Address shall not be null and no longer than 30 characters.");
        }
		
		contactId = Id;
		firstName = first;
		lastName = last;
		phoneNumber = phone;
		homeAddress = address;
	}
	
	// Create setter methods
	public void setfirstName(String first) {
		// Validate input meets requirements
        if (first == null || first.length() > 10) {
            throw new IllegalArgumentException("First name shall not be null and no longer than 10 characters.");
        }
        firstName = first;
    }

    public void setlastName(String last) {
    	// Validate input meets requirements
        if (last == null || last.length() > 10) {
            throw new IllegalArgumentException("Last name shall not be null and no longer than 10 characters.");
        }
        lastName = last;
    }

    public void setphoneNumber(String phone) {
    	// Validate input meets requirements
        if (phone == null || !phone.matches("\\d{10}")) {
            throw new IllegalArgumentException("Phone number must be exactly 10 digits.");
        }
        phoneNumber = phone;
    }

    public void sethomeAddress(String address) {
    	// Validate input meets requirements
        if (address == null || address.length() > 30) {
            throw new IllegalArgumentException("Address shall not be null and no longer than 30 characters.");
        }
        homeAddress = address;
    }
	
	// Create getter methods
	public String getcontactId() {
		return contactId;
	}
	
	public String getfirstName() {
		return firstName;
	}
	
	public String getlastName() {
		return lastName;
	}
	
	public String getphoneNumber() {
		return phoneNumber;
	}
	
	public String gethomeAddress() {
		return homeAddress;
	}
	

}

package model;



import java.util.List;

public class ContactResponse {
    private Long primaryContactId;
    private List<String> emails;
    private List<String> phoneNumbers;
    private List<Long> secondaryContactIds;

    // Constructors, getters, and setters

    public ContactResponse(Long primaryContactId, List<String> emails, List<String> phoneNumbers, List<Long> secondaryContactIds) {
        this.primaryContactId = primaryContactId;
        this.emails = emails;
        this.phoneNumbers = phoneNumbers;
        this.secondaryContactIds = secondaryContactIds;
    }

	public Long getPrimaryContactId() {
		return primaryContactId;
	}

	public void setPrimaryContactId(Long primaryContactId) {
		this.primaryContactId = primaryContactId;
	}

	public List<String> getEmails() {
		return emails;
	}

	public void setEmails(List<String> emails) {
		this.emails = emails;
	}

	public List<String> getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(List<String> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

	public List<Long> getSecondaryContactIds() {
		return secondaryContactIds;
	}

	public void setSecondaryContactIds(List<Long> secondaryContactIds) {
		this.secondaryContactIds = secondaryContactIds;
	}

    // Getters and setters
}

package model;


public class IdentifyRequest {
    public IdentifyRequest(String email, String phoneNumber) {
		super();
		this.email = email;
		this.phoneNumber = phoneNumber;
	}
	private String email;
    private String phoneNumber;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

    // Constructors, getters, and setters
}

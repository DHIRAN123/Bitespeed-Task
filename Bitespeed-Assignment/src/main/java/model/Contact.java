package model;




import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "contact")
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "email")
    private String email;

    @Column(name = "phone_number")
    private String phoneNumber;

    public Contact(Long id, String email, String phoneNumber, String linkPrecedence, Long linkedId) {
		super();
		this.id = id;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.linkPrecedence = linkPrecedence;
		this.linkedId = linkedId;
	}

	@Column(name = "link_precedence")
    private String linkPrecedence;

    @Column(name = "linked_id")
    private Long linkedId;

   

    public Contact() {}

    public Contact(String email, String phoneNumber, String linkPrecedence) {
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.linkPrecedence = linkPrecedence;
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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

	public String getLinkPrecedence() {
		return linkPrecedence;
	}

	public void setLinkPrecedence(String linkPrecedence) {
		this.linkPrecedence = linkPrecedence;
	}

	public Long getLinkedId() {
		return linkedId;
	}

	public void setLinkedId(Long linkedId) {
		this.linkedId = linkedId;
	}

    }

package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the user_contact database table.
 * 
 */
@Entity
@Table(name="user_contact")
@NamedQuery(name="UserContact.findAll", query="SELECT u FROM UserContact u")
public class UserContact implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(length=45)
	private String phone;

	@Column(name="user_id")
	private int userId;

	public UserContact() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

}
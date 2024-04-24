package entity;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "patients")
public class Patient extends Person implements Serializable {
	
	@Enumerated(EnumType.STRING)
	@Column(name = "gender", columnDefinition = "varchar(255)")
	private Gender gender;
	@Column(name = "date_of_birth")
	private String dateOfBirth;
	private String address;
	

	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Patient(String id, String name, String phone) {
		super(id, name, phone);
		// TODO Auto-generated constructor stub
	}
	public Patient(Gender gender, String dateOfBirth, String address) {
		super();
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Patient [gender=" + gender + ", dateOfBirth=" + dateOfBirth + ", address=" + address + "]";
	}
	
	
	
	
}

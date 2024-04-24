package entity;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "doctors")
public class Doctor extends Person implements Serializable{
	private String speciality;


	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "department_id")
	private Department department;

	
	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	public Doctor(String speciality) {
		super();
		this.speciality = speciality;
	}

	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	public Doctor(String id, String name, String phone, String speciality) {
		super(id, name, phone);
		this.speciality = speciality;
	}

	@Override
	public String toString() {
		return "Doctor [speciality=" + speciality + "]";
	}
	
	
}

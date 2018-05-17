package ar.edu.utn.frre.tpidacs.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;


@Entity
@Table(name="client", schema="fantur")
public class Client extends BaseEntity {
	
	private static final long serialVersionUID = 1L;
	
	// Properties ------------------------------------------------------------------
	
	@NotNull
	@Size(min = 2, max =50)
	@Column(name = "name")
	private String name;
	
	@NotNull
	@Size(min = 2, max =50)
	@Column(name = "surname")
	private String surname;
	
	@NotNull
	@Temporal(TemporalType.DATE)
	@Past
	@Column(name = "birth_date")
	private Date birthdate;
	
	@NotNull
	@Min(0)
	@Max(99999999)
	@Column(name = "dni")
	private Long dni;
	
	@Column(name = "address")
	private String address;

	// Getters/Setters -------------------------------------------------------------
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	public Long getDni() {
		return dni;
	}

	public void setDni(Long dni) {
		this.dni = dni;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
	

}

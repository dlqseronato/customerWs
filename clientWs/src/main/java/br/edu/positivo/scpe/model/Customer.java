package br.edu.positivo.scpe.model;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Customer {
	@Id
	@GeneratedValue
	private int id;
	
    @Column(name="FIRST_NAME")
	private String firstName;
    
    @Column(name="LAST_NAME")
	private String lastName;
    
    @Column(name="CPF")
	private long cpf;
    
    @Column(name="EMAIL")
	private String email;
    
    @Column(name="PASSWORD")
	private String password;
    
    @Column(name="BORN_DATE")	
	private Date bornDate;
    
	private List<Address> adresses;
	
	private List<Phone> phones;
	
	
	
	
	public Customer(int id, String firstName, String lastName, long cpf, String email, String password, Date bornDate
			) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.cpf = cpf;
		this.email = email;
		this.password = password;
		this.bornDate = bornDate;
		this.adresses = new ArrayList<Address>();
		this.phones = new ArrayList<Phone>();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public long getCpf() {
		return cpf;
	}
	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getBornDate() {
		return bornDate;
	}
	public void setBornDate(Date bornDate) {
		this.bornDate = bornDate;
	}
	

	public List<Address> getAdresses() {
		return adresses;
	}
	public void setAdresses(List<Address> adresses) {
		this.adresses = adresses;
	}
	public List<Phone> getPhones() {
		return phones;
	}
	public void setPhones(List<Phone> phones) {
		this.phones = phones;
	}
	public void addAdress(Address adress){
		this.adresses.add(adress);
	}
	
	public void addPhone(Phone phone){
		this.phones.add(phone);
	}
	
}

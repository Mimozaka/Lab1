package fr.efrei.Lab1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Rent {

	private long id;
	private Date beginRent;
	private Date endRent;
	private Person person;
	private Vehicule vehicule;
	
	private List<Person> persons = new ArrayList<Person>();
	private List<Vehicule> vehicules = new ArrayList<Vehicule>();
	
	public Rent() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Rent(Date beginRent, Date endRent) {
		super();
		this.beginRent = beginRent;
		this.endRent = endRent;
	}

	public Date getBeginRent() {
		return beginRent;
	}

	public void setBeginRent(Date beginRent) {
		this.beginRent = beginRent;
	}

	public Date getEndRent() {
		return endRent;
	}

	public void setEndRent(Date endRent) {
		this.endRent = endRent;
	}
	
	@ManyToMany
	//@OneToMany(mappedBy="rent", cascade=CascadeType.ALL, fetch = FetchType.EAGER)
	public List<Person> getPerson() {
		return persons;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	@ManyToMany
	//@OneToMany(mappedBy="rent", cascade=CascadeType.ALL, fetch = FetchType.EAGER)
	public List<Vehicule> getVehicule() {
		return vehicules;
	}

	public void setVehicule(Vehicule vehicule) {
		this.vehicule = vehicule;
	}

	@Override
	public String toString() {
		return "Rent [id=" + id + ", beginRent=" + beginRent + ", endRent=" + endRent + ", person=" + person
				+ ", vehicule=" + vehicule + "]";
	}
	
	
	
}

package fr.efrei.Lab1;

import java.util.*;

import javax.persistence.*;

@Entity
public class Vehicule {

	private long id;
	private String name;
	private int plateNumber;
	
	private List<Rent> rent = new ArrayList<Rent>();
		
	public Vehicule()
	{
		super();
	}
	
	public Vehicule (String name, int plateNum)
	{
		super();
		this.name = name;
		this.plateNumber = plateNum;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getId()
	{
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getPlateNumber() {
		return plateNumber;
	}

	public void setPlateNumber(int plate) {
		this.plateNumber = plate;
	}
	
	//@ManyToOne
	@OneToMany(mappedBy="vehicule", cascade=CascadeType.ALL, fetch = FetchType.EAGER)
	public List<Rent> getRent() {
		return rent;
	}

	public void setRent(List<Rent> rent) {
		this.rent = rent;
	}

	
	@Override
	public String toString() {
		return "Vehicule [id=" + id + ", name=" + name + ", plateNumber=" + plateNumber + ", rent=" + rent + "]";
	}
	
	
}

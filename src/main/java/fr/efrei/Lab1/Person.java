package fr.efrei.Lab1;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
public class Person {
	

	private long id;
	private String name;
	private int age;
	
	private List<Rent> rent = new ArrayList<Rent>();
	
	
	public Person() {
		super();
	}

	public Person(long id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getId() {
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//@ManyToOne
	@OneToMany(mappedBy="person", cascade=CascadeType.ALL, fetch = FetchType.EAGER) //Liste
	public List<Rent> getRent() {
		return rent;
	}

	public void setRent(List<Rent> rent) {
		this.rent = rent;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + ", rent=" + rent + "]";
	}
	
	
	
}

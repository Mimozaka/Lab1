package fr.efrei.Lab1;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Car extends Vehicule {
	
	private long id;
	private int numberOfSeats;
	
	public Car()
	{
		super();
	}
	
	public Car(int seats)
	{
		super();
		this.numberOfSeats = seats;
	}

	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

	@Override
	public String toString() {
		return "Car [numberOfSeats=" + numberOfSeats + ", id=" + id + "]";
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	
}

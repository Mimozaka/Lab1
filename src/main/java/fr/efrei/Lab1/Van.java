package fr.efrei.Lab1;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Van extends Vehicule{

	private long id;
	private int maxWeight;

	public Van() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Van(int maxWeight) {
		super();
		this.maxWeight = maxWeight;
	}

	public int getMaxWeight() {
		return maxWeight;
	}

	public void setMaxWeight(int maxWeight) {
		this.maxWeight = maxWeight;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Van [maxWeight=" + maxWeight + ", id=" + id + "]";
	}
	
	
}

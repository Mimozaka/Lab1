package fr.efrei.Lab1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestWebService {
	
	VehiculeRepository vehiculeRepository;
	VanRepository vanRepository;
	CarRepository carRepository;
	PersonRepository personRepository;
	RentRepository rentRepository;
	
	@Autowired
	public RestWebService(VehiculeRepository vehiculeRepository) {
		super();
		this.vehiculeRepository = vehiculeRepository;
	}

	@Autowired
	public RestWebService(VanRepository vanRepository) {
		super();
		this.vanRepository = vanRepository;
	}

	@Autowired
	public RestWebService(CarRepository carRepository) {
		super();
		this.carRepository = carRepository;
	}

	@Autowired
	public RestWebService(PersonRepository personRepository) {
		super();
		this.personRepository = personRepository;
	}

	@Autowired
	public RestWebService(RentRepository rentRepository) {
		super();
		this.rentRepository = rentRepository;
	}
	
	
	@GetMapping("/Vehicules")
	public Iterable<Vehicule> getVehicule(){
		return vehiculeRepository.findAll();
	}
	
	@GetMapping("/Vans")
	public Iterable<Van> getVan(){
		return vanRepository.findAll();
	}
	
	@GetMapping("/Cars")
	public Iterable<Car> getCar(){
		return carRepository.findAll();
	}
	
	@GetMapping("/Persons")
	public Iterable<Person> getPerson(){
		return personRepository.findAll();
	}
	
	@GetMapping("/Rents")
	public Iterable<Rent> getRent(){
		return rentRepository.findAll();
	}
}

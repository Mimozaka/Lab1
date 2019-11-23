package fr.efrei.Lab1;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface VehiculeRepository extends CrudRepository<Vehicule, Long>{
	List<Vehicule> findByName(String nom);
}

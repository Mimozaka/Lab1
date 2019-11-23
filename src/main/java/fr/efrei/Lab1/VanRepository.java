package fr.efrei.Lab1;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface VanRepository extends CrudRepository<Van,Long>{

	List<Van>findByName(String nom);
}

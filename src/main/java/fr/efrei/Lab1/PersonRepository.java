package fr.efrei.Lab1;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Long> {

		List<Person> findByName(String nom);
}

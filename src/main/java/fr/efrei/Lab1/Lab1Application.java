package fr.efrei.Lab1;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Lab1Application {

	private static final Logger log = LoggerFactory.getLogger(Lab1Application.class);
	
	public static void main(String[] args) {
		SpringApplication.run(Lab1Application.class, args);
	}
	
	@Bean
	public CommandLineRunner demo(RentRepository rentRepository){
		return (args) -> {
			
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
			Date date = dateFormat.parse("2018-10-19");
			log.info(date.toString());
			
			Date dateRetour = dateFormat.parse("2018-11-19");
			log.info(dateRetour.toString());
			
			Car peugeot = new Car(5);
			Person jean = new Person(1, "Jean", 19);
			Rent location = new Rent(date,dateRetour);
			
			location.getPerson().add(jean);
			location.getVehicule().add(peugeot);
			
			rentRepository.save(location);
			
			
			log.info("Location found with findAll():");
			log.info("-------------------------------");
			for (Rent rent : rentRepository.findAll()) {
				log.info(rent.toString());
			}
			log.info("");

			log.info("rent found with findName('Paris'):");
			log.info("--------------------------------------------");
			rentRepository.findById(1).forEach(rent -> {
				log.info(rent.toString());
			
		});
		
	};

}}

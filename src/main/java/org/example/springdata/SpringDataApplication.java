package org.example.springdata;

import org.example.springdata.enums.Genre;
import org.example.springdata.model.Etudiant;
import org.example.springdata.repository.EtudientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDataApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataApplication.class, args);
	}
	@Autowired
	EtudientRepository etudientRepository;
	@Override
	public void run(String... args) throws Exception {
		Etudiant et1 = Etudiant.builder()
				.nom("Adnani")
				.prenom("Morad")
				.genre(Genre.Homme)
				.build();

		etudientRepository.save(et1);
	}}
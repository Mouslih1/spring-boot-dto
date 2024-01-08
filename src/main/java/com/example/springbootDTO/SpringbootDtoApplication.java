package com.example.springbootDTO;

import com.example.springbootDTO.Controller.UserController;
import com.example.springbootDTO.Model.Location;
import com.example.springbootDTO.Model.User;
import com.example.springbootDTO.Repository.ILocationRepository;
import com.example.springbootDTO.Repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootDtoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDtoApplication.class, args);
	}

	@Autowired
	private IUserRepository iUserRepository;

	@Autowired
	private ILocationRepository iLocationRepository;

	@Override
	public void run(String... args) throws Exception {

		Location location = new Location();
		location.setPlace("casablanca");
		location.setDescription("casablanca sakani L2 N°226 ");
		location.setLongitude(40.2);
		location.setLatitude(38.2);
		iLocationRepository.save(location);

		User user = new User();
		user.setEmail("email@email.com");
		user.setFirst_name("marouane");
		user.setLast_name("mouslih");
		user.setPassword("Mouslih2001");
		user.setLocation(location);
		iUserRepository.save(user);

		User user1 = new User();
		user1.setEmail("oussama@email.com");
		user1.setFirst_name("oussama");
		user1.setLast_name("mouslih");
		user1.setPassword("Mouslih2001");
		user1.setLocation(location);
		iUserRepository.save(user1);
	}
}

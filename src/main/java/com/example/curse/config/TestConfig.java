package com.example.curse.config;

import java.sql.Array;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.example.curse.entities.User;
import com.example.curse.repositories.UserRepository;
import java.util.Arrays;


@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		// Inicia o método quando aplicação é iniciada
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456"); 
		
		//Salvando os objetos no bd
		userRepository.save(u1);
		userRepository.save(u2);
		
	}

}

package com.springproject.concepts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class ConceptsApplication {

	public static void main(String[] args) {

//		SpringApplication.run(ConceptsApplication.class, args);
//		var game = new MarioGame();
//		var game = new SuperContraGame();
		var game = new PacManGame();

		var gameRunner = new GameRunner(game);
		gameRunner.run();
	}

}

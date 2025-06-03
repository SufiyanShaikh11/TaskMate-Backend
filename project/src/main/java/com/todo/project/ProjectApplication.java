package com.todo.project;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjectApplication {

	public static void main(String[] args) {
		// Load environment variables from .env file
		Dotenv dotenv = Dotenv.configure().ignoreIfMissing().load();

		System.setProperty("DATASOURCE_URL", dotenv.get("DATASOURCE_URL"));
		System.setProperty("DATASOURCE_USER", dotenv.get("DATASOURCE_USER"));
		System.setProperty("DATASOURCE_PASSWORD", dotenv.get("DATASOURCE_PASSWORD"));
		System.setProperty("FRONTEND_URL", dotenv.get("FRONTEND_URL"));

		SpringApplication.run(ProjectApplication.class, args);
	}
}

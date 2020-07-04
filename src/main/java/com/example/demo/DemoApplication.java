package com.example.demo;

import com.example.demo.domain.Child;
import com.example.demo.domain.Parent;
import com.example.demo.repository.ChildRepository;
import com.example.demo.repository.ParentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@RequestMapping("/")
	public String index() {
		return "Hello workd";
	}

	@Bean
	public CommandLineRunner demo(ParentRepository parentRepository, ChildRepository childRepository) {
		return (args) -> {
			parentRepository.save(new Parent("AAA", "name a"));
			parentRepository.save(new Parent("BBB", "name b"));

			childRepository.save(new Child(null, "child a"));
			childRepository.save(new Child(null, "child b"));
		};
	}
}

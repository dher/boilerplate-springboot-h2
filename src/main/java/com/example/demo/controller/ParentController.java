package com.example.demo.controller;

import com.example.demo.domain.Parent;
import com.example.demo.service.ParentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("parent")
public class ParentController {

	@Autowired
	private ParentService parentService;

	@GetMapping
	public List<Parent> getAll () {
		return parentService.getAll();
	}

	@PostMapping
	public Parent add (@RequestBody Parent parent) {
		return parentService.add(parent);
	}

}

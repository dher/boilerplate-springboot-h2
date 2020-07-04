package com.example.demo.controller;

import com.example.demo.domain.Child;
import com.example.demo.domain.Parent;
import com.example.demo.service.ChildService;
import com.example.demo.service.ParentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("child")
public class ChildController {

	@Autowired
	private ChildService childService;

	@GetMapping
	public List<Child> getAll () {
		return childService.getAll();
	}

	@PostMapping
	public Child add (@RequestBody Child child) {
		return childService.add(child);
	}

}

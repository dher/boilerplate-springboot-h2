package com.example.demo.service;

import com.example.demo.domain.Parent;
import com.example.demo.repository.ParentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ParentService {

	@Autowired
	private ParentRepository parentRepository;

	public List<Parent> getAll () {
		return parentRepository.findAll();
	}

	public Parent add(Parent parent) {
		Parent saved = parentRepository.save(parent);
		return saved;
	}
}

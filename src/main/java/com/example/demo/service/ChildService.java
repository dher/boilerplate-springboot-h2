package com.example.demo.service;

import com.example.demo.domain.Child;
import com.example.demo.domain.Parent;
import com.example.demo.repository.ChildRepository;
import com.example.demo.repository.ParentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ChildService {

	@Autowired
	private ChildRepository childRepository;

	public List<Child> getAll () {
		return childRepository.findAll();
	}

	public Child add(Child child) {
		Child saved = childRepository.save(child);
		return saved;
	}
}

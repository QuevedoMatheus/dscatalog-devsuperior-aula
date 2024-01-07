package com.example.demo.services;

import java.util.Collection;
import java.util.List;
import java.util.Locale.Category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repositories.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository repository;
	
	public Collection<com.example.demo.entities.Category> findAll() {
		return repository.findAll();
		
	}
}

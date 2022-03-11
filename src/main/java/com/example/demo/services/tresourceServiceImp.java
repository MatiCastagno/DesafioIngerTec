package com.example.demo.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Tresource;
import com.example.demo.repositories.tresourceRepository;

@Service
public class tresourceServiceImp implements tresourceService{

	@Autowired
	private tresourceRepository tresourceRepo;
	
	@Override
	public Tresource save() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Tresource> listTresource() {
		
		return tresourceRepo.findAll();
	}

	@Override
	public Tresource getById(Integer id) {
		
		if(tresourceRepo.findById(id).isPresent()) {
			
			Tresource tresource = tresourceRepo.findById(id).get();
			return tresource;
		}
		return null;
		
	}

}

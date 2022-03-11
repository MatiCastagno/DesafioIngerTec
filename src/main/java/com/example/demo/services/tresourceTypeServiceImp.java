package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.TresourceType;
import com.example.demo.repositories.tresourceTypeRepository;

public class tresourceTypeServiceImp implements tresourceTypeService {

	@Autowired
	private tresourceTypeRepository tresourceTypeRepo; 
	
	@Override
	public TresourceType save() {
		return null;
	}

	@Override
	public List<TresourceType> listTresource() {
		return tresourceTypeRepo.findAll();
	}

	@Override
	public TresourceType getById(Long id) {

		if(tresourceTypeRepo.findById(id).isPresent()) {
			
			TresourceType tresourceType = tresourceTypeRepo.findById(id).get();
			return tresourceType;
			
		}else {
			return null;
		}
	}

}

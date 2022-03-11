package com.example.demo.services;

import java.util.List;

import com.example.demo.model.TresourceType;

public interface tresourceTypeService {

	public TresourceType save ();
	public List<TresourceType> listTresource();
	public TresourceType getById(Long id);
}

package com.example.demo.services;

import java.util.List;

import com.example.demo.model.Tresource;

public interface tresourceService {

	public Tresource save ();
	public List<Tresource> listTresource();
	public Tresource getById(Integer id);
}

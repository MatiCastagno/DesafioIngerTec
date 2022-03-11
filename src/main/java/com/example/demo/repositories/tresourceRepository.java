package com.example.demo.repositories;


import java.util.Optional;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Tresource;

@Repository
public interface tresourceRepository extends JpaRepository<Tresource, String>{

	@Query("SELECT c FROM Tresource c WHERE c.id = :id")
	public Optional<Tresource> findById(@Param("id")Integer id);
}

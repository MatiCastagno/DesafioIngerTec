package com.example.demo.repositories;




import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.model.TresourceType;


@Repository
public interface tresourceTypeRepository extends JpaRepository<TresourceType, String>{

	@Query("SELECT c FROM TresourceType c WHERE c.id = :id")
	public Optional<TresourceType> findById(@Param("id") Long id);
}

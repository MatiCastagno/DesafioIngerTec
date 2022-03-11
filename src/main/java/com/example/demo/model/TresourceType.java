package com.example.demo.model;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@EntityListeners(AuditingEntityListener.class)
public class TresourceType {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idResourceType;
	
	@CreationTimestamp
	private LocalDate creationDate;

	private String descrip;
}

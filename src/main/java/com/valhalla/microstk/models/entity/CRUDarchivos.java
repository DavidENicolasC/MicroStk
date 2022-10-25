package com.valhalla.microstk.models.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;

@Entity
@Table(name = "CRUDarchivos")
public class CRUDarchivos {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
}

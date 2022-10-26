package com.valhalla.microstk.commons;

import java.io.Serializable;

import java.util.List;

public class GenericRESTAPI<T, ID extends Serializable> {
	T save(T entity) {
		return null;
	}
	
	void delete(ID id) {
	}
	
	T get(ID id) {
		return null;
	}
	
	List<T> getAll() {
		return null;
	}
}
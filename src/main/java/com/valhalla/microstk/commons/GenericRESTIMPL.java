package com.valhalla.microstk.commons;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public abstract class GenericRESTIMPL<T, ID extends Serializable> extends GenericRESTAPI<T, ID> {

	public T save(T entity) {
		return getDao().save(entity);
	}

	public void delete(ID id) {
		getDao().deleteById(id);
	}

	public T get(ID id) {
		Optional<T> obj = getDao().findById(id);
		if (obj.isPresent()) {
			return obj.get();
		}
		return null;
	}

	public List<T> getAll() {
		List<T> returnList = new ArrayList<>();
		getDao().findAll().forEach(obj -> returnList.add(obj));
		return returnList;
	}

	public abstract CrudRepository<T, ID> getDao();

}

package crudbase.service;

import java.util.Collection;
import java.util.Optional;

import crudbase.model.BaseModel;

public interface BaseService<T extends BaseModel> {

	T upsert(T object);
	
	T save(T object);
	
	T update(T object);

    void delete(Long objectId);

    Collection<T> list();

    Optional<T> findOne(Long objectId);

}

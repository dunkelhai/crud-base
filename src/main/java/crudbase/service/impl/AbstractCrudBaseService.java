package crudbase.service.impl;

import java.util.Collection;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;

import crudbase.exception.MyCustomException;
import crudbase.model.BaseModel;
import crudbase.repository.BaseRepository;
import crudbase.service.BaseService;

abstract class AbstractCrudBaseService<T extends BaseModel, R extends BaseRepository<T>> implements BaseService<T> {

	protected R repository;

	public AbstractCrudBaseService(R repository) {
		this.repository = repository;
	}

	@Override
	public T upsert(T object) {
		return object.getId() == null ? save(object) : repository.existsById(object.getId()) ? update(object) : save(object);
	}

	protected void beforeSave(T object) {
		/*
		 * Code here actions that will be run before save your object
		 */
	}

	@Override
	public T save(T object) {
		try {
			beforeSave(object);
			var saved = repository.save(object);
			afterSave(saved);
			return saved;
		} catch (Exception e) {
			throw new MyCustomException(e);
		}
	}

	protected void afterSave(T object) {
		/*
		 * Code here actions that will be run after save your object
		 */
	}

	protected void beforeUpdate(T object) {
		/*
		 * Code here actions that will be run before update your object
		 */
	}

	@Override
	public T update(T object) {
		try {
			beforeUpdate(object);
			var saved = repository.saveAndFlush(object);
			afterUpdate(object);
			return saved;
		} catch (Exception e) {
			throw new MyCustomException(e);
		}
	}

	protected void afterUpdate(T object) {
		/*
		 * Code here actions that will be run after update your object
		 */
	}

	protected void beforeDelete(Long objectId) {
		/*
		 * Code here actions that will be run before delete your object
		 */
	}

	@Override
	@Transactional
	@Modifying
	public void delete(Long objectId) {
		try {
			beforeDelete(objectId);
			repository.deleteById(objectId);
			afterDelete(objectId);
		} catch (Exception e) {
			throw new MyCustomException(e);
		}
	}

	protected void afterDelete(Long object) {
		/*
		 * Code here actions that will be run after delete your object
		 */
	}

	@Override
	public Collection<T> list() {
		return repository.findAll();
	}

	@Override
	public Optional<T> findOne(Long objectId) {
		return repository.findById(objectId);
	}

}
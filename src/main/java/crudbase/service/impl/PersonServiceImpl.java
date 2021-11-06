package crudbase.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import crudbase.model.Person;
import crudbase.repository.PersonRepository;
import crudbase.service.PersonService;

@Service
@Transactional(propagation = Propagation.REQUIRED)
class PersonServiceImpl extends AbstractCrudBaseService<Person, PersonRepository> implements PersonService {

	public PersonServiceImpl(PersonRepository repository) {
		super(repository);
	}

	/*
	 * Override here superclass's auxiliary methods as you need:
	 * 
	 *  beforeSave ~ afterSave
	 *  beforeUpdate ~ afterUpdate
	 *  beforeDelete ~ afterDelete
	 */

}

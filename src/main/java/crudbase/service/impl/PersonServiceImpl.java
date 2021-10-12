package crudbase.service.impl;

import crudbase.model.Person;
import crudbase.repository.PersonRepository;
import crudbase.service.PersonService;

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
	 *
	 */

}

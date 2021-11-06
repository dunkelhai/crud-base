package crudbase.controller;

import java.util.Collection;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import crudbase.model.Person;
import crudbase.service.PersonService;
import lombok.AllArgsConstructor;

@RequestMapping("/person")
@RestController
@AllArgsConstructor
public class PersonController {

	private PersonService service;
	
	@GetMapping
	public @ResponseBody Collection<Person> list(){
		return service.list();
	}
	
	@GetMapping("/{id}")
	public Person find(@PathVariable Long id){
		return service.findOne(id).get();
	}
	
	@PostMapping
	public Person upsert(@RequestBody Person person){
		return service.upsert(person);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id){
		service.delete(id);
	}
}

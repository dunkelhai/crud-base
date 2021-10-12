package crudbase.model;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity(name = "PERSON")
public class Person implements BaseModel {
	private static final long serialVersionUID = 634668659959250518L;

	private Long id;
	
	private String name;
	
	private Integer age;

}

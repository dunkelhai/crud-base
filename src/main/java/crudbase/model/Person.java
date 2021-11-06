package crudbase.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "PERSON")
public class Person implements BaseModel {
	private static final long serialVersionUID = -4984077490646103900L;

	private @Id @GeneratedValue(strategy = GenerationType.AUTO) Long id;
	
	private String name;
	
	private Integer age;

}

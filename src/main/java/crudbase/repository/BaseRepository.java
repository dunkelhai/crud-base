package crudbase.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import crudbase.model.BaseModel;

public interface BaseRepository <T extends BaseModel> extends JpaRepository<T, Long>{

}

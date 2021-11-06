package crudbase.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import crudbase.model.BaseModel;

@NoRepositoryBean
public interface BaseRepository <T extends BaseModel> extends JpaRepository<T, Long>{

}

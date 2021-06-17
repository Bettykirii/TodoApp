package com.tutorial.CRUD.repositories;

import com.tutorial.CRUD.model.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository  extends CrudRepository <Todo, Long> {
}

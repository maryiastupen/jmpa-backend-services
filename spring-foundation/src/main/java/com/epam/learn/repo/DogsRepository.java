package com.epam.learn.repo;

import com.epam.learn.model.Dog;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Dogs crud repository
 */
@Repository
public interface DogsRepository extends CrudRepository<Dog, Long> {}

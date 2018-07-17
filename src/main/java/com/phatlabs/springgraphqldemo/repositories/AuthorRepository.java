package com.phatlabs.springgraphqldemo.repositories;

import com.phatlabs.springgraphqldemo.models.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}

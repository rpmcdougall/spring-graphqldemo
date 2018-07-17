package com.phatlabs.springgraphqldemo.repositories;

import com.phatlabs.springgraphqldemo.models.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}

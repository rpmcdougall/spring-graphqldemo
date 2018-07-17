package com.phatlabs.springgraphqldemo.resolvers;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.phatlabs.springgraphqldemo.models.Author;
import com.phatlabs.springgraphqldemo.models.Book;
import com.phatlabs.springgraphqldemo.repositories.AuthorRepository;
import com.phatlabs.springgraphqldemo.repositories.BookRepository;

public class Query implements GraphQLQueryResolver {
    private BookRepository bookRepository;
    private AuthorRepository authorRepository;

    public Query(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    public Iterable<Book> findAllBooks() {
        return bookRepository.findAll();
    }

    public Iterable<Author> findAllAuthors() {
        return authorRepository.findAll();
    }

    public long countBooks() {
        return bookRepository.count();
    }
    public long countAuthors() {
        return authorRepository.count();
    }
}
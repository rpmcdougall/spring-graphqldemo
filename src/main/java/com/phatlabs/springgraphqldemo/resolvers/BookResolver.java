package com.phatlabs.springgraphqldemo.resolvers;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.phatlabs.springgraphqldemo.models.Author;
import com.phatlabs.springgraphqldemo.models.Book;
import com.phatlabs.springgraphqldemo.repositories.AuthorRepository;

public class BookResolver implements GraphQLResolver<Book> {
    private AuthorRepository authorRepository;

    public BookResolver(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public Author getAuthor(Book book) {
        return authorRepository.findById(book.getAuthor().getId())
                .orElseThrow();
    }
}

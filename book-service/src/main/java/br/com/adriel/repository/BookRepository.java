package br.com.adriel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.adriel.model.Book;

public interface BookRepository extends JpaRepository<Book, Long>{}
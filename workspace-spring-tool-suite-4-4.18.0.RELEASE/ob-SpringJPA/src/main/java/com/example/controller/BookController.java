package com.example.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entitys.Book;
import com.example.repository.BookRepository;

@RestController
public class BookController {

	private BookRepository bookRepository;

	public BookController(BookRepository bookRepository) {
		super();
		this.bookRepository = bookRepository;
	}

	// CRUD sobre la entidad Book

	// Buscar todos los libros
	@GetMapping("/api/books")
	public List<Book> findAll() {

		return bookRepository.findAll();
	}

	// buscar solo un libro en la base de datos por ID
	@GetMapping("/api/books/{id}")
	public ResponseEntity<Book> findOneById(@PathVariable Long id) {
		Optional<Book> bookOpt = bookRepository.findById(id);
		if (bookOpt.isPresent()) {
			return ResponseEntity.ok(bookOpt.get());
		} else
			return ResponseEntity.notFound().build();

//		return bookOpt.orElse(null);
	}

	// crear nuevo libro
	@PostMapping("/api/books")
	public Book create(@RequestBody Book book) {
		return bookRepository.save(book);
		
		
	}

	// actualizar un libro existente

	// borrar un libro
}

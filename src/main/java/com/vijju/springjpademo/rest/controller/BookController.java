package com.vijju.springjpademo.rest.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vijju.springjpademo.entity.Books;
import com.vijju.springjpademo.service.BookService;

@RestController
@RequestMapping("/")
public class BookController {
	
	@Autowired
	public BookService bookService;
	
	@GetMapping(value="/book")
	public List<Books> getAllBooks(){
		return bookService.findAllBooks();
	}
	
	@GetMapping("/book/{bookId}")
	public Books getBookById(@PathVariable("bookId") Long bookId){
		try {
		return bookService.findBooksById(bookId);
		}catch(Exception e) {
			throw e;
		}
	}
	
	@PostMapping(value="/books", consumes =MediaType.APPLICATION_JSON_VALUE)
	public void saveBook(@RequestBody Books book) {
		bookService.saveBooks(book);
	}
	
	@PutMapping("/books")
	public void updateBook(@RequestBody Books book) {
		bookService.updteBooks(book, null);
	}
	
	@DeleteMapping("/books/{bookId}")
	public void deleteBook(@PathVariable("bookId") Long bookId) {
		bookService.deleteBook(bookId);
	}
}

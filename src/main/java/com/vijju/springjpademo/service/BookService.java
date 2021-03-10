package com.vijju.springjpademo.service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vijju.springjpademo.entity.Books;
import com.vijju.springjpademo.exception.ResourceNotFoundException;
import com.vijju.springjpademo.repostiory.BookRepository;

@Service
public class BookService  {
	
	@Autowired
	public BookRepository bookRepository;

	
	public void saveBooks(Books books) {
		bookRepository.save(books);
	}
	
	public Books findBooksById(Long id) {
		return bookRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Book not foudn with the ID :"+id));
	}
	
	public List<Books> findAllBooks() {
		List<Books> books = bookRepository.findAll();
		return books;
	}
	
	public void updteBooks(Books books,Long Id) {
		bookRepository.save(books);
	}

	public void deleteBook(Long bookId) {
		// TODO Auto-generated method stub
		bookRepository.deleteById(bookId);
	}
	
}

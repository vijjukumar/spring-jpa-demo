package com.vijju.springjpademo.repostiory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vijju.springjpademo.entity.Books;

public interface BookRepository extends JpaRepository<Books,Long>{
	

	
}

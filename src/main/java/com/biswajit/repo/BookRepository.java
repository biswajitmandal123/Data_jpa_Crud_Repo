package com.biswajit.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.biswajit.entity.Book;

public interface BookRepository extends CrudRepository<Book, Integer> {
	// select * from where book_price > :price(FIND BY METHOD)
	// public List<Book>findByBookPriceGreaterThan(Double price);
	
	//CUSTOME QUERY
	
	//@Query(value="select * from book", nativeQuery = true)
	//public List<Book> getAllBooks();

		//HQL Query
	@Query("from Book ")
	public List<Book> getBooks();
	
}

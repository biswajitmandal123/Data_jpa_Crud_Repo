package com.biswajit;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.biswajit.entity.Book;
import com.biswajit.repo.BookRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

		BookRepository repo = context.getBean(BookRepository.class);

	/*	
		Book b3= new Book();
		b3.setBookId(105);
		b3.setBookName("love");
		b3.setBookPrice(4000.00);
		
		repo.save(b3);
		repo.saveAll(Arrays.asList(b1,b2,b3));		
		
		System.out.println("Record inserted.........");
/*
		Optional<Book> findById=repo.findById(101);
		System.out.println(findById.get());
		
*/
/*		
   boolean status =repo.existsById(104);
	
    System.out.println("record present:"+status);
	System.out.println("record avalable:"+repo.count());
	*/
		/*
		Iterable<Book> findById=repo.findAllById(Arrays.asList(101,102,103,104));
	
	for(Book b : findById) {
		System.out.println(b);
	}
	*/
		
		/*
		List<Book> books=repo.findByBookPriceGreaterThan(2500.00);
		for(Book b : books) {
			System.out.println(b);
		}
		*/
		
		List<Book> books= repo.getBooks();     //getAllBooks()
		for(Book b : books) {
			System.out.println(b);
		}
	}
}

package com.demo.SpringBoot2.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.SpringBoot2.Entity.Book;
import com.demo.SpringBoot2.Exception.BookNotFoundException;
import com.demo.SpringBoot2.Repository.BookRepository;

@Service
public class BookService {
	
	@Autowired
	BookRepository repo;
	
	public Book addBook(Book b) {
		repo.save(b);
		return b;
	}
	
	public List<Book> getAllBook(){
		return (List<Book>) repo.findAll();
	}

	public List<Book> getByFilter(double price) {
		// TODO Auto-generated method stub
		return repo.findAllByPriceLessThan(price);
	}

	public List<Book> getParticularBook(String name) {
		// TODO Auto-generated method stub
		return repo.getParticularBook(name);
	}

	public void deleteByName(String name) {
		// TODO Auto-generated method stub
		repo.deleteByName(name);
	}

	public Optional<Book> getBookById(int id) throws BookNotFoundException {
		// TODO Auto-generated method stub
		 Optional<Book> findById = repo.findById(id);
		 if(!findById.isPresent())
			 throw new BookNotFoundException("Id not found");
		 return findById;
	}
	
	
}

package com.demo.SpringBoot2.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.SpringBoot2.Entity.Book;
import com.demo.SpringBoot2.Service.BookService;

@RestController
@RequestMapping("/book")
public class BookController {
	
	@Autowired
	BookService service;
	
	@PostMapping("/add")
	public Book addBook(@RequestBody Book b) {
		return service.addBook(b);
	}
	
	@GetMapping("/all")
	public List<Book> getAllBook(){
		return service.getAllBook();
	}
	
	@GetMapping("/filter/{price}")
	public List<Book> getByFilter(@PathVariable double price){
		return service.getByFilter(price);
	}
	
	@GetMapping("/match/{name}")
	public List<Book> getParticularBook(@PathVariable String name){
		return service.getParticularBook(name);
	}
	
	@DeleteMapping("/delete/{name}")
	public void deleteByName(@PathVariable String name) {
		service.deleteByName(name);
	}
}

package com.demo.SpringBoot2.Repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.demo.SpringBoot2.Entity.Book;

@Repository
public interface BookRepository extends CrudRepository<Book,Integer> {

	List<Book> findAllByPriceGreaterThan(double price);

	List<Book> findAllByPriceLessThan(double price);
	
	@Query(value="from Book where name=:name")
	List<Book> getParticularBook(@Param("name") String name);
	
	@Modifying
	@Transactional
	@Query(value="delete from book where name=:name" , nativeQuery = true)
	void deleteByName(@Param("name") String name);

}

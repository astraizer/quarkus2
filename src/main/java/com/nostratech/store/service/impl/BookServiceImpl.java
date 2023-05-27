package com.nostratech.store.service.impl;

import javax.enterprise.context.ApplicationScoped;

import com.nostratech.store.domain.Book;
import com.nostratech.store.dto.BookCreateRequestDTO;
import com.nostratech.store.repository.BookRepository;
import com.nostratech.store.service.BookService;

@ApplicationScoped
public class BookServiceImpl implements BookService{
	

	private BookRepository bookRepository;
	
	public BookServiceImpl(BookRepository bookRepository) {
		super();
		this.bookRepository = bookRepository;
	}

	@Override
	public void createBook(BookCreateRequestDTO dto) {
		Book book = new Book();
		book.setTitle(dto.getTitle());
		bookRepository.save(book);
		
	}

}

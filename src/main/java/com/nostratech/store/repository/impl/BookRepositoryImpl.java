package com.nostratech.store.repository.impl;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import com.nostratech.store.domain.Book;
import com.nostratech.store.repository.BookRepository;

@ApplicationScoped
public class BookRepositoryImpl implements BookRepository {

	private EntityManager entityManager;

	
	
	public BookRepositoryImpl(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}



	@Transactional
	@Override
	public void save(Book book) {
		entityManager.persist(book);

	}

}

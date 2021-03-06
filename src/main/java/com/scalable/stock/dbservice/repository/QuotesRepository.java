package com.scalable.stock.dbservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.scalable.stock.dbservice.model.Quote;

import java.util.List;

public interface QuotesRepository extends JpaRepository<Quote, Integer> {
    List<Quote> findByUserName(String username);
}

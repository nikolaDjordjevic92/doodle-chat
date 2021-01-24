package com.example.demo.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.TextMessage;

@Repository
public interface TextMessageRepository extends PagingAndSortingRepository<TextMessage, Long>{
	public List<TextMessage> findTop10ByIdLessThanOrderByIdDesc(Long id);
	public List<TextMessage> findTop10ByOrderByIdDesc();
	
}

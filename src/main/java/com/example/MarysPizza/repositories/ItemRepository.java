package com.example.MarysPizza.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.MarysPizza.models.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {  
    Page<Item> findByTituloContaining(String descricao, Pageable pageable); 
}
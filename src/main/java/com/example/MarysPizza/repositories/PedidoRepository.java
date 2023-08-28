package com.example.MarysPizza.repositories;

import com.example.MarysPizza.models.Pedido;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {   
    
    Page<Pedido> findByDescricaoContaining(String busca, Pageable pageable);

}
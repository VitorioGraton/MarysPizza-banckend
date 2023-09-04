package com.example.MarysPizza.repositories;

import com.example.MarysPizza.models.Pedido;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {   
    
    Page<Pedido> findByObservacaoContaining(String observacao, Pageable pageable);

    Optional<Pedido> findPedidoByIdPedido(Long idPedido);
}

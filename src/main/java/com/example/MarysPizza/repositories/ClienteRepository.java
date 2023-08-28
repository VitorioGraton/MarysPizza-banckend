package com.example.MarysPizza.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.MarysPizza.models.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{
}
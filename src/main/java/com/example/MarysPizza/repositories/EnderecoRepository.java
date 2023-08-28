package com.example.MarysPizza.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.MarysPizza.models.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco, Long> {   
}
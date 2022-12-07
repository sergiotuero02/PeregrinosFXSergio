package com.example.PeregrinosFX.repository;

import com.example.PeregrinosFX.bean.Estancia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstanciaRepository extends JpaRepository<Estancia, Long> {
}

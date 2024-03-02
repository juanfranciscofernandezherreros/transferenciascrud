package com.ejemplo.transferenciascrud.repository;

import com.ejemplo.transferenciascrud.dao.TransferenciaDAO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransferenciaRepository extends JpaRepository<TransferenciaDAO, Long> {
}


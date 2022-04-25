package com.example.livre_api.repos;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.livre_api.entities.Livre;
@Transactional
public interface LivreRepo extends JpaRepository<Livre, Integer> {
    List<Livre> findByOrderByTitreAsc();
}

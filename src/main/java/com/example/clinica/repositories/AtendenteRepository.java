package com.example.clinica.repositories;

import com.example.clinica.models.Atendente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AtendenteRepository extends JpaRepository<Atendente,Integer> {

}

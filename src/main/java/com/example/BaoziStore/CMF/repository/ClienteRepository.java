package com.example.BaoziStore.CMF.repository;

import com.example.BaoziStore.CMF.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{

}

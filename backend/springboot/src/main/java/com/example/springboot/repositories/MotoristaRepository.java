package com.example.springboot.repositories;

import com.example.springboot.models.MotoristaModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface MotoristaRepository extends JpaRepository<MotoristaModel, UUID> {
}

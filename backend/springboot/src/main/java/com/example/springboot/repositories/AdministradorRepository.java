package com.example.springboot.repositories;

import com.example.springboot.models.AdministradorModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AdministradorRepository extends JpaRepository<AdministradorModel, UUID> {
}

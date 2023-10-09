package com.example.springboot.dtos;

import com.example.springboot.models.AdministradorModel;
import com.example.springboot.models.ClienteModel;
import com.example.springboot.models.MotoristaModel;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.UUID;

public record UsuarioDTO (@NotBlank String nome, @NotBlank String email, @NotBlank String senha) {
}
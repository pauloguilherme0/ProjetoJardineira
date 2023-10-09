package com.example.springboot.controllers;

import com.example.springboot.dtos.UsuarioDTO;
import com.example.springboot.models.*;
import com.example.springboot.repositories.AdministradorRepository;
import com.example.springboot.repositories.ClienteRepository;
import com.example.springboot.repositories.MotoristaRepository;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
public class UsuarioController {

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private MotoristaRepository motoristaRepository;

    @Autowired
    private AdministradorRepository administradorRepository;


    // CRUD Cliente
    @PostMapping("/clientes")
    public ResponseEntity<ClienteModel> createCliente(@RequestBody @Valid UsuarioDTO usuarioDTO) {
        var clienteModel = new ClienteModel();
        BeanUtils.copyProperties(usuarioDTO, clienteModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(clienteRepository.save(clienteModel));
    }

    @GetMapping("/clientes")
    public ResponseEntity<List<ClienteModel>> getAllClientes() {
        List<ClienteModel> clienteModelList = clienteRepository.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(clienteModelList);
    }

    @GetMapping("/clientes/{id}")
    public ResponseEntity<Object> getOneCliente(@PathVariable(value = "id") UUID id) {
        Optional<ClienteModel> cliente0 = clienteRepository.findById(id);
        if (cliente0.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Cliente não encontrado.");
        }
        cliente0.get().add(linkTo(methodOn(UsuarioController.class).getAllClientes()).withRel("Lista de Clientes"));
        return ResponseEntity.status(HttpStatus.OK).body(cliente0.get());
    }

    @PutMapping("/clientes/{id}")
    public ResponseEntity<Object> updateCliente(@PathVariable(value = "id") UUID id,
                                                @RequestBody @Valid UsuarioDTO usuarioDTO) {
        Optional<ClienteModel> cliente0 = clienteRepository.findById(id);
        if(cliente0.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Cliente não encontrado..");
        }
        var clienteModel = cliente0.get();
        BeanUtils.copyProperties(usuarioDTO, clienteModel);
        return ResponseEntity.status(HttpStatus.OK).body(clienteRepository.save(clienteModel));
    }

    @DeleteMapping("/clientes/{id}")
    public ResponseEntity<Object> deleteCliente(@PathVariable(value = "id") UUID id) {
        Optional<ClienteModel> cliente0 = clienteRepository.findById(id);
        if (cliente0.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Cliente não encontrado.");
        }
        clienteRepository.delete(cliente0.get());
        return ResponseEntity.status(HttpStatus.OK).body("Cadastro de Cliente deletado com sucesso.");
    }

    //
    //CRUD Motorista
    @PostMapping("/motoristas")
    public ResponseEntity<MotoristaModel> createMotorista(@RequestBody @Valid UsuarioDTO usuarioDTO) {
        var motoristaModel = new MotoristaModel();
        BeanUtils.copyProperties(usuarioDTO, motoristaModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(motoristaRepository.save(motoristaModel));
    }

    @GetMapping("/motoristas")
    public ResponseEntity<List<MotoristaModel>> getAllMotorista() {
        List<MotoristaModel> motoristaModelList = motoristaRepository.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(motoristaModelList);
    }

    @GetMapping("/motoristas/{id}")
    public ResponseEntity<Object> getOneMotorista(@PathVariable(value = "id") UUID id) {
        Optional<MotoristaModel> motorista0 = motoristaRepository.findById(id);
        if (motorista0.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Motorista não encontrado.");
        }
        motorista0.get().add(linkTo(methodOn(UsuarioController.class).getAllMotorista()).withRel("Lista de Motoristas"));
        return ResponseEntity.status(HttpStatus.OK).body(motorista0.get());
    }

    @PutMapping("/motoristas/{id}")
    public ResponseEntity<Object> updateMotorista(@PathVariable(value = "id") UUID id,
                                                @RequestBody @Valid UsuarioDTO usuarioDTO) {
        Optional<MotoristaModel> motorista0 = motoristaRepository.findById(id);
        if(motorista0.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Motorista não encontrado.");
        }
        var motoristaModel = motorista0.get();
        BeanUtils.copyProperties(usuarioDTO, motoristaModel);
        return ResponseEntity.status(HttpStatus.OK).body(motoristaRepository.save(motoristaModel));
    }

    @DeleteMapping("/motoristas/{id}")
    public ResponseEntity<Object> deleteMotorista(@PathVariable(value = "id") UUID id) {
        Optional<MotoristaModel> motorista0 = motoristaRepository.findById(id);
        if (motorista0.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Motorista não encontrado.");
        }
        motoristaRepository.delete(motorista0.get());
        return ResponseEntity.status(HttpStatus.OK).body("Cadastro de Motorista deletado com sucesso.");
    }

    //
    //CRUD Administrador
    @PostMapping("/administradores")
    public ResponseEntity<AdministradorModel> createAdministrador(@RequestBody @Valid UsuarioDTO usuarioDTO) {
        var administradorModel = new AdministradorModel();
        BeanUtils.copyProperties(usuarioDTO, administradorModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(administradorRepository.save(administradorModel));
    }

    @GetMapping("/administradores")
    public ResponseEntity<List<AdministradorModel>> getAllAdministrador() {
        List<AdministradorModel> administradorModelList = administradorRepository.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(administradorModelList);
    }

    @GetMapping("/administradores/{id}")
    public ResponseEntity<Object> getOneAdministrador(@PathVariable(value = "id") UUID id) {
        Optional<AdministradorModel> administrador0 = administradorRepository.findById(id);
        if (administrador0.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Administrador não encontrado.");
        }
        administrador0.get().add(linkTo(methodOn(UsuarioController.class).getAllAdministrador()).withRel("Lista de Administradores"));
        return ResponseEntity.status(HttpStatus.OK).body(administrador0.get());
    }

    @PutMapping("/administradores/{id}")
    public ResponseEntity<Object> updateAdministrador(@PathVariable(value = "id") UUID id,
                                                  @RequestBody @Valid UsuarioDTO usuarioDTO) {
        Optional<AdministradorModel> administrador0 = administradorRepository.findById(id);
        if(administrador0.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Motorista não encontrado..");
        }
        var administradorModel = administrador0.get();
        BeanUtils.copyProperties(usuarioDTO, administradorModel);
        return ResponseEntity.status(HttpStatus.OK).body(administradorRepository.save(administradorModel));
    }

    @DeleteMapping("/administradores/{id}")
    public ResponseEntity<Object> deleteAdministrador(@PathVariable(value = "id") UUID id) {
        Optional<AdministradorModel> administrador0 = administradorRepository.findById(id);
        if (administrador0.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Administrador não encontrado.");
        }
        administradorRepository.delete(administrador0.get());
        return ResponseEntity.status(HttpStatus.OK).body("Cadastro de Administrador deletado com sucesso.");
    }

}
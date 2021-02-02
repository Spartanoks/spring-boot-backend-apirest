package com.springboot.backend.apirest.models.services;

import com.springboot.backend.apirest.models.entity.Usuario;

import org.springframework.transaction.annotation.Transactional;

public interface IUsuarioService {
    
    @Transactional(readOnly = true)
    public Usuario findByUsername(String username);

}
 
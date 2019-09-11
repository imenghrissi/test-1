package com.test.service;

import java.util.Optional;

import com.test.entities.Utilisateur;

public interface UtilisateurService {
    Optional<Utilisateur> findByLogin(String Login);
    Boolean existsByLogin(String Login);
    Boolean existsByEmail(String Mail);
}

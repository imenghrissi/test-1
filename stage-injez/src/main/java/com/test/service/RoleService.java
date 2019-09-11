package com.test.service;

import java.util.Optional;

import com.test.entities.Role;
import com.test.entities.RoleName;

public interface RoleService {
    Optional<Role> findByName(RoleName roleName);


}

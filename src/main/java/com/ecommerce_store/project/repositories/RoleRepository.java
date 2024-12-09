package com.ecommerce_store.project.repositories;

import com.ecommerce_store.project.model.AppRole;
import com.ecommerce_store.project.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
   Optional<Role> findByRoleName(AppRole appRole);
}

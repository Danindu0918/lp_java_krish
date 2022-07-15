package com.clientv1.amnclientv1.security.repository;

import com.clientv1.amnclientv1.security.model.ERole;
import com.clientv1.amnclientv1.security.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Optional<Role> findByName(ERole name);
}

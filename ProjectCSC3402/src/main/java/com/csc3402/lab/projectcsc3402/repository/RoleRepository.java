package com.csc3402.lab.projectcsc3402.repository;

import com.csc3402.lab.projectcsc3402.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}

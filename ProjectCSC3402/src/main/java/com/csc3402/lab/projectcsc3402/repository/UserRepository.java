package com.csc3402.lab.projectcsc3402.repository;

import com.csc3402.lab.projectcsc3402.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}

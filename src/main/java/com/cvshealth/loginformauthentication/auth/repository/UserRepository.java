package com.cvshealth.loginformauthentication.auth.repository;

import com.cvshealth.loginformauthentication.auth.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository {
    User findByUsername(String username);
}

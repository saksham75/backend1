package com.blogs.login.repository;

import com.blogs.login.model.login;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface loginRepository extends JpaRepository<login,String> {

    login findByUsername(String username);
    login findByUsernameAndPassword(String username, String password);

}

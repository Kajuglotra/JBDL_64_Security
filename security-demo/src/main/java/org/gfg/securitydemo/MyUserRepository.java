package org.gfg.securitydemo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MyUserRepository extends JpaRepository<MyUser , Integer> {

    MyUser findByUsername(String username);
}

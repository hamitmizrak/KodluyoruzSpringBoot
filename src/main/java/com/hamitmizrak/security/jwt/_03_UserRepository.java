package com.hamitmizrak.security.jwt;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface _03_UserRepository extends CrudRepository<_02_UserEntity,Long> {
    _02_UserEntity findByUsername(String username);
}

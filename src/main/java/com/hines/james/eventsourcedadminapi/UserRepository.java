package com.hines.james.eventsourcedadminapi;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;

@RestResource(path="users", rel="users")
public interface UserRepository extends CrudRepository<User, Long>{
    User findByEmail(@Param("email") String email);
}

package com.mrdenis.bugtracker.repositories;

import com.mrdenis.bugtracker.domain.Project;
import com.mrdenis.bugtracker.domain.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository <User, Long> {

    Optional<User> findByUsername(String username);
}

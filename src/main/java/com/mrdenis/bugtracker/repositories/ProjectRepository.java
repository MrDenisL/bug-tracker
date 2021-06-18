package com.mrdenis.bugtracker.repositories;

import com.mrdenis.bugtracker.domain.Project;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ProjectRepository extends CrudRepository <Project, Long> {

    Optional<Project> findByTitle(String title);
}

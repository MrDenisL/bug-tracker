package com.mrdenis.bugtracker.repositories;

import com.mrdenis.bugtracker.domain.Issue;
import org.springframework.data.repository.CrudRepository;

public interface IssueRepository extends CrudRepository<Issue, Long> {

}

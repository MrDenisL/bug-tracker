package com.mrdenis.bugtracker.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String boardName;
    private String description;

    @OneToMany(mappedBy = "project")
    private Set<Issue> issues = new HashSet<>();

}

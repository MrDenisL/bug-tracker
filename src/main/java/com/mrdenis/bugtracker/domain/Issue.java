package com.mrdenis.bugtracker.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
public class Issue {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String comment;

    @ManyToMany(mappedBy = "issues")
    private Set<User> assignees = new HashSet<>();

    @ManyToMany(mappedBy = "issues")
    private Set<Label> labels = new HashSet<>();

    @ManyToOne
    private Project project;

    @OneToMany(mappedBy = "issues")
    private Set<Milestones> milestones = new HashSet<>();
}

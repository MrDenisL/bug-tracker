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
    private String Title;
    private String Comment;
    @ManyToMany
    private Set<User> assignees = new HashSet<>();
    private String Label;
    @ManyToOne
    private Project project;



}

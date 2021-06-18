package com.mrdenis.bugtracker.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
public class Label {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String label;

    @ManyToMany
    @JoinTable(
            name = "label_issue",
            joinColumns = {@JoinColumn(name = "label_id")},
            inverseJoinColumns = { @JoinColumn(name = "issue_id")}
    )
    private Set<Issue> issues = new HashSet<>();

    @OneToMany(mappedBy = "label")
    private Set<Milestones> milestones = new HashSet<>();

}

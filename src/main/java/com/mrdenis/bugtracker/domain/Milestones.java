package com.mrdenis.bugtracker.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Milestones {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @ManyToOne
    private Issue issue;

    @ManyToOne
    private Label label;

}

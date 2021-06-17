package com.mrdenis.bugtracker.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Milestones {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;

}

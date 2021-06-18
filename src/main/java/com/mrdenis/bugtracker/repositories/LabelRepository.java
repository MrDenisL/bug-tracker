package com.mrdenis.bugtracker.repositories;

import com.mrdenis.bugtracker.domain.Label;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface LabelRepository extends CrudRepository <Label, Long> {

    Optional <Label> findByLabel(String label);
}

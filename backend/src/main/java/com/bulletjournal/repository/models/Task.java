package com.bulletjournal.repository.models;

import javax.persistence.*;

/**
 * This class is for ProjectType.TODO
 * {@link ProjectItemModel#owner} is "assigned to"
 */
@Entity
@Table(name = "tasks")
public class Task extends ProjectItemModel {
    @Id
    @GeneratedValue(generator = "task_generator")
    @SequenceGenerator(
            name = "task_generator",
            sequenceName = "task_sequence"
    )
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

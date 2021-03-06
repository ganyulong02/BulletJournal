package com.bulletjournal.repository.models;

import javax.persistence.*;

/**
 * This class is for ProjectType.NOTE
 * {@link ProjectItemModel#owner} is null
 */
@Entity
@Table(name = "notes")
public class Note extends ProjectItemModel {
    @Id
    @GeneratedValue(generator = "note_generator")
    @SequenceGenerator(
            name = "note_generator",
            sequenceName = "note_sequence"
    )
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

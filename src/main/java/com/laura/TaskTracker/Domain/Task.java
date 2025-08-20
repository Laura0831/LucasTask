package com.laura.TaskTracker.Domain;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "tasks")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    //allows you to specify conditiones for the id (an id will never be updated or have a null value)
    @Column(name = "id", updatable = false, nullable = false)
    private UUID id;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "title")
    private String description;
}

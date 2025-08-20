package com.laura.TaskTracker.Domain;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "tasks")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
}

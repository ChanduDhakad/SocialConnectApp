package com.masai.model;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Integer userId;

    @NotEmpty
    @Size(max = 50)
    @Column(unique = true, nullable = false)
    private String username;

    @NotEmpty
    @Size(max = 50)
    @Column(nullable = false)
    private String displayName;

    @NotEmpty
    @Email
    @Size(max = 255)
    @Column(nullable = false)
    private String email;

    @NotEmpty
    @Column(name = "password_hash", nullable = false)
    private String passwordHash;

    @Size(max = 200)
    private String bio;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    // Constructors, getters, setters, and other methods
}


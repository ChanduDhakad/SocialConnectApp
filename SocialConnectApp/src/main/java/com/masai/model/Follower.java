package com.masai.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "followers")
public class Follower {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "follower_id")
    private Integer followerId;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "follower_user_id", nullable = false)
    private User followerUser;

    // Constructors, getters, setters, and other methods
}

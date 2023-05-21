package com.masai.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "retweets")
public class Retweet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "retweet_id")
    private Integer retweetId;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "tweet_id", nullable = false)
    private Tweet tweet;

    // Constructors, getters, setters, and other methods
}

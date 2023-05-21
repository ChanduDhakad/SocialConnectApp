package com.masai.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

@Entity
@Table(name = "tweets")
public class Tweet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tweet_id")
    private Integer tweetId;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @NotEmpty
    @Size(max = 280)
    @Column(nullable = false)
    private String content;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    // Constructors, getters, setters, and other methods
}

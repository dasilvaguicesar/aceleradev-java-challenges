package com.challenge.entity;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;
import java.util.List;

@EntityListeners({AuditingEntityListener.class})
@Entity
public class Acceleration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotBlank
    @NotNull
    @Column(length = 100)
    @Size(max = 100)
    private String name;

    @NotBlank
    @NotNull
    @Column(length = 50)
    @Size(max = 50)
    private String slug;

    @NotBlank
    @NotNull
    @CreatedDate
    private LocalDateTime createdAt;

    @OneToMany
    private List<Candidate> candidate;

    @ManyToOne
    private Challenge challenge;
}

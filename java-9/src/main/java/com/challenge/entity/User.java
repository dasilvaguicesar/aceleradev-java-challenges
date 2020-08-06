package com.challenge.entity;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;
import java.util.List;

@EntityListeners({AuditingEntityListener.class})
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotBlank
    @NotNull
    @Size(max = 100)
    private String fullName;

    @NotBlank
    @NotNull
    @Column(name = "email", length = 100)
    @Size(max = 100)
    @Email
    private String email;

    @NotBlank
    @NotNull
    @Column(length = 50)
    @Size(max = 50)
    private String nickname;

    @NotBlank
    @NotNull
    @Column(length = 255)
    @Size(max = 255)
    private String password;

    @NotBlank
    @NotNull
    @CreatedDate
    private LocalDateTime createdAt;

    @OneToMany
    private List<Candidate> cadidate;

    @OneToMany
    private List<Submission> submissions;

}

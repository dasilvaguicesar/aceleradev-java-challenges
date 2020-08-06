package com.challenge.entity;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@EntityListeners({AuditingEntityListener.class})
@Entity
public class Candidate {

    @EmbeddedId
    private CandidateId candidateId;

    @NotBlank
    @NotNull
    private int status;

    @NotBlank
    @NotNull
    @CreatedDate
    private LocalDateTime createdAt;

}

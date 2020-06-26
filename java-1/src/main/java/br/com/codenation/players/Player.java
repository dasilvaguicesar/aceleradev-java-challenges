package br.com.codenation.players;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Player {

  private long id;
  private long teamId;
  private String name;
  private LocalDate creationDate;
  private Integer skillLevel;
  private BigDecimal salary;

  public Player(long id, long teamId, String name, LocalDate creationDate, Integer skillLevel, BigDecimal salary) {
    this.id = id;
    this.teamId = teamId;
    this.name = name;
    this.creationDate = creationDate;
    this.skillLevel = skillLevel;
    this.salary = salary;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getTeamId() {
    return teamId;
  }

  public void setTeamId(long teamId) {
    this.teamId = teamId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LocalDate getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(LocalDate creationDate) {
    this.creationDate = creationDate;
  }

  public Integer getSkillLevel() {
    return skillLevel;
  }

  public void setSkillLevel(Integer skillLevel) {
    this.skillLevel = skillLevel;
  }

  public BigDecimal getSalary() {
    return salary;
  }

  public void setSalary(BigDecimal salary) {
    this.salary = salary;
  }
}

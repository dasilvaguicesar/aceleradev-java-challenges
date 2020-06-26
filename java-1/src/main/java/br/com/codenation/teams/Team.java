package br.com.codenation.teams;

import java.time.LocalDate;

public class Team{

    private long id;
    private String name;
    private LocalDate creationDate;
    private String mainUniformColor;
    private String secundaryUniformColor;
    private long captain;

    public Team(long id, String name, LocalDate creationDate, String mainUniformColor, String secundaryUniformColor) {
        this.id = id;
        this.name = name;
        this.creationDate = creationDate;
        this.mainUniformColor = mainUniformColor;
        this.secundaryUniformColor = secundaryUniformColor;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public String getMainUniformColor() {
        return mainUniformColor;
    }

    public void setMainUniformColor(String mainUniformColor) {
        this.mainUniformColor = mainUniformColor;
    }

    public String getSecundaryUniformColor() {
        return secundaryUniformColor;
    }

    public void setSecundaryUniformColor(String secundaryUniformColor) {
        this.secundaryUniformColor = secundaryUniformColor;
    }

    public long getCaptain() {
        return captain;
    }

    public void setCaptain(long captain) {
        this.captain = captain;
    }
}

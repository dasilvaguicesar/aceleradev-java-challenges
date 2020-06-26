package br.com.codenation.repositories;

import br.com.codenation.teams.Team;

import java.util.ArrayList;
import java.util.List;

public class TeamsRepositories {

    private List<Team> teams = new ArrayList<>();

    public void add(Team team){
        this.teams.add(team);
    }

    public void delete(Team team){
        this.teams.add(team);
    }


    public void defineCaptain(Long playerId, Long teamId){
        for (Team team: teams) {
            if(team.getId() == teamId){
                team.setCaptain(playerId);
            }
        }
    }

    public Long discoverCaptain(Long idTime){
        for (Team team: teams)
            if (team.getId() == idTime) {
                return team.getCaptain();
            }
        System.out.println("Time não encontrado");
        return null;
    }

    public String discoverTeamName(Long idTime) {
        for (Team team: teams)
            if (team.getId() == idTime) {
                return team.getName();
            }
        System.out.println("Time não encontrado");
        return null;
    }

}

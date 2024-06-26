package htw.berlin.webtech.teambackend.web.api;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String tactic;
    private String formation;

    @ElementCollection
    private List<String> players;

    public Team(String tactic, String formation, List<String> players) {
        this.tactic = tactic;
        this.formation = formation;
        this.players = players;
    }

    public Team() {

    }

    public String getTactic() {
        return tactic;
    }

    public String getFormation() {
        return formation;
    }

    public List<String> getPlayers() {
        return players;
    }

    public void setTactic(String tactic) {
        this.tactic = tactic;
    }

    public void setFormation(String formation) {
        this.formation = formation;
    }

    public void setPlayers(List<String> players) {
        this.players = players;
    }
}





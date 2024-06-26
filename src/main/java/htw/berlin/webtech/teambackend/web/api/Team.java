package htw.berlin.webtech.teambackend.web.api;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;  // This will be the auto-generated ID

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
        // Constructor for JPA
    }

    // Standard getters and setters for all fields
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTactic() {
        return tactic;
    }

    public void setTactic(String tactic) {
        this.tactic = tactic;
    }

    public String getFormation() {
        return formation;
    }

    public void setFormation(String formation) {
        this.formation = formation;
    }

    public List<String> getPlayers() {
        return players;
    }

    public void setPlayers(List<String> players) {
        this.players = players;
    }
}

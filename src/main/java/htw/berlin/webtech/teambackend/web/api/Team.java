package htw.berlin.webtech.teambackend.web.api;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@Entity
public class Team {
    // Standard getters and setters for all fields
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

}

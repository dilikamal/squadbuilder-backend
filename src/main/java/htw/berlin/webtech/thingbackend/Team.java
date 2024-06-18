package htw.berlin.webtech.thingbackend;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String tactic;
    private String formation;
    private String players;

    public Team() {}

    public Team(String tactic, String formation, String players) {
        this.tactic = tactic;
        this.formation = formation;
        this.players = players;
    }

    public String getTactic() {
        return tactic;
    }

    public String getFormation() {
        return formation;
    }

    public String getPlayers() {
        return players;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Team team)) return false;

        if (getTactic() != team.getTactic()) return false;
        if (getFormation() != null ? !getFormation().equals(team.getFormation()) : team.getFormation() != null) return false;
        return getPlayers() != null ? getPlayers().equals(team.getPlayers()) : team.getPlayers() == null;
    }

    @Override
    public int hashCode() {
        int result = getTactic() != null ? getTactic().hashCode() : 0;
        result = 31 * result + (getFormation() != null ? getFormation().hashCode() : 0);
        result = Integer.parseInt(31 * result + getPlayers());
        return result;
    }

    @Override
    public String toString() {
        return "Team{" +
                "Tactic=" + tactic +
                ", Formation='" + formation + '\'' +
                ", Players=" + players +
                '}';
    }
}

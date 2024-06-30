package htw.berlin.webtech.teambackend.web;

import htw.berlin.webtech.teambackend.web.api.Team;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class TeamService {

    private final List<Team> teams = new ArrayList<>();
    private final AtomicLong idGenerator = new AtomicLong();

    // Get all teams
    public List<Team> getAllTeams() {
        return new ArrayList<>(teams);
    }

    // Create a new team
    public Team createTeam(Team team) {
        team.setId(idGenerator.incrementAndGet());
        teams.add(team);
        return team;
    }

    // Get a team by ID
    public Optional<Team> getTeamById(Long id) {
        return teams.stream().filter(team -> team.getId().equals(id)).findFirst();
    }

    // Delete a team by ID
    public boolean deleteTeam(Long id) {
        return teams.removeIf(team -> team.getId().equals(id));
    }
}

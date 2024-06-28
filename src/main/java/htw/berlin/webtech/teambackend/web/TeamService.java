package htw.berlin.webtech.teambackend.web;

import htw.berlin.webtech.teambackend.web.api.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TeamService {

    @Autowired
    static TeamRepository repo;

    public static Team save(Team team) {
        return repo.save(team);
    }

    public Team get(Long id) {
        return repo.findById(id).orElseThrow(RuntimeException::new);
    }

    public static List<Team> getAllTeams() {
        List<Team> teams = new ArrayList<>();
        repo.findAll().forEach(teams::add);
        return teams;
    }

    public void deleteTeam(Long id) {
        repo.deleteById(id);
    }
}

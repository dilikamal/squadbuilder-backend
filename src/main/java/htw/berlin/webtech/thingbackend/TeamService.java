package htw.berlin.webtech.thingbackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TeamService {

    @Autowired
    TeamRepository repo;

    public Team save(Team team) {
        return repo.save(team);
    }

    public Team get(Long id) {
        return repo.findById(id).orElseThrow(RuntimeException::new);
    }


    public List<Team> getAllTeams() {
        List<Team> teams = new ArrayList<>();
        repo.findAll().forEach(teams::add);
        return teams;
    }

}

package htw.berlin.webtech.teambackend.web;

import ch.qos.logback.core.model.Model;
import htw.berlin.webtech.teambackend.web.TeamService;
import htw.berlin.webtech.teambackend.web.api.Team;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class TeamController {

    private final TeamService teamService;

    public TeamController(TeamService teamService) {
        this.teamService = teamService;
    }


    @GetMapping("/teams")
    public List<Team> getTeams() {
        return TeamService.getAllTeams();
    }

    @PostMapping("/team-oa")
    public Team saveTeam(@RequestBody Team team) {
        return TeamService.save(team);
    }

    @DeleteMapping("/teams/{id}")
    public void deleteTeam(@PathVariable Long id) {
        teamService.deleteTeam(id);
    }

}

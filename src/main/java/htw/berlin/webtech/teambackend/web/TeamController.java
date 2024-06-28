package htw.berlin.webtech.teambackend.web;

import htw.berlin.webtech.teambackend.web.TeamService;
import htw.berlin.webtech.teambackend.web.api.Team;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TeamController{

    @Autowired
    private TeamService teamService;

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

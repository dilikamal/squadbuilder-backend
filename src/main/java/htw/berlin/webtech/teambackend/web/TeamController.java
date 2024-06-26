package htw.berlin.webtech.teambackend.web;

import htw.berlin.webtech.teambackend.web.api.Team;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/teams")
public class TeamController {

    private static final Logger LOGGER = LoggerFactory.getLogger(TeamController.class);

    @Autowired
    TeamService teamService;

    @PostMapping
    public Team createTeam(@RequestBody Team team) {
        LOGGER.info("Creating team with tactic: {}, formation: {}, players: {}", team.getTactic(), team.getFormation(), team.getPlayers());
        return teamService.save(team);
    }

    @GetMapping("/{id}")
    public Team getTeam(@PathVariable Long id) {
        LOGGER.info("Getting team with id: {}", id);
        return teamService.get(id);
    }

    @GetMapping
    public Iterable<Team> getAllTeams() {
        LOGGER.info("Getting all teams");
        return teamService.getAllTeams();
    }
}

package htw.berlin.webtech.teambackend.web;

import htw.berlin.webtech.teambackend.web.api.Team;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TeamController {

    @Autowired
    TeamService service;

    Logger logger = LoggerFactory.getLogger(TeamController.class);

    @CrossOrigin
    @PostMapping("/teams")
    public Team createTeams(@RequestBody Team team) {
        return service.save(team);
    }

    @CrossOrigin
    @GetMapping("/teams/{id}")
    public Team getTeam(@PathVariable String id) {
        logger.info("GET request on route teams with {}", id);
        Long teamId = Long.parseLong(id);
        return service.get(teamId);
    }


}

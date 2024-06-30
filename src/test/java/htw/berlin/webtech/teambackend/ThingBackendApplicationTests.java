package htw.berlin.webtech.teambackend;

import htw.berlin.webtech.teambackend.web.TeamService;
import htw.berlin.webtech.teambackend.web.api.Team;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ThingBackendApplicationTests {

	@Test
	public void testCreateTeam() {
		TeamService teamService = new TeamService();
		Team team = new Team("Offensive", "4-3-3", Arrays.asList("Player1", "Player2", "Player3"));

		Team createdTeam = teamService.createTeam(team);

		assertNotNull(createdTeam.getId(), "The created team's ID should not be null");
		assertEquals("Offensive", createdTeam.getTactic(), "The team's tactic should match the input");
		assertEquals("4-3-3", createdTeam.getFormation(), "The team's formation should match the input");
		assertEquals(Arrays.asList("Player1", "Player2", "Player3"), createdTeam.getPlayers(), "The team's players should match the input");
		assertEquals(1, teamService.getAllTeams().size(), "There should be one team in the list");
	}

	@Test
	public void testDeleteTeam() {
		TeamService teamService = new TeamService();
		Team team = new Team("Defensive", "5-4-1", Arrays.asList("Player4", "Player5", "Player6"));
		Team createdTeam = teamService.createTeam(team);
		Long teamId = createdTeam.getId();

		boolean isDeleted = teamService.deleteTeam(teamId);

		assertTrue(isDeleted, "The team should be deleted successfully");
		assertEquals(0, teamService.getAllTeams().size(), "The team list should be empty after deletion");
		assertFalse(teamService.getTeamById(teamId).isPresent(), "The team should not be found by ID after deletion");
	}

}

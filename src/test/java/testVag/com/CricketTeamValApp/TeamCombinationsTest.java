package testVag.com.CricketTeamValApp;

import java.io.FileNotFoundException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

import mapper.JsonMapper;
import model.Team;

public class TeamCombinationsTest {

	static int expectedForeignPlayersCount = 4;
	static int expectedWicketKeeperCount = 1;
	@Test(testName = "Validate the team has 4 foriegn players")
	public static void validateFourForiegnPlayer() {
		// Arrange
		// Load data from JSON
         JsonMapper jm = new JsonMapper();
         Team t =jm.map("resources/team.json",Team.class);
         
        
		// Action - Query number of foreign player in team
         TeamDetails td = new TeamDetails(t);
         int actualForeignPlayersCount = td.getNumOfForiegnPlayersInTeam();

		// Assert - Verify that there are only 4 foreign player in team
         Assert.assertEquals(actualForeignPlayersCount, expectedForeignPlayersCount, "Validation failed for foreign player");
	}

	@Test(testName = "Validate the team has atleast 1 wicket-keeper")
	public static void validateIfWicketKeeperIsPresent() throws JsonSyntaxException, JsonIOException, FileNotFoundException {
		// Arrange
		// Load data from JSON
		
         JsonMapper jm = new JsonMapper();
         Team t =jm.map("resources/team.json",Team.class);
		
		// Action - Query number of wicket-keeper  in team
         TeamDetails td = new TeamDetails(t);
         long actualWicketKeeperCount = td.getNumOfWicketKeeper();

		// Assert - Verify that there is atleast 1 wicket-keeper in team
         Assert.assertEquals(actualWicketKeeperCount, expectedWicketKeeperCount, "Validation failed for Wicket Keeper");
         
	}

}
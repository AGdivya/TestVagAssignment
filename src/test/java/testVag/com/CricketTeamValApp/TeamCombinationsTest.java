package testVag.com.CricketTeamValApp;

import org.testng.annotations.Test;

public class TeamCombinationsTest {

	@Test(testName = "Validate the team has 4 foriegn players")
	public static void validateFourForiegnPlayer() {
		// Arrange
		// Load data from JSON

		// Action - Query number of foreign player in team

		// Assert - Verify that there are only 4 foreign player in team
	}

	@Test(testName = "Validate the team has atleast 1 wicket-keeper")
	public static void validateIfWicketKeeperIsPresent() {
		// Arrange
		// Load data from JSON

		// Action - Query number of wicket-keeper  in team

		// Assert - Verify that there is atleast 1 wicket-keeper in team
	}

}
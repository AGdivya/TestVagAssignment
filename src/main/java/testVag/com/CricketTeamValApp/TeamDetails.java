package testVag.com.CricketTeamValApp;

import java.util.List;

import model.Player;
import model.Team;

public class TeamDetails {

	private Team team;

	public TeamDetails(Team team) {
		this.team = team;
	}

	public int getNumOfForiegnPlayersInTeam() {
		List<Player> listOfPlayers = team.getPlayer();
		int foreignPlayerCount = 0;
		for (int i = 0; i < listOfPlayers.size(); i++) {
			if (!listOfPlayers.get(i).getCountry().equals("India")) {
				foreignPlayerCount++;
			}
		}
		return foreignPlayerCount;

	}

	public long getNumOfWicketKeeper() {

		List<Player> listOfPlayers = team.getPlayer();
		int wicketKeeperCount = 0;
		for (int i = 0; i < listOfPlayers.size(); i++) {
			if (listOfPlayers.get(i).getRole().equals("Wicket-keeper")) {
				wicketKeeperCount++;
			}
		}
		return wicketKeeperCount;
	}

}

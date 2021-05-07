package dice;
import java.util.Random;
public class DiceGame {

	private String Username;
	private int points;
	
	//Sets each of the users names in to their objects.
	public void setUsername(String Username) {
		this.Username = Username;
		
		
	}
	//returns each of the users names when called from Main.
	public String getUsername() {
		return Username;
	}
	//Sets the points for each of the players.
	public void setpoints(int points) {
		this.points = points;
		
	}
	//Returns the points when called from Main.
	public int getpoints() {
		return points;
	}
	
}

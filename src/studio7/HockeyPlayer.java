package studio7;

public class HockeyPlayer {

	private String name;
	private int num;
	private boolean handRight;
	private boolean shootRight;
	private int goals;
	private int assists;
	private int games;

	public HockeyPlayer(String a, int b, boolean c, boolean d, int e, int f, int g) {
		this.name = a;
		this.num = b;
		this.handRight = c;
		this.shootRight = d;
		this.goals = e;
		this.assists = f;
		this.games = g;

	}

	public void setName(String a) {
		this.name = a;
	}

	public void setNum(int b) {
		this.num = b;
	}

	public void setHand(boolean c) {
		this.handRight = c;
	}

	public void setShoot(boolean d) {
		this.shootRight = d;
	}

	public void setGoals(int e) {
		this.goals = e;
	}

	public void setAssists(int f) {
		this.assists = f;
	}

	public void setGames(int g) {
		this.games = g;
	}

	public String getName() {
		return this.name;
	}

	public int getNum() {
		return this.num;
	}

	public boolean getHand() {
		return this.handRight;
	}

	public boolean getShoot() {
		return this.shootRight;
	}

	public int getGoals() {
		return this.goals;
	}

	public int getAssists() {
		return this.assists;
	}

	public int getGames() {
		return this.games;
	}

	public int getPoints() {
		return this.goals + this.assists;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HockeyPlayer Snook = new HockeyPlayer("Snook", 87, true, false, 2, 4, 3);
	}
	public String toString() { 
		return ""; //add all the instance variables like in Rectangle.
	
	}
}

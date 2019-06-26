public class TennisGame2 {
	private int p1Point;
	private int p2Point;

	private String player1Name;
	private String player2Name;

	public TennisGame2(String player1Name, String player2Name) {
		this.player1Name = player1Name;
		this.player2Name = player2Name;
	}

	public String getScore() {
		String[] scoreString = { "Love", "Fifteen", "Thirty", "Forty" };

		// Winner
		if (p1Point >= 4 && p2Point >= 0 && (p1Point - p2Point) >= 2) {
			return "Win for " + player1Name;
		}
		if (p2Point >= 4 && p1Point >= 0 && (p2Point - p1Point) >= 2) {
			return "Win for " + player2Name;
		}

		// Advantage
		if (p1Point > p2Point && p2Point >= 3 && (p1Point - p2Point) == 1) {
			return "Advantage " + player1Name;
		}

		if (p2Point > p1Point && p1Point >= 3 && (p2Point - p1Point) == 1) {
			return "Advantage " + player2Name;
		}

		// Deuce
		if (p1Point == p2Point && p1Point >= 3) {
			return "Deuce";
		}

		// All
		if (p1Point == p2Point && p1Point < 3) {
			return scoreString[p1Point] + "-All";
		}

		// Normal game
		return scoreString[p1Point] + "-" + scoreString[p2Point];
	}

	public void SetP1Score(int number) {

		for (int i = 0; i < number; i++) {
			P1Score();
		}

	}

	public void SetP2Score(int number) {

		for (int i = 0; i < number; i++) {
			P2Score();
		}

	}

	public void P1Score() {
		p1Point++;
	}

	public void P2Score() {
		p2Point++;
	}

	public void wonPoint(String player) {
		if (player == "player1")
			P1Score();
		else
			P2Score();
	}
}

package dataObj;

public class Player {
	private String playerName;
	private Integer cash;
	private Integer deposit;
	private Integer currentPos;
	private Integer playerId;
	
	public Player(String name, Integer id) {
		playerName = name;
		cash = 0;
		deposit = 0;
		playerId = id;
		currentPos = 0;
	}

	public String getPlayerName() {
		return playerName;
	}

	public Integer getCash() {
		return cash;
	}

	public void setCash(Integer cash) {
		this.cash = cash;
	}

	public Integer getDeposit() {
		return deposit;
	}

	public void setDeposit(Integer deposit) {
		this.deposit = deposit;
	}

	public Integer getCurrentPos() {
		return currentPos;
	}

	public void setCurrentPos(Integer currentPos) {
		this.currentPos = currentPos;
	}

	public Integer getPlayerId() {
		return playerId;
	}

	public Integer getTotalProperty() {
		return getCash() + getDeposit();
	}
}

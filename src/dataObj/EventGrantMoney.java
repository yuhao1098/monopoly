package dataObj;

public class EventGrantMoney implements Event{
	private Integer maximumGrantMoney;
	
	public EventGrantMoney(Integer maxGrant) {
		maximumGrantMoney = maxGrant;
	}
	
	@Override
	public void handleEventWithPlayer(Player player) {
		// get money event
		Integer grantMoney = (int)(Math.random() * maximumGrantMoney + 1);
		player.setCash(player.getCash() + grantMoney);
	}

}
